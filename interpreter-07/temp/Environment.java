import java.util.HashMap;
import java.util.Map.Entry;
import java.util.List;
import java.util.ArrayList;

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
