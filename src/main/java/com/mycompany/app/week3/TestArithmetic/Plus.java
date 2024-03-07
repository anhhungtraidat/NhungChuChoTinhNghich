package com.mycompany.app.week3.TestArithmetic;

public class Plus extends Binop {
    public Plus(Node l, Node r) {
    super(l, r);// l, r of Binop
    }
    public double eval() {
    return lChild.eval() + rChild.eval(); //protected Note can
    //Accessed by subclass
    }
}
   