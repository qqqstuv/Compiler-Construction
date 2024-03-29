package Type;

import AST.*;
public abstract class Type extends ASTNode {
        public abstract void accept (Visitor v );
        public abstract String toShortString();
        public abstract boolean equals (Object o);
        public abstract int line();
        public abstract void setLine(int line);
        public abstract int pos();
        public abstract void setPos(int pos); 

}