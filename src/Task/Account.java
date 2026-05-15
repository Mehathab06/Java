package Task;

public class Account {
    double balance = 20000 ;
    public void Interest(){
        double interestAmount = balance *0.04;
        balance = balance + interestAmount;
        System.out.println("Your balance with interest is " + balance);
    }
}
