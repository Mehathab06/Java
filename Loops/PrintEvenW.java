package Loops;

import java.util.Scanner;

public class PrintEvenW {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = scanner.nextInt();
        int i = 1;
        while(i<=num){
            if(i%2 == 0){
                System.out.println(i);
            }
           i++;
        }
        scanner.close();
    }
}
