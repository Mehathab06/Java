package com.example;

import java.util.Scanner;

public class Checknum {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the num: ");
        int a = sc.nextInt();

        if (a>0){
            System.out.println("number is positive");
        }else if (a<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Its a zero");
        }
    }
}
