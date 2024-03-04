package com.mycompany.app.week2.AccessControlE1;

public class Ex4 {
    static class Animal {
        protected int weight;
        protected String name;

        public Animal(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }
    }

    public static class Dog extends Animal {
        public Dog(String name, int weight) {
            super(name, weight);
        }

        public String getName() {
            return name;
        }
    }
}