package Functions;

public class Uppercase {
    static String converting(String str){
        return str.toUpperCase();
    }

    public static void main(String[] args){
        String name = "java";
        String result = converting(name);
        System.out.println(result);

    }
}
