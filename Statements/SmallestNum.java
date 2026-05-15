package Statements;

public class SmallestNum {
    public static void main(String[] args){
        int num1 = 19;
        int num2 = 15;
        int num3 = 21;
        if(num1<=num2 && num1<=num3){
            System.out.println(num1);
        }else if(num2<=num3 && num2<=num1){
            System.out.println(num2);
        }else{
            System.out.println(num3);
        }
    }
}
