package ExceptionHandling;

public class Age {
    public static void main(String[] args) {


                int age = 15;

                try {

                    if(age < 18) {
                        throw new ArithmeticException("Not eligible for voting");
                    }

                    System.out.println("Eligible for voting");
                }

                catch(ArithmeticException e) {
                    System.out.println(e.getMessage());
                }

                finally {
                    System.out.println("Program ended");
                }
            }

}
