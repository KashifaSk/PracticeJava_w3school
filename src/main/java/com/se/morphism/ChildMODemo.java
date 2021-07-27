package com.se.morphism;

public class ChildMODemo extends ParentMODemo {
    public static void main(String[] args) {
    ChildMODemo c= new ChildMODemo();
    c.method();
    ParentMODemo c1= new ChildMODemo();
    c1.method();
    c1= new ParentMODemo();
    c1.method();

        ParentMODemo c2= new ParentMODemo();
        c2.method();
    }
    public void method(){
        System.out.println("In child class");
    }
    public int method(int s){
        System.out.println("no. in child class");
        return 4;
    }
}
