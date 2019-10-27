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
    abstract public Value eval(Environment env, FunEnvironment fenv);
    abstract public Type check(Environment env, FunEnvironment fenv);
}

enum Type{
    INTTYPE, BOOLTYPE, FLOATTYPE  
}

class Value {
    public Type valuetype;
    public int value; // for simplicity, we just implement it as an int anyway...
    public double double_value;
    Value(Type valuetype, int value){this.valuetype=valuetype; this.value=value;}
    Value(Type valuetype, double value){this.valuetype=valuetype; this.double_value=value;}
    public boolean toBool(){ return value!=0; }
    public String toString(){
	if (valuetype==Type.BOOLTYPE){
	    if (value==0) return "False";
	    return "True";
	} else if(valuetype==Type.FLOATTYPE){ // ***modified***
        return ""+double_value;    
    }
	return ""+value;
    }
}

class TypeID extends AST{
    public Type valuetype;
    public String ident;
    TypeID(Type valuetype, String ident){this.valuetype=valuetype; this.ident=ident;}
    public Value eval(Environment env, FunEnvironment fenv){
	faux.error("TypeID.eval should not be called!");
	return null;
    }
    public Type check(Environment env, FunEnvironment fenv){
	return null;
    }
}

class Fun extends AST{
    public TypeID typeid; // function name and return type 
    public List<TypeID> parameters;
    public Expr e; // the body of the function
    Fun(TypeID typeid, List<TypeID> parameters, Expr e){
	this.typeid=typeid; this.parameters=parameters; this.e=e; }
    
    public Value eval(Environment env, FunEnvironment fenv){
	    faux.error("Fun.eval should not be called!");
	    return null;
    }
    public Type check(Environment env, FunEnvironment fenv){
	Environment newenv = new Environment();
	for (TypeID t: parameters){
	    newenv.setVariable(t.ident,new Value(t.valuetype,42));
	}
	Type t=e.check(newenv,fenv);
	if(t == null){
		faux.error(String.format("Function id: %s \n", typeid.ident));
	}
	if (t!=typeid.valuetype)
	    faux.error("Wrong return type in function "+typeid.ident);
	return t;
    }
}


// Implementing the vtable of Mogensen's book

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
    public Type check(Environment env, FunEnvironment fenv){
	return null;
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

class Start extends AST{
    public List<Fun> funs;
    public Expr e;

    Start(List<Fun> funs, Expr e){ this.funs=funs; this.e=e; }
    
    public Value eval(Environment env, FunEnvironment fenv){
	// Actually, only here we fill the FunEnvironment with functions
	for(Fun f: funs){
	    fenv.setFunction(f.typeid.ident,f);
	}
	return e.eval(env,fenv);
    }
    
    public Type check(Environment env, FunEnvironment fenv){
	for(Fun f: funs){
	    fenv.setFunction(f.typeid.ident,f);
	}
	
	for(Fun f: funs){
	    f.check(env,fenv);
	}

	return e.check(env,fenv);
    }
}

abstract class Expr extends AST{
    // Abstract superclass of the different kinds of expressions
}

class Constant extends Expr{
    public Value v;
    Constant(Value v){ this.v=v; }
    public Value eval(Environment env, FunEnvironment fenv){
	return v;
    }
    public Type check(Environment env, FunEnvironment fenv){
	return v.valuetype; 
    }
}

class Variable extends Expr{
    public String varname;
    Variable(String varname){ this.varname=varname; }
    public Value eval(Environment env, FunEnvironment fenv){
	return env.getVariable(varname);
    }
    public Type check(Environment env, FunEnvironment fenv){
	return env.getVariable(varname).valuetype;
    }
}

class Addition extends Expr{
    public Expr e1,e2;
    Addition(Expr e1, Expr e2){ this.e1=e1; this.e2=e2; }
    
    public Value eval(Environment env, FunEnvironment fenv){
	Value v1=e1.eval(env,fenv);
	Value v2=e2.eval(env,fenv);
    if(v1.valuetype == Type.FLOATTYPE || v2.valuetype == Type.FLOATTYPE){
        return new Value(Type.FLOATTYPE, 
            Double.valueOf(v1.toString()) + Double.valueOf(v2.toString()));
    } else {
        return new Value(Type.INTTYPE,v1.value+v2.value); // TODO The problem is that value for a float is 0 and means to use double_value instead of.
    } 
    }

    public Type check(Environment env, FunEnvironment fenv){
	Type t1=e1.check(env,fenv);
	Type t2=e2.check(env,fenv);
	if (t1==Type.BOOLTYPE || t2==Type.BOOLTYPE){
	    	System.out.println("Type mistake in addition expresion\n");
		return null;
	}
	if (t1==Type.FLOATTYPE || t2==Type.FLOATTYPE){
		return Type.FLOATTYPE;
	}
	return Type.INTTYPE;
    }
}

class Multiplication extends Expr{
    public Expr e1,e2;
    Multiplication(Expr e1, Expr e2){ this.e1=e1; this.e2=e2; }
    
    public Value eval(Environment env, FunEnvironment fenv){
	Value v1=e1.eval(env,fenv);
	Value v2=e2.eval(env,fenv);
	if (v1.valuetype!=Type.INTTYPE || v2.valuetype!=Type.INTTYPE)
	    faux.error("Type mistake.\n");
	return new Value(Type.INTTYPE,v1.value*v2.value);
    } 

    public Type check(Environment env, FunEnvironment fenv){
	Type t1=e1.check(env,fenv);
	Type t2=e2.check(env,fenv);
	if (t1!=Type.INTTYPE || t2!=Type.INTTYPE)
	    faux.error("Type mistake.\n");
	return Type.INTTYPE;
    }
}

class Comparison extends Expr{
    public Expr e1,e2;
    Comparison(Expr e1, Expr e2){ this.e1=e1; this.e2=e2; }
    public Value eval(Environment env, FunEnvironment fenv){
	Value v1=e1.eval(env,fenv);
	Value v2=e2.eval(env,fenv);
	//	if (v1.valuetype!=v2.valuetype)
	//    faux.error("Type mistake.\n");
	if (v1.value==v2.value)
	    return new Value(Type.BOOLTYPE,1);
	else
	    return new Value(Type.BOOLTYPE,0);
    }

    public Type check(Environment env, FunEnvironment fenv){
	Type t1=e1.check(env,fenv);
	Type t2=e2.check(env,fenv);
	if (t1!=t2)
	    faux.error("Type mistake.\n");
	return Type.BOOLTYPE;
    }
}

class Conditional extends Expr{
    public Expr cond, e1, e2;
    Conditional(Expr cond, Expr e1, Expr e2){ this.cond=cond; this.e1=e1; this.e2=e2; }
    public Value eval(Environment env, FunEnvironment fenv){
	Value c=cond.eval(env,fenv);
	//	if (c.valuetype!=Type.BOOLTYPE)
	//    faux.error("Condition is not a bool!\n");
	if (c.value==1)
	    return e1.eval(env,fenv);
	else
	    return e2.eval(env,fenv);
    }
    public Type check(Environment env, FunEnvironment fenv){
	Type t=cond.check(env,fenv);
	if (t!=Type.BOOLTYPE)
	    faux.error("Condition is not a bool!\n");
	Type t1=e1.check(env,fenv);
	Type t2=e2.check(env,fenv);
	if(t1 == null || t2 == null){
		return null;
	}
	if (t1!=t2)
	    faux.error("Condition has different results in then and else...");
	return t1;
    }
}

class FunctionCall extends Expr{
    public String fname;
    public List<Expr> parameters;
    FunctionCall(String fname, List<Expr> parameters){
	this.fname=fname;
	this.parameters=parameters;
    }

    public Value eval(Environment env, FunEnvironment fenv){
	Fun fundef=fenv.getFunction(fname);
	Environment newenv=new Environment();
	for(int i=0; i<parameters.size(); i++){
	    Value v=parameters.get(i).eval(env,fenv);
	    newenv.setVariable( fundef.parameters.get(i).ident , v); // sets "num" variable (if the function signature is getNum(float num)) equals to value passed to the function 
	}
	return fundef.e.eval(newenv,fenv);
    }

    public Type check(Environment env, FunEnvironment fenv){
	Fun fundef=fenv.getFunction(fname);
	if (parameters.size()!=fundef.parameters.size()){
	    faux.error(String.format("Wrong number of parameters in function call: %s \n", fundef.typeid.ident));
	}
	for(int i=0; i<parameters.size(); i++){
	    Type t=parameters.get(i).check(env,fenv); // Calls check in new Constant, if a number is entered
	    if (t!= fundef.parameters.get(i).valuetype)
            if(fundef.parameters.get(i).valuetype == Type.FLOATTYPE 
                &&  t == Type.INTTYPE ){
                parameters.set(i, new Constant(new Value(Type.FLOATTYPE, Double.valueOf(parameters.get(i).eval(env, fenv).toString())))); // type casting. Needs to call .eval on parameters.get(i) in order to get Value, because it is Exp type and Exp do not have Value v.  Only Constant that has it. 
            } else {
                faux.error("Wrong type in an argument in a function: " + fundef.typeid.ident );
            }
			}
	return fundef.typeid.valuetype;
    }
}

