package week3.homework3;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double triangleSides = getTriangleArea(scanner);
        System.out.println(triangleSides);
    }


    private static double getTriangleArea(Scanner scanner) {
        System.out.println("Input the length of the first side");
        double a = scanner.nextDouble();
        System.out.println("Input the length of the second  side");
        double b = scanner.nextDouble();
        System.out.println("Input the length of the third side");
        double c = scanner.nextDouble();
        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("These lenths do not make a triangle");
        }
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}