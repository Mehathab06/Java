package Task;

public class Payment {
    void pay(double amount){
        System.out.println("paid "+ amount + " through cash");
    }
}

class online extends Payment{
    @Override
    void pay(double amount){
        System.out.println("paid "+ amount + " through online");
    }
}
