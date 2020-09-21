package week1.homework2;

//Write a program that will sort the given mass in ascending and descending order. Use Math.random() method for initializing array elements.

import java.util.Scanner;

public class AscDescOrder {
    public static void main(String[] args) {
        int temp;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Ascending Order:");
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Descending Order:");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
