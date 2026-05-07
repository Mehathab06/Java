package Statements;

public class DigitPrint {
    public static void main(String[] args){
       // int number = 1234;
       // while(number>0){
         //   int digit = number % 10;

           // number = number/10;
            //System.out.print(digit + " ");
        //}
        String num = "1234";

        for(int i =0; i<num.length();i++){
            System.out.print(num.charAt(i) + " ");
        }
    }
}
