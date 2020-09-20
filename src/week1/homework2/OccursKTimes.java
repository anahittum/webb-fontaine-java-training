package week1.homework2;

//Given an array of integers and one integer k, find an element that occurs exactly k times.

public class OccursKTimes {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 2};
        int k = 2;

        for (int value : array) {
            int counter = 0;

            for (int i : array) {
                if (value == i) {
                    counter++;
                }
                if (counter > k) {
                    break;
                }
            }
            if (counter == k) {
                System.out.println(" = " + value);
                break;
            }
        }
    }
}
