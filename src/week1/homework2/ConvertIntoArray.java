package week1.homework2;

import java.util.ArrayList;
import java.util.List;

public class ConvertIntoArray {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<Integer>();
        int number = 187;
        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            array.add(digit);
        }
        System.out.println(array);
    }
}