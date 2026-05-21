package ExceptionHandling;

import java.io.IOException;

public class ThrowsExample {
    static void check() throws IOException {

        throw new IOException("File error occurred");
    }

    public static void main(String[] args) {

        try {
            check();
        }

        catch(IOException e) {
            System.out.println(e);
        }
    }

}
