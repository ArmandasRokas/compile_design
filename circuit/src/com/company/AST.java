package com.company;

import java.util.ArrayList;
import java.util.List;
class Environment{
    private List<String> l = new ArrayList<String>();
    public void setVariable(String s){
        l.add(s);
    }
    public boolean isDefined(String s){
        return l.contains(s);
    }
}

abstract class Circuit {
    //public static List<String> env = new ArrayList<>();
    abstract public String compile(Environment env);
}

class Constant extends Circuit{
    public boolean b;
    Constant(boolean b){this.b = b;}
    public String compile(Environment env){
        if (b)
            return "true";
        return "false";
    }
}
class And extends Circuit{
    public Circuit c1;
    public Circuit c2;

    public And(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public String compile(Environment env){
        return "( " + c1.compile(env) + " && " + c2.compile(env) + " ) ";
    }
}
class Or extends Circuit{
    public Circuit c1;
    public Circuit c2;

    public Or(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public String compile(Environment env){
        return "( " + c1.compile(env) + " || " + c2.compile(env) + " ) ";
    }
}
class Not extends Circuit{
    public Circuit c;

    public Not(Circuit c) {
        this.c = c;
    }

    public String compile(Environment env){
        return "!(" + c.compile(env) + ")";
    }
}
class NamedInput extends Circuit{
    public String s;

    public NamedInput(String s) {
        this.s = s;
    }

    public String compile(Environment env){
        if(env.isDefined(s)){
            return s;
        } else {
            System.out.println("Error. NamedInput " + s + " is not defined");
            System.exit(-1);
            return null;
        }
    }
}

class NamedOutput extends Circuit{
    public String s;
    public Circuit c;

    public NamedOutput(String s, Circuit c) {
        this.s = s;
        this.c = c;
    }

    public String compile(Environment env){
        return "boolean " + s + "=" +c.compile(env) +";";
    }
}
class Hardware extends Circuit{
    public List<NamedOutput> l;

    Hardware(List<NamedOutput> l){this.l=l;}
    public String compile(Environment env){
        String output = "";
        for(NamedOutput no: l){
            output += no.compile(env)  + "\n";
            env.setVariable(no.s);
        }
        return output;
    }
}

