package com.mycompany.app.week2.ReusingClasses;

public class Ex1{
    private int x;
    public int getX(){
        return x;
    }
}
 
class Math {
    Ex1 x = new Ex1();
}
    
