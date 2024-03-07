package com.mycompany.app.week2.CleanUp;

public class E8{
    public void method1(){
        System.out.println("this is method1");
        //method2() without this
        this.method2();
    }
    public void method2(){};
}