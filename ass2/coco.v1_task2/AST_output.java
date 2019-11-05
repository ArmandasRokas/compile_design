import java.util.*;
abstract class AST{}
abstract class Start extends AST{
	public abstract  String translate()  ;
 };
class StartImpl extends Start { 
	List<DataTypeDef> datatypedefs;

	StartImpl(List<DataTypeDef> datatypedefs){this.datatypedefs=datatypedefs; }
	public  String translate()  {
    String output = "import java.util.*;\nimport java.util.HashMap;\nimport java.util.Map.Entry;\nimport java.util.List;\nimport java.util.ArrayList;\nabstract class AST{}";
    for(DataTypeDef d: datatypedefs){ 
        output += d.translate(); } 
    return output;}
}
abstract class DataTypeDef extends AST{
	public abstract  String translate()  ;
 };
class DataTypeDefImpl extends DataTypeDef { 
	String dataTypeName;
	String functionHead;
	List<Alternative> alternatives;

	DataTypeDefImpl(String dataTypeName , String functionHead , List<Alternative> alternatives){this.dataTypeName=dataTypeName; this.functionHead=functionHead; this.alternatives=alternatives; }
	public  String translate()  {
        String output = "\nabstract class " + dataTypeName + " extends AST{\n" + "\tpublic abstract " + functionHead + " ;\n };";
        for(Alternative a: alternatives){
output += a.translate(this);
        }
        return output;}
}
abstract class Alternative extends AST{
	public abstract  String translate(AST parent) ;
 };
class AlternativeImpl extends Alternative { 
	String constructor;
	List<ArgumentImpl> arguments;
	String code;

	AlternativeImpl(String constructor , List<ArgumentImpl> arguments , String code){this.constructor=constructor; this.arguments=arguments; this.code=code; }
	public  String translate(AST parent) {
        DataTypeDefImpl dataTypeDef = (DataTypeDefImpl) parent;
        char openBracket = '{';
        char closeBracket = '}';
        String output = "\nclass " + constructor + " extends " +dataTypeDef.dataTypeName +" "+ openBracket + " \n";
        for(ArgumentImpl a: arguments){
            output += "\t";
            output += a.translate();
            output += ";\n";
        }
        output += "\n";
        output += "\t"+ constructor + "(" ;
        for(int i = 0; i < arguments.size(); i++){
            output += arguments.get(i).translate();
            if(i < arguments.size() - 1) output += " , ";
        }
        output += ")" + openBracket;
        for(ArgumentImpl a: arguments){
            output+= "this." + a.name + "=" + a.name + "; ";
        }
        output += closeBracket + "\n";
        output += "\tpublic " + dataTypeDef.functionHead + " " + code;
        output += "\n"+ closeBracket ;
	    return output;
}
}
abstract class Argument extends AST{
	public abstract String translate() ;
 };
class ArgumentImpl extends Argument { 
	String type;
	String name;

	ArgumentImpl(String type , String name){this.type=type; this.name=name; }
	public String translate() {String output = ""; return type + " " + name; }
}
