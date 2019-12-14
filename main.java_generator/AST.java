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
   /* public List<DataTypeDef> datatypedefs;
    
    Start(List<DataTypeDef> datatypedefs){
	    this.datatypedefs=datatypedefs;
    }

    public String translate(){
        String output = "import java.util.*;\nabstract class AST{}";
        for(DataTypeDef d: datatypedefs){
            output += d.translate();
        }
	    return output;
    }*/
	public GrammarDef gDef;
	public List<GrammarRule> gRules;
	public Start(GrammarDef gDef, List<GrammarRule> gRules){
		this.gDef = gDef;
		this.gRules = gRules;
	}
	public String translate(){
		String output;
		output = "import org.antlr.v4.runtime.tree.ParseTreeVisitor;\nimport org.antlr.v4.runtime.*;\nimport org.antlr.v4.runtime.tree.*;\nimport org.antlr.v4.runtime.CharStreams;\nimport java.io.IOException;\nimport java.util.List;\nimport java.util.ArrayList;\n\npublic class main {\npublic static void main(String[] args) throws IOException{\nif (args.length!=1) {\nSystem.exit(-1);\n}\nString filename=args[0];\nCharStream input = CharStreams.fromFileName(filename);\n " + gDef.translate() + "Lexer lex = new "+ gDef.translate()+ "Lexer(input);\nCommonTokenStream tokens = new CommonTokenStream(lex);\n " + gDef.translate() + "Parser parser = new "+ gDef.translate() + "Parser(tokens);\nParseTree parseTree = parser.start();\nASTMaker astmaker = new ASTMaker();\nAST ast=astmaker.visit(parseTree);\n}\n}\n class ASTMaker extends AbstractParseTreeVisitor<AST> implements " + gDef.translate()+"Visitor<AST> {\n";
		
		for(GrammarRule g: gRules){

			output +=g.translate(gDef.translate());
		}
		output+= "\n}";
		
		return output;
	}
}

class GrammarDef extends AST{
	public String grammarName;

	GrammarDef(String grammarName){
		this.grammarName = grammarName;
	}
	public String translate(){
		return grammarName;
	}
}
abstract class GrammarRule extends AST{
	public abstract String translate(String gDef);
}

class OneGrammarRule extends GrammarRule{
	public String name = "";
	public OneGrammarRule(String name){
		this.name = name;
	}
	public String translate(String gDef){
			String grammarString = "";
		//	String gTranslate = "";
		//	gTranslate = g.translate();
			grammarString += "public AST visit"+name.substring(0, 1).toUpperCase() +name.substring(1)+"("+gDef+"Parser."+name.substring(0, 1).toUpperCase() +name.substring(1)+"Context ctx){\n\treturn null;//TODO implement m\n};\n\n";
		return grammarString;
	}
}

class MultiGrammarRules extends GrammarRule{
	public List<Alternative> alternatives; 
	public MultiGrammarRules(List<Alternative> alternatives){
		this.alternatives = alternatives;
	}
		public String translate(String gDef){
		String output = "";
		for(Alternative a: alternatives){
			output += "public AST visit"+a.translate().substring(0, 1).toUpperCase() +a.translate().substring(1)+"("+gDef+"Parser."+a.translate().substring(0, 1).toUpperCase() +a.translate().substring(1)+"Context ctx){\n\treturn null;//TODO implement me\n};\n\n";
		}
		return output;
	}
}

class Alternative extends AST{
	public String name;
	public Alternative(String name){
		this.name = name;
	}
	public String translate(){
		return name;
	}
}


/*
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
            output += a.translate(this);
        }
	    return output;
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

    public String translate(AST parent){
        DataTypeDef dataTypeDef = (DataTypeDef) parent;
        char openBracket = '{';
        char closeBracket = '}';
        String output = "\nclass " + constructor + " extends " +dataTypeDef.dataTypeName +" "+ openBracket + " \n";
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
        output += ")" + openBracket;
        for(Argument a: arguments){
            output+= "this." + a.name + "=" + a.name + "; ";
        }
        output += closeBracket + "\n";
        output += "\tpublic " + dataTypeDef.functionHead + " " + code;
        output += "\n"+ closeBracket ;
	    return output;
    }
}

class Argument extends AST{
    public String type;
    public String name;
    Argument(String type, String name){this.type=type; this.name=name;}
    public String translate(){
	    return type + " " + name;
    }
	
}*/
