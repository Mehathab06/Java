package Loops;

import java.util.Scanner;

public class PrintNumDW {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = scanner.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i<=num);
        scanner.close();
    }
}
