package week1.homework2;

import java.util.Scanner;

public class MeanOfArrayElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double[] array = new double[10];
        System.out.println("Input the elements");
        for (int i = 0; i < array.length; i++) {
            while (!scanner.hasNextDouble()) {
                System.out.println("Element type must be double");
                scanner.next();
            }
            array[i] = scanner.nextDouble();
        }
        for (double v : array) {
            sum += v;
        }
        System.out.println("mean is " + sum / array.length);

    }
}
