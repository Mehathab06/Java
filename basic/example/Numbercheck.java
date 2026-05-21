package basic.example;

import java.util.Scanner;

public class Numbercheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num%2 == 0){
            System.out.println("Num is even");

        }else{
            System.out.println("Num is odd");
        }
    }
}
