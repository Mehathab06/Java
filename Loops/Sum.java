package Loops;

import java.util.Scanner;

public class Sum {
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the digits: ");
      int num = scanner.nextInt();

      int sum = 0;

      while(num>0){
         int digits = num % 10;
         sum += digits;
         num = num / 10;

      }
      System.out.println(sum);

  }
}
