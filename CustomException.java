import java.util.Scanner;

public class CustomException {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter a value");
            int number = scanner.nextInt();

            if (number > 20) {
                throw new MyException("MyException Occur");
            }
        }

    }
}

class MyException extends RuntimeException {
    MyException(String value) {
        super(value);
    }
}
