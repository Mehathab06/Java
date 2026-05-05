package Functions;

import java.util.Scanner;

public class Evenoddfun {
     static void CheckNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = scanner.nextInt();

        if(num%2==0){
            System.out.println("Its a eve num");
        }else{
            System.out.println("Its a odd one");
        }
    }
    public static void main(String[] args){
        CheckNum();

    }
}
