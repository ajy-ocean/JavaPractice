public class TryWithResource {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int value = num1 / num2;
            System.out.println(value);
        } catch (ArithmeticException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
