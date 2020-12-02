package week2.homework2;

//Write a program that will find and separate the repeating values of two given arrays.

public class DuplicateValues {
    public static void main(String[] args) {

        int[] array = new int[5];
        int[] array1 = new int[5];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int j = 0; j < array1.length; ++j) {
            array1[j] = (int) (Math.random() * 100);
            System.out.print(array1[j] + " ");

        }


        for (int i = 0; i < array.length; ++i) {
            int j;
            for (j = 0; j < array1.length; ++j)
                if (array[i] == array1[j])
                    System.out.print(array[i] + " ");
        }
    }
}