import java.util.*;

abstract class AST{
    abstract public String translate();
};
class Start extends AST {
    public List<JsonObject> objs;

    public Start(List<JsonObject> objs){
        this.objs = objs;
    }
    public String translate(){
        String output = "";
        for(JsonObject o: objs){
            output += o.translate();
        }
        return output;
    }
}

class JsonObject extends AST {
    public List<Pair> pairs = new ArrayList<Pair>();
        
    public JsonObject(List<Pair> pairs){
        this.pairs = pairs;
    }

    public String translate(){
        String output = "";
        for(int i = 0; i < pairs.size(); i++){
            output += pairs.get(i).translate();
            if(i < pairs.size()-1) output += ", ";
        }        
        return output + ";\n";
    }
}

class Pair extends AST {
    String name;
    Value value;    
    
    public Pair(String name, Value value){
        this.name = name;
        this.value = value;
    }    
        
    public String translate(){
        return value.translate();
    }
}

abstract class Value extends AST {
        
}

class StringValue extends Value {
    String value;
    public StringValue (String value){
        this.value = value;
    }
    public String translate(){
        return value;
    }
}
class NumberValue extends Value {
    String value;
    public NumberValue(String value){
        this.value = value;
    }
    public String translate(){
        return value;
    }
}

class ObjectValue extends Value {
    JsonObject o;
    
    public ObjectValue(JsonObject o){
        this.o = o;
    }
    public String translate(){
        return o.translate().replace("\n", "").replace(";", "");
    }
}




  
