package Loops;

import java.util.Scanner;

public class PrintOdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        for(int i=0;i<=num;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
