package Polymorphism;

public class Example6 {
    public static void main(String[] args){
        Itransaction it = null;
        String bank = "Sbi";
        if (bank.equals("Hdfc")) {
            it = new Hdfc(1000);
        } else if (bank.equals("Sbi")) {
            it = new Sbi(1000);
        }
        it.deposit(500);
        it.withdraw(200);
        it.getBalance();


    }
}
