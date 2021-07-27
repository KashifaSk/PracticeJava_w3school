package com.se.PracticeArray;

import java.util.Arrays;

public class NamesArray {
    public static void main(String[] args) {
        String[] names = {"John", "Bob", "mary"};
        System.out.println(names.length);
       for(int i=0; i<names.length; i++){
       System.out.println(names[i]);
       }

        System.out.println(Arrays.toString(names));
    }
}