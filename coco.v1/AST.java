import java.util.HashMap;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;

class faux{ // collection of non-OO auxiliary functions (currently just error)
    public static void error(String msg){
	System.err.println("Interpreter error: "+msg);
	System.exit(-1);
    }
}

abstract class AST{
    //public abstract String translate();
}

class Start extends AST{
    public List<DataTypeDef> datatypedefs;
    
    Start(List<DataTypeDef> datatypedefs){
	    this.datatypedefs=datatypedefs;
    }

    public String translate(){
        String output = "import java.util.*;\nabstract class AST{}";
        for(DataTypeDef d: datatypedefs){
            output += d.translate();
        }
	    return output;
	// You may start here by replacing this with something else
    }
}

class DataTypeDef extends AST{
    public String dataTypeName;
    public String functionHead;
    public List<Alternative> alternatives;

    DataTypeDef(String dataTypeName, String functionHead, List<Alternative> alternatives){
	    this.dataTypeName=dataTypeName;
	    this.functionHead=functionHead;
	    this.alternatives=alternatives;
    }

    public String translate(){
        String output = "\nabstract class " + dataTypeName + " extends AST{\n" +
                "\tpublic abstract " + functionHead + " ;\n };";
        
        for(Alternative a: alternatives){
            //output += a.translate(dataTypeName, functionHead);
            output += a.translate(this);
        }
	    return output;
	    // You may start here by replacing this with something else
    }
}

class Alternative extends AST{
    public String constructor;
    public List<Argument> arguments;
    public String code;

    Alternative(String constructor, List<Argument> arguments,  String code){
	this.constructor=constructor;
	this.arguments=arguments;
	this.code=code;
    }

    //public String translate(String dataTypeName, String functionHead){
    public String translate(AST parent){
        DataTypeDef dataTypeDef = (DataTypeDef) parent;
        String output = "\nclass " + constructor + " extends " +dataTypeDef.dataTypeName +" {\n";
        for(Argument a: arguments){
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
        output += "){";
        for(Argument a: arguments){
            output+= "this." + a.name + "=" + a.name + "; ";
        }
        output += "}\n";
        output += "\tpublic " + dataTypeDef.functionHead + " " + code;
        output += "\n}" ;
	    return output;
    }
}

class Argument extends AST{
    public String type;
    public String name;
    Argument(String type, String name){this.type=type; this.name=name;}
    public String translate(){
	    return type + " " + name;
	// You may start here by replacing this with something else
    }
}
