package com.mycompany.app.week3.TestArithmetic;

public class Binop extends Node {
    protected Node lChild, rChild;
    public Binop(Node l, Node r) {
    lChild = l;
   rChild = r;
    }
}