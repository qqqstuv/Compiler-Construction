package AST;

import Type.*;

public class LessThanExpression extends Expression{
	Expression e1;
	Expression e2;
	public LessThanExpression(Expression e1, Expression e2){
		this.e1 = e1;
		this.e2 = e2;			
	}

	public Type accept (Visitor v ){
		return v.visit(this);
	}
}