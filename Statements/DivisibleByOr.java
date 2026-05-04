package Statements;

public class DivisibleByOr {
    public static void main(String[] args){
        int num = 9;
        if(num%3==0 || num%7==0){
            System.out.println("Number is divisible by 3");
        }else{
            System.out.println("Number is divisible by 7");
        }

    }

}
