package week3.homework3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = getNthNumber(scanner);
        int fib = getFactorial(x);
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

    private static int getFactorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }
}
