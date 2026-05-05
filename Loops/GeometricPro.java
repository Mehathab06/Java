package Loops;

import java.util.Scanner;

public class GeometricPro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the firstTerm: ");
        int firstTerm = scanner.nextInt();

        System.out.println("Enter the CommonRation: ");
        int commonRatio = scanner.nextInt();
        System.out.println("Enter the numOfTerms: ");
        int numOfTerms = scanner.nextInt();

        for(int i = 1; i<=numOfTerms; i++){
            firstTerm = firstTerm * commonRatio;
            System.out.print(firstTerm + ",");
        }
    }
}
