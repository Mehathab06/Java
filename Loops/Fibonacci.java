package Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Upto: ");
        int n = scanner.nextInt();
        int firstNum = 0;
        int secondNum = 1;

        for(int i =1; i <=n; i++){
            System.out.print(firstNum + ",");
            int NextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = NextNum;
        }
    }
}
