package Functions;

public class CallByValue {
    static void number(int n){
        n = 100;
    }
    public static void main(String[] args){
        int num = 10;
        number(num);
        System.out.println(num);
    }
}
