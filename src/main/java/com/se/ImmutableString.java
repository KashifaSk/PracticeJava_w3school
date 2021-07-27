package com.se;

public class ImmutableString {
    public static void main(String[] args) {
       /* String s= "Hello";//reference variable pointing to hello, has address of hello
        System.out.println(s.hashCode());
        System.out.println(s);
        s="Hi";       //pointing to new string, has address of new string
        System.out.println(s.hashCode());
        System.out.println(s);
        System.out.println(s.concat(s));*/
        Integer i= 20;
        boolean b= i.equals(30);
        System.out.println(b);
        System.out.println(i.compareTo(20));
        int hash= i.hashCode();
        System.out.println(hash);
        System.out.println(i.toString());
    }
}
