import java.util.*;
abstract class AST{}
abstract class Start extends AST{
	public abstract  String translate()  ;
 };
class StartImpl extends Start {
	List<DataTypeDef> datatypedefs;

	StartImpl(List<DataTypeDef> datatypedefs){this.datatypedefs=datatypedefs; }
	public  String translate()  {\String output = "import java.util.*;\nimport java.util.HashMap;\naimport java.util.Map.Entry;\nimport\njava.util.List;\nimport java.util.ArrayList;\nabstract class AST{}"; for(DataTypeDef d: datatypedefs){ output += d.translate(); } return output;}
}
abstract class DataTypeDef extends AST{
	public abstract  String translate()  ;
 };
class DataTypeDefImpl extends DataTypeDef {
	String dataTypeName;
	String functionHead;
	List<Alternative> alternatives;

	DataTypeDefImpl(String dataTypeName , String functionHead , List<Alternative> alternatives){this.dataTypeName=dataTypeName; this.functionHead=functionHead; this.alternatives=alternatives; }
	public  String translate()  {  return output;}
}
abstract class Alternative extends AST{
	public abstract  String translate(AST parent) ;
 };
class AlternativeImpl extends Alternative {
	String constructor;
	List<Argument> arguments;
	String code;

	AlternativeImpl(String constructor , List<Argument> arguments , String code){this.constructor=constructor; this.arguments=arguments; this.code=code; }
	public  String translate(AST parent) {retrun output;}
}
abstract class Argument extends AST{
	public abstract String translate() ;
 };
class ArgumentImpl extends Argument {
	String type;
	String name;

	ArgumentImpl(String type , String name){this.type=type; this.name=name; }
	public String translate() {return type + " " + name; }
}
