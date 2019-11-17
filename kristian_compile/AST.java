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
}

class Start extends AST{
    public List<DataTypeDef> datatypedefs;
    Start(List<DataTypeDef> datatypedefs){
        this.datatypedefs=datatypedefs;
    }
    public String translate(){
        String s = "";
        for (DataTypeDef dataTypeDef : datatypedefs) {
            s += dataTypeDef.translate();
        }
        return s;
    // return "import java.util.HashMap;\n"+
    //         "import java.util.Map.Entry;\n"+
    //         "import java.util.List;\n"+
    //         "import java.util.ArrayList;\n\n"+
    //         "class faux{ // collection of non-OO auxiliary functions (currently just error)\n"+
    //         "    public static void error(String msg){\n"+
    //         "    System.err.println(\"Interpreter error: \"+msg);\n"+
    //         "    System.exit(-1);\n"+
    //         "    }\n"+
    //         "}\n\n"+
    //         "abstract class AST{\n}"+
    //         s;
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
        if (dataTypeName.equals("AST") ) 
        return functionHead;
            // return alternatives.get(0).code;
            //return dataTypeName; 
        if (alternatives.size() == 1 && dataTypeName.equals(alternatives.get(0).constructor)) 
            return alternatives.get(0).translate("AST", functionHead);
        String s = "";
        for (Alternative alternative : alternatives) {
            s += alternative.translate(dataTypeName, functionHead);
        }
        return "\n\n" +
            "public abstract class " + dataTypeName + " extends AST{\n"+
            "    abstract" + functionHead +";\n"+
            "}" +
            s;
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
    public String translate(String ancestor, String functionHead){
        String args = "";
        String members = "";
        String conscode = "";
        for (Argument argument : arguments) {
            if (args.length() > 0) args += ", ";
            args +=  argument.type + " " + argument.name;
            members  += "    public " + argument.type + " " + argument.name + ";\n";
            conscode += "        this." + argument.name + "=" + argument.name + ";\n";
        }
        return "\n\n" +
            "class " + constructor + " extends "+ ancestor + "{\n"+
            members +
            "    " + constructor +"(" + args + "){\n"+
            conscode +
            "    }\n"+
            "    public " + functionHead +
            code +"\n"+
            "}";
    }
}

class Argument extends AST{
    public String type;
    public String name;
    Argument(String type, String name){
        this.type=type; 
        this.name=name;
    }
    public String translate(){
        return "argument ";
    }
}
