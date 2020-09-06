package week1;

import java.util.Scanner;

public class WeightOnMoon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to convert");
        float input = scanner.nextFloat();
        float C = input * 0.17f;
        System.out.println(" Your weight on the Moon is " + C );
    }
}
