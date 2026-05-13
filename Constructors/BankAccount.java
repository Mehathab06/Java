package Constructors;

class Account{
    int AccountNumber;
    String AccountHolder;
    double balance;

    Account(int num,String holder,double balance){
        this.AccountNumber = num;
        this.AccountHolder = holder;
        this.balance = balance;
    }
    void displayDetails(){
        System.out.println("Account Number: "+ AccountNumber);
        System.out.println("Account holder: " + AccountHolder);
        System.out.println("Balance: " + balance);
    }
}
public class BankAccount {
    public static void main(String[] args){
        Account a1 = new Account(997737,"Mehathab",5089751);
        a1.displayDetails();
    }
}
