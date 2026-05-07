package Functions;

public class PrintNum {
    static void WithoutUsingLoops(int num){
        if(num>10){
            return;
        }
        System.out.println(num);
        WithoutUsingLoops(num + 1);

    }
    public static void main(String[] args){
        WithoutUsingLoops(1);

    }
}
