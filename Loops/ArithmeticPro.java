package Loops;

import java.util.Scanner;

public class ArithmeticPro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first term: ");
        int firstTerm = scanner.nextInt();
        System.out.println("Enter the NumOfTerms: ");
        int numOfTerms = scanner.nextInt();
        System.out.println("Enter the commonDiff: ");
        int commonDiff = scanner.nextInt();

        for(int i =1; i<= numOfTerms; i++){
            System.out.print(firstTerm + ",");
            firstTerm = firstTerm + commonDiff;
        }
    }
}
