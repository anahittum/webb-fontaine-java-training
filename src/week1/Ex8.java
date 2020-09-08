package week1;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        float n = scanner.nextFloat();

        if (n > 0) {
            System.out.println("Positive");
            if (n > 1000000) {
                System.out.println("Large");
            } else if (n < 1) {
                System.out.println("Small");
            } else
                System.out.println("The number is between 1 and 1000000");
        } else if (n < 0) {
            System.out.println("Negative");
            if (-n * 1 > 1000000) {
                System.out.println("Large");
            } else if (-n * 1 < 1) {
                System.out.println("Small");
            } else
                System.out.println("The number is between -1 and -1000000");
        } else System.out.println("Zero");
    }
}

