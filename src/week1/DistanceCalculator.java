package week1;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class DistanceCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first coordinate");
        double x1 = scanner.nextDouble();

        System.out.println("Please enter the second coordinate");
        double y1 = scanner.nextDouble();

        System.out.println("Please enter the third coordinate");
        double x2 = scanner.nextDouble();

        System.out.println("Please enter the fourth coordinate");
        double y2 = scanner.nextDouble();

        double distance = sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("The distance is " + distance);

        double middlePointX = (x1 + x2) / 2;
        double middlePointY = (y1 + y2) / 2;
        System.out.println("The middle point is (" + middlePointX + " , " + middlePointY + ")");
    }

}