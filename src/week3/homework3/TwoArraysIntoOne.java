package week3.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysIntoOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] firstArray = fillArrayAndReturn(scanner);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = fillArrayAndReturn(scanner);
        System.out.println(Arrays.toString(secondArray));

        int[] mergedArray = combineTwoArraysIntoOne(firstArray, secondArray);
        System.out.println("The merged array is " + Arrays.toString(mergedArray));
    }

    private static int[] fillArrayAndReturn(Scanner scanner) {
        System.out.println("Input the length of the first array");
        int a = scanner.nextInt();
        int[] array = new int[a];
        for (a = 0; a < array.length; ++a) {
            array[a] = (int) (Math.random() * 100);
        }
        return array;
    }

    private static int[] combineTwoArraysIntoOne(int[] firstArray, int[] secondArray) {
        int length = firstArray.length + secondArray.length;
        int[] mergedArray = new int[length];
        int position = 0;


        for (int element : firstArray) {
            mergedArray[position] = element;
            position++;
        }
        for (int element : secondArray) {
            mergedArray[position] = element;
            position++;

        }
        return mergedArray;
    }
}
