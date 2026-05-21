package Polymorphism;

public class Sbi implements Itransaction{
    double balance;
    Sbi(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("SBI Deposit: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("SBI Withdraw: " + amount);
    }
    @Override
    public void getBalance() {
        System.out.println("SBI Balance: " + balance);
    }

}
