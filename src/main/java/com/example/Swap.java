package com.example;

public class Swap {
    public static void main(String[] args){
        //with 3rd variable
        String name1 = "Sunil bro";
        String name2 = "Prashant Anna";
        String swap = name1;
        name1 = name2;
        name2 = swap;
        System.out.println("name1 = " + name1 + " name2 = " + name2);


        //without a 3rd variable
        int a = 10;
        int b = 8;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a =" + a + ", b =" + b);

    }
}
