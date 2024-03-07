package com.mycompany.app.week2.CleanUp;

public class E11 {
    E11(){
        finalize();
    }
    public void finalize(){
        System.out.println("This is the end");
        }
}