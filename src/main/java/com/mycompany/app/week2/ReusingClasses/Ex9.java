package com.mycompany.app.week2.ReusingClasses;

public class Ex9{
    class Component1{
        Component1(){
            System.out.println("Component 1");
        }
    }
    class Component2{
        Component2(){
            System.out.println("Component 2");
        }
    }
    class Component3{
        Component3(){
            System.out.println("Component 3");
        }
    }
    public class Root {
        private Component1 component1;
        private Component2 component2;
        private Component3 component3;

        public Root() {
            component1 = new Component1();
            component2 = new Component2();
            component3 = new Component3();
            System.out.println("Constructor Root");
        }
}
}