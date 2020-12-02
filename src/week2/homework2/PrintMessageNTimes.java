package week2.homework2;

//Input a number and the program will print a message a given number of times. The process should continue until the user inputs the number '-1'.

import java.util.Scanner;

public class PrintMessageNTimes {
    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        n = scanner.nextInt();
        while (!scanner.hasNextInt()) {
            System.out.println("The input must be int");
            scanner.nextInt();
        }

        while (n != -1) {
            for (int i = 1; i <= n; ++i) {
                System.out.println("Printing the meesage n times");
            }
            System.out.println("Please input a number");
            n = scanner.nextInt();
            while (!scanner.hasNextInt()) {
                System.out.println("The input must be int");
                scanner.nextInt();
            }
        }
    }
}

