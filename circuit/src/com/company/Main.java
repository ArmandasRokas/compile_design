package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<NamedOutput> l = new ArrayList<>();
        l.add(new NamedOutput("x", new Constant(true)));
        //l.add(new NamedOutput("y", new And(new Or(new NamedInput("x"),new Constant(false)), new Constant(true))));
        l.add(new NamedOutput("y", new And(new NamedInput("x"), new NamedInput("y")))); // should give error
        Hardware h = new Hardware(l);
        System.out.println(h.compile(new Environment()));
    }
}
