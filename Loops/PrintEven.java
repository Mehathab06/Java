package Loops;

import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
       // System.out.println(number);
        for(int i=0;i<=number;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
