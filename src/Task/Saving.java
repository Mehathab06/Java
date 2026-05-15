package Task;

public class Saving extends Account{
    @Override
    public void Interest(){
        double interestAmount = balance *0.02;
        balance = balance + interestAmount;
        System.out.println("Your balance with  interest is " + balance);
    }
}
