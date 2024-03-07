package com.mycompany.app.week2.AccessControl;

public class Ex6 {
    protected Ex6(){
        System.out.println("This is Ex6 contructor");
    }
    class Exx6 extends Ex6{
        public void In(){Ex6() ;}
    }
}
