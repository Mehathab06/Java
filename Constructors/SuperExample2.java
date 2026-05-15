package Constructors;

class Bank{
    String BankName;
    String BranchName;

    Bank(String BankName,String BranchName){
        this.BankName = BankName;
        this.BranchName = BranchName;
    }
}
class Account1 extends Bank{
    int AccountNum;
    double balance;

    Account1(String BankName, String BranchName, int AccountNum, double balance){
        super(BankName,BranchName);
        this.AccountNum = AccountNum;
        this.balance = balance;
    }

    void display(){
        System.out.println("Bank name: "+ BankName);
        System.out.println("Branch name: "+ BranchName);
        System.out.println("AccountNumber: "+ AccountNum);
        System.out.println("balance: "+ balance);
    }

}
public class SuperExample2 {
    public static void main(String[] args){
        Account1 a1 = new Account1("HDFC","Nellore",9066763,5600009);
        a1.display();
    }
}
