package Task;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.Interest();
        Account account1 = new Saving();
        account1.Interest();
        Saving saving = new Saving();
        saving.Interest();
        Payment payment = new Payment();
        payment.pay(1000);
        Payment payment1 = new online();
        payment1.pay(2000);
        online online = new online();
        online.pay(3000);


    }
}
