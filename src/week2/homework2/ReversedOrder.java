package week2.homework2;

import java.util.Scanner;

public class ReversedOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int LENGTH = 5;
        int[] array = new int[LENGTH];
        System.out.println("Please input elements of the array");

        for (int i = 0; i < array.length; ++i) {
            while (!scanner.hasNextInt()) {
                System.out.println("please enter int");
                scanner.next();
            }
            array[i] = scanner.nextInt();
        }

        for (int element : array) {
            System.out.println(" " + element);
        }
        int[] reversedArray = new int[LENGTH];
        int j = 0;

        for (int i = array.length - 1; i >= 0; --i) {
            reversedArray[array.length - 1 - i] = array[i];
            j++;
        }

        System.out.println("reversed array elements are");
        for (int element : reversedArray) {
            System.out.println(" " + element);
        }
    }
}