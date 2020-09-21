package week1.homework1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("This is an even number");
        } else {
            System.out.println("This is an odd number");
        }
        System.out.println("Bye!");
    }
}

