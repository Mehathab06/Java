package Polymorphism;

public class Hdfc implements Itransaction{
    double balance;
    Hdfc(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("HDFC Deposit: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("HDFC Withdraw: " + amount);
    }
    public void getBalance() {
        System.out.println("HDFC Balance: " + balance);
    }
}
