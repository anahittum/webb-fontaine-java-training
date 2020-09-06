package week1;

import java.util.Scanner;

public class InchToMeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to convert");
        double input = scanner.nextDouble();
        double M = input * 0.0254;
        System.out.println(input + " inch is " + M + " meters");
    }
}
