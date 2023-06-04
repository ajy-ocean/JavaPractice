import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Fibonacci Series");
        System.out.println("=================");
        System.out.println("Using Iteration method");
        fiboSeries();

        System.out.println();
        System.out.println("-----------------------");

        System.out.println("Using Recursion method");
        int fib_len = 10;
        System.out.print("Fibonacci Series of " + fib_len + " numbers is: \n");
        for (int i = 0; i <= fib_len; i++) {
            System.out.print(fibRecursion(i) + " ");
        }

    }

    public static void fiboSeries() {

        System.out.println("Enter your range to calcuate fibonacci Series");
        int number = new Scanner(System.in).nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;

        // Using iteration method
        for (int i = 0; i <= number; i++) {
            System.out.print(firstTerm + " ");

            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static int fibRecursion(int count) {

        // 0th fibonacci is 0
        if (count == 0) {
            return 0;
        }

        // 1st and 2nd fibonacci is 1 & 1 only
        if (count == 1 || count == 2) {
            return 1;
        }

        // calling function recursively for nth Fibonacci
        return fibRecursion(count - 1) + fibRecursion(count - 2);
    }

}
