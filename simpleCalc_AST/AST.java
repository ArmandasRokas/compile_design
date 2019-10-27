import java.util.*;

abstract class AST{
    abstract public Double eval(Environment env);
};

class Start extends AST {
    public List<Assign> as;
    public Expr e;
    Start(List<Assign> as, Expr e){ this.as=as; this.e=e;}
    public Double eval(Environment env){
	for (Assign a:as)
	    a.eval(env);
	return e.eval(env);
    };
}

class Assign extends AST{
    public String variable;
    public Expr e;
    Assign(String variable, Expr e){ this.variable=variable; this.e=e; }
    public Double eval(Environment env){
	env.setVariable(variable,e.eval(env));
	return null;
    }
}

abstract class Expr extends AST{
}

class Multiplication extends Expr{
    public Expr e1;
    public Expr e2;
    Multiplication(Expr e1, Expr e2){ this.e1=e1; this.e2=e2;}
    public Double eval(Environment env){
	return e1.eval(env) * e2.eval(env);
    }
}

class Division extends Expr{
    public Expr e1;
    public Expr e2;
    Division(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}
    public Double eval(Environment env){
        return e1.eval(env) / e2.eval(env);
    }
}

class Addition extends Expr{
    public Expr e1;
    public Expr e2;
    Addition(Expr e1, Expr e2){ this.e1=e1; this.e2=e2;}
    public Double eval(Environment env){
	return e1.eval(env) + e2.eval(env);
    }
}

class Subtraction extends Expr{
    public Expr e1;
    public Expr e2;
    Subtraction(Expr e1, Expr e2){ this.e1=e1; this.e2=e2;}
    public Double eval(Environment env){
	return e1.eval(env) - e2.eval(env);
    }
}

class Constant extends Expr{
    public Double v;
    Constant(Double v){ this.v=v;}
    public Double eval(Environment env){
	return v;
    }

}

class Variable extends Expr{
    public String v;
    Variable(String v){ this.v=v;}
    public Double eval(Environment env){
	return env.getVariable(v);
    }    
}
