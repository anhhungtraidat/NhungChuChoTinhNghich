package com.mycompany.app.week2.ReusingClasses;

public class Ex8{
    public class Base{
        public Base(){
            System.out.println("Default");
        }
        public Base(String x){
            System.out.println(x);
        }
        public void Base(String string) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'Base'");
        }
    }
    public class Derived extends Base {
        Base base = new Base();

        public Derived(String y) {
            y = "10";
            System.out.println(y);
            super.Base("String");
        }
    }
}