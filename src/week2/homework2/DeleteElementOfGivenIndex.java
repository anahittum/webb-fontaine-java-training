package week2.homework2;

import java.util.Scanner;

public class DeleteElementOfGivenIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }

        int index;
        for (int i = 0; i < array.length; ++i) {
            System.out.println("Input the index");
            index = scanner.nextInt();
            if (index < 0 || index > 9) {
                System.out.print("The index must be between 0 and 9");
                scanner.nextInt();
            }

            for (i = 0; i < array.length; ++i) {

                if (i == index) {
                    continue;
                }
                System.out.print(array[i] + " ");

            }
        }
    }
}