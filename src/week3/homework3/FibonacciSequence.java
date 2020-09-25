package week3.homework3;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = getNthNumber(scanner);
        int fib = getFibonacciNumber(x);
        System.out.print(fib);
    }

    private static int getNthNumber(Scanner scanner) {
        System.out.println("Input the nth number");
        while (!scanner.hasNextInt()) {
            System.out.println("Must be an integer");
            scanner.next();
        }

        return scanner.nextInt();
    }

    private static int getFibonacciNumber(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);
    }
}
