package week1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int n1 = scanner.nextInt();

        System.out.println("Please enter the second number");
        int n2 = scanner.nextInt();

        System.out.println("Please enter an operation");
        int operation = scanner.next().charAt(0);

        switch (operation) {
            case ('/'):
                if (n2 == 0) {
                    System.out.println("Can not divide by 0, please enter a different number");
                } else
                    System.out.println(n1 / n2);
                break;
            case ('*'):
                System.out.println(n1 * n2);
                break;
            case ('-'):
                System.out.println(n1 - n2);
                break;
            case ('+'):
                System.out.println(n1 + n2);
                break;
            default:
                System.out.println("Please enter a valid operator");
        }
    }
}
