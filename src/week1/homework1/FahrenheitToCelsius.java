package week1.homework1;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number to convert");
        float input = scanner.nextFloat();
        float C = (input - 32) * 5 / 9;
        System.out.println(input + " degree Fahrenheit is equal to " + C + " in Celsius");
    }
}
