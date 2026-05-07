package Functions;

import java.util.Scanner;

public class CheckFun {

     static void EvenOdd(int num){
         String number = num%2 == 0 ? "Even" : "Odd";
         System.out.println(number);
     }
     public static void main(String[] args){
       CheckFun obj = new CheckFun();
       obj.EvenOdd(29);

     }
    }

