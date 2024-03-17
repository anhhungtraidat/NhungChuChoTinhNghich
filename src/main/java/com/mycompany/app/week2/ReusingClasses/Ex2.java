package com.mycompany.app.week2.ReusingClasses;

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }

    }
   
    class Detergent extends Cleanser {
    // Change a method:
    public void scrub() {
    append(" Detergent.scrub()");
    super.scrub(); // Call base-class version
    }
    // Add methods to the interface:
    public void foam() { append(" foam()"); }
    // Test the new class:
   }

   public class Ex2 extends Detergent {
    public void scrub() {
        append(" Ex2.scrub()");
        super.scrub(); // Call base-class version
        }
    public void sterilize(){
        append("Ex2.sterlize");
    }


   }