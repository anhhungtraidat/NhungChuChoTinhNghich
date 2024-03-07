package com.mycompany.app.week2.CleanUp;

public class E10 {
    E10(){
        finalize();
    }
    public void finalize(){
        System.out.println("This is the end");
        }
}