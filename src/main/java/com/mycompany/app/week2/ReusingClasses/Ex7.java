package com.mycompany.app.week2.ReusingClasses;

public class Ex7{
    public class A {
        public A(String a){
            System.out.println(a);
        }; 
    }
    class B {
        public B(String b){
            System.out.println(b);
        }
    }
    class C {
        B member = new B();
        public C(String c){
            System.out.println(c);
        }
    }
    }