package week3.homework3;


import java.util.Arrays;
import java.util.Scanner;

public class IncreaseBy10Percent {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] myArray = generateArray(scanner);
        System.out.println(Arrays.toString(myArray));

        double[] myModifiedArray = increaseBy10Percent(myArray, scanner);
        System.out.println("my modified array is" + Arrays.toString(myModifiedArray));

    }

    private static double[] generateArray(Scanner scanner) {
        System.out.println("Input the length of the array");
        int a = scanner.nextInt();
        double[] array = new double[a];
        for (a = 0; a < array.length; ++a) {
            array[a] =  Math.random() * 100;
        }
        return array;
    }


    private static double[] increaseBy10Percent(double[] array, Scanner scanner) {
        for (int i = 0; i < array.length; ++i) {
            System.out.println("Input the index");
           int index = scanner.nextInt();
            if (index < 0 || index > array.length - 1) {
                System.out.print("The index must be between below or above the array length");
                scanner.nextInt();
            }

            for (i = 0; i < array.length; ++i) {

                if (i == index) {
                     array[i] = array[index] + array[index] * 0.1;
                }
            }
            return array;

        }
        return array;
    }
}
