import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;


class Environment {
    private HashMap<String,Value> variableValues = new HashMap<String,Value>();
    public Environment() { }	
    public void setVariable(String name, Value value) {
	variableValues.put(name, value);
    }
    
    public Value getVariable(String name){
	Value value = variableValues.get(name); 
	if (value == null) faux.error("Variable not defined: "+name); 
	return value;
    }
}

// Implementing the ftable of Mogensen's book

class FunEnvironment{
    private HashMap<String,Fun> funDefs = new HashMap<String,Fun>();
    public FunEnvironment() { }	
    public void setFunction(String name, Fun f) {
	funDefs.put(name, f);
    }    
    public Fun getFunction(String name){
	Fun f = funDefs.get(name); 
	if (f == null) faux.error("Function not defined: "+name); 
	return f;
    }
}

enum Type{
    INTTYPE, BOOLTYPE  
}

class faux{ // collection of non-OO auxiliary functions (currently just error)
    public static void error(String msg){
	System.err.println("Interpreter error: "+msg);
	System.exit(-1);
    }
}
abstract class AST{}
abstract class FunAbstract extends AST{
	public abstract  Value eval(Environment env, FunEnvironment fenv)  ;
 };
class Fun extends FunAbstract { 
	TypeID typeid;
	List<TypeID> parameters;
	Expr e;

	Fun(TypeID typeid , List<TypeID> parameters , Expr e){this.typeid=typeid; this.parameters=parameters; this.e=e; }
	public  Value eval(Environment env, FunEnvironment fenv)  { faux.error("Fun.eval should not be called!"); return null;}
}
abstract class ValueAbstract extends AST{
	public abstract  String toString()  ;
 };
class Value extends ValueAbstract { 
	Type valuetype;
	int value;

	Value(Type valuetype , int value){this.valuetype=valuetype; this.value=value; }
	public  String toString()  { 	if (valuetype==Type.BOOLTYPE){
	                                    if (value==0) return "False";
	                                            return "True";
	                                    }       
	                                    return ""+value; }
}
abstract class TypeIDAbstract extends AST{
	public abstract Value eval(Environment env, FunEnvironment fenv) ;
 };
class TypeID extends TypeIDAbstract { 
	Type valuetype;
	String ident;

	TypeID(Type valuetype , String ident){this.valuetype=valuetype; this.ident=ident; }
	public Value eval(Environment env, FunEnvironment fenv) { 
                                    	faux.error("TypeID.eval should not be called!");
	                            return null;
                                    }
}
abstract class StartAbstract extends AST{
	public abstract  Value eval(Environment env, FunEnvironment fenv)  ;
 };
class Start extends StartAbstract { 
	List<Fun> funs;
	Expr e;

	Start(List<Fun> funs , Expr e){this.funs=funs; this.e=e; }
	public  Value eval(Environment env, FunEnvironment fenv)  {	for(Fun f: funs){
	                        fenv.setFunction(f.typeid.ident,f);
	                            }           
	                            return e.eval(env,fenv);}
}
abstract class Expr extends AST{
	public abstract Value eval(Environment env, FunEnvironment fenv) ;
 };
class Constant extends Expr { 
	Value v;

	Constant(Value v){this.v=v; }
	public Value eval(Environment env, FunEnvironment fenv) {return v;}
}
class Variable extends Expr { 
	String varname;

	Variable(String varname){this.varname=varname; }
	public Value eval(Environment env, FunEnvironment fenv) {return env.getVariable(varname);}
}
class Addition extends Expr { 
	Expr e1;
	Expr e2;

	Addition(Expr e1 , Expr e2){this.e1=e1; this.e2=e2; }
	public Value eval(Environment env, FunEnvironment fenv) {Value v1=e1.eval(env,fenv);
	Value v2=e2.eval(env,fenv);
	if (v1.valuetype!=Type.INTTYPE || v2.valuetype!=Type.INTTYPE)
	    faux.error("Type mistake.\n");
	return new Value(Type.INTTYPE,v1.value+v2.value);}
}
class Multiplication extends Expr { 
	Expr e1;
	Expr e2;

	Multiplication(Expr e1 , Expr e2){this.e1=e1; this.e2=e2; }
	public Value eval(Environment env, FunEnvironment fenv) {Value v1=e1.eval(env,fenv);
	Value v2=e2.eval(env,fenv);
	if (v1.valuetype!=Type.INTTYPE || v2.valuetype!=Type.INTTYPE)
	    faux.error("Type mistake.\n");
	return new Value(Type.INTTYPE,v1.value*v2.value);}
}
class Comparison extends Expr { 
	Expr e1;
	Expr e2;

	Comparison(Expr e1 , Expr e2){this.e1=e1; this.e2=e2; }
	public Value eval(Environment env, FunEnvironment fenv) { 	Value v1=e1.eval(env,fenv);
	Value v2=e2.eval(env,fenv);
	if (v1.valuetype!=v2.valuetype)
	    faux.error("Type mistake.\n");
	if (v1.value==v2.value)
	    return new Value(Type.BOOLTYPE,1);
	else
	    return new Value(Type.BOOLTYPE,0);
    }
}
class Conditional extends Expr { 
	Expr cond;
	Expr e1;
	Expr e2;

	Conditional(Expr cond , Expr e1 , Expr e2){this.cond=cond; this.e1=e1; this.e2=e2; }
	public Value eval(Environment env, FunEnvironment fenv) {
    Value c=cond.eval(env,fenv);
	if (c.valuetype!=Type.BOOLTYPE)
	    faux.error("Condition is not a bool!\n");
	if (c.value==1)
	    return e1.eval(env,fenv);
	else
	    return e2.eval(env,fenv);
}
}
class FunctionCall extends Expr { 
	String fname;
	List<Expr> parameters;

	FunctionCall(String fname , List<Expr> parameters){this.fname=fname; this.parameters=parameters; }
	public Value eval(Environment env, FunEnvironment fenv) {
Fun fundef=fenv.getFunction(fname);
	if (parameters.size()!=fundef.parameters.size()){
	    faux.error("Wrong number of parameters\n");
	}
	Environment newenv=new Environment();
	for(int i=0; i<parameters.size(); i++){
	    Value v=parameters.get(i).eval(env,fenv);
	    if (v.valuetype!= fundef.parameters.get(i).valuetype)
		faux.error("Wrong type in argument\n");
	    newenv.setVariable( fundef.parameters.get(i).ident , v);
	}
	return fundef.e.eval(newenv,fenv);
}
}
