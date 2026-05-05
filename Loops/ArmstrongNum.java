package Loops;

public class ArmstrongNum {
    public static void main(String[] args){
        int num = 123;
        int original = num;
        int sum = 0;

        while(num>0){
            int digit = num % 10;
            sum += (int) Math.pow(digit, 3);
            num = num / 10;

            if(sum == original){
                System.out.println("Its a armstrong Number");
            }else{
                System.out.println("Not a armstrong number");
            }



        }

    }
}
