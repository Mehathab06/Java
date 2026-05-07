package Functions;

class Number{
    int value;

}
public class CallByRef1 {
    static void change(Number n){
        n.value = 100;
    }
    public static void main(String[] args){

        Number num = new Number();
        num.value = 10;

        change(num);
        System.out.println(num.value);

    }
}
