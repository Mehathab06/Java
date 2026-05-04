package Statements;

public class CI {
    public static void main(String[] args){
        int p = 10000;
        int r = 2;
        int t = 4;

        double finalAmount = p * Math.pow(1 + (r/100), 100 * t);
        double interest = finalAmount - p;

        System.out.println(finalAmount);
        System.out.println(interest);

    }

}
