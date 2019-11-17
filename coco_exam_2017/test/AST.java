import java.util.*;
abstract class AST{}
abstract class StartAbstract extends AST{
	public abstract Type typecheck() ;
 };
class Start extends StartAbstract { 
	expr e;

	Start(expr e){this.e=e; }
	public Type typecheck() {return e.typecheck();}
}
abstract class expr extends AST{
	public abstract  Type typecheck() ;
 };
class Constant extends expr { 
	Integer v;

	Constant(Integer v){this.v=v; }
	public  Type typecheck() { return Type.INTTYPE; }
}
class Variable extends expr { 
	String name;

	Variable(String name){this.name=name; }
	public  Type typecheck() { return Type.INTTYPE; }
}
class Multiplication extends expr { 
	expr e1;
	expr e2;

	Multiplication(expr e1 , expr e2){this.e1=e1; this.e2=e2; }
	public  Type typecheck() { 
                 Type t1 = e1.typecheck();
                 Type t2 = e2.typecheck();
                 if (t1 != Type.INTTYPE || t2 != Type.INTTYPE)
                        faux.error("Type mistake in a multiplicity expression\n");
                 return Type.INTTYPE; }
}
class Addition extends expr { 
	expr e1;
	expr e2;

	Addition(expr e1 , expr e2){this.e1=e1; this.e2=e2; }
	public  Type typecheck() {                  
                 Type t1 = e1.typecheck();
                 Type t2 = e2.typecheck();
                 if (t1 != Type.INTTYPE || t2 != Type.INTTYPE)
                        faux.error("Type mistake in a addition expression\n");
                 return Type.INTTYPE;  }
}
class Comparison extends expr { 
	expr e1;
	expr e2;

	Comparison(expr e1 , expr e2){this.e1=e1; this.e2=e2; }
	public  Type typecheck() { 
                 Type t1 = e1.typecheck();
                 Type t2 = e2.typecheck();
                 if (t1 != Type.INTTYPE || t2 != Type.INTTYPE)
                        faux.error("Type mistake in a comparison expression\n");
                 return Type.BOOLTYPE;
}
}
class EmptyArray extends expr { 
	expr e1;

	EmptyArray(expr e1){this.e1=e1; }
	public  Type typecheck() {return Type.LISTTYPE;}
}
class Array extends expr { 
	List<expr> es;

	Array(List<expr> es){this.es=es; }
	public  Type typecheck() {
                for(expr e: es)
                    if(e.typecheck() != Type.INTTYPE)
                        faux.error("Type mistake in a list");
                return Type.LISTTYPE;
                }
}
class ConcatArray extends expr { 
	expr e1;
	expr e2;

	ConcatArray(expr e1 , expr e2){this.e1=e1; this.e2=e2; }
	public  Type typecheck() {
                 Type t1 = e1.typecheck();
                 Type t2 = e2.typecheck();
                 if (t1 != Type.LISTTYPE || t2 != Type.LISTTYPE)
                        faux.error("Type mistake in an array concatenation expression\n");
                 return Type.LISTTYPE;
    }
}
