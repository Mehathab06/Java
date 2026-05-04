package Statements;

public class DivisibleByAnd {
    public static void main(String[] args){
        int num = 83;
        if(num%2==0 && num%3==0){
            System.out.println("num is divisible by 2 and 3");
        }else{
            System.out.println("num is not divisible by 2 and 3");
        }
    }
}
