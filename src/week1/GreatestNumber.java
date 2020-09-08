package week1;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number");
        int a = scanner.nextInt();

        System.out.println("Please enter the second number");
        int b = scanner.nextInt();

        System.out.println("Please enter the third number");
        int c = scanner.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is the greatest number");
            } else {
                System.out.println(c + " is the greatest number");
            }
        } else if (b > c) {
            System.out.println(b + " is the greatest number");
        } else {
            System.out.println(c + " is the greatest number");

        }
    }
}

