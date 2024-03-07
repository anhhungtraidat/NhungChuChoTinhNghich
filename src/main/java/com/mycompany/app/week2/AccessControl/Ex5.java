
package com.mycompany.app.week2.AccessControl;
public class Ex5 {
    //fields
    public String name;
    private int age;
    protected int msv;

    public void Name(String name){
        this.name = name;
        System.out.println(name);
    }
    public int getAge(){
        return age;
    }
    public void Msv(){
        System.out.println(msv);
    }
}