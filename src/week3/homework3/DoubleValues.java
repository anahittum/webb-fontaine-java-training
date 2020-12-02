package week3.homework3;

import java.util.Arrays;

public class DoubleValues {
    public static void main(String[] args) {


        int[] myArray = generateArray();
        System.out.println(Arrays.toString(myArray));

        int[] myDoubleArray = generateDoubleArray(myArray);
        System.out.println(Arrays.toString(myDoubleArray));

    }

    private static int[] generateArray() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    private static int[] generateDoubleArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            array[i] = 2 * array[i];
        }
        return array;
    }
}