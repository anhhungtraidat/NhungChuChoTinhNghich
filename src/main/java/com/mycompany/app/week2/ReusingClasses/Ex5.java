package com.mycompany.app.week2.ReusingClasses;

public class Ex5{
public class A {
    public A(){
        System.out.println("contructor A");
    }; 
}
public class B {
    public B(){
        System.out.println("contructor B ");
    }
}
public class C {
    B member = new B();
}
}