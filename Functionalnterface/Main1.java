package Functionalnterface;


public class Main1 {
    public static void main(String[] args){

        Square s = n -> n * n;
        System.out.println("Square of num is: "+s.square(4));

        Add a1 = (int x, int y) -> x+y;
        System.out.println("Addition of 2numbers: "+a1.add(8,2));

        StringLength s1 = str -> str.length();

        System.out.println("Length of the string: "+s1.getLength("I am Mehathab"));

//
    }
}
