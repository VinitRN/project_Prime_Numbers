import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number up to which Fibonacci series should be generated
        System.out.print("Enter the number up to which Fibonacci series should be generated: ");
        int n = scanner.nextInt();

        // Display Fibonacci series up to the given number
        System.out.println("Fibonacci series up to " + n + " is:");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    // Recursive method to calculate Fibonacci number at a given position
    private static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
