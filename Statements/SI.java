package Statements;

public class SI {
    public static void main(String[] args){
        int p = 10000;
        int r = 2;
        int t = 4;
        int simpleInterest = p*r*t/100;
        int totalAmount = p + simpleInterest;
        System.out.println(simpleInterest);
        System.out.println(totalAmount );
    }
}
