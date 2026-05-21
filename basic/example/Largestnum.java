package basic.example;

import java.util.Scanner;

public class Largestnum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the second num: ");
        int num2 = sc.nextInt();

        System.out.println("Enter the third num: ");
        int num3 = sc.nextInt();

        if (num1>=num2 && num1>=num3){
            System.out.println("num1 is greater");
        }else if (num2>=num1 && num2>=num3){
            System.out.println("num2 is greater");
        } else {
            System.out.println("num3 is greater");
        }
    }
}
