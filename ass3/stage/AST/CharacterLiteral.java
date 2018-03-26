package AST;

import Type.*;
public class CharacterLiteral extends Literal {

    public char value;
    public int line;
    public int pos;
    public CharacterLiteral (char value, int line, int pos ) {
        this.value = value;
        this.line = line;
        this.pos = pos;
    }        
    public CharacterLiteral (char value) {
    	this.value = value;
    }


    public Object accept (Visitor v) {
        return v.visit(this);
    }
    public String getValue(){
        return "\'" +  String.valueOf(value) + "\'";
    }
}