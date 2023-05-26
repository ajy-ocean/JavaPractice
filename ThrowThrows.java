import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ThrowThrows {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();

            if (number == 69) {
                throw new ArithmeticException();
            }
        }

        // This lines give error so handle it
        // new ThrowThrows().m();
    }

    void m() throws IOException{  
        throw new IOException(); 
      }  
}
