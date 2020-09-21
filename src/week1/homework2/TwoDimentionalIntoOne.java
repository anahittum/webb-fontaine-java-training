package week1.homework2;

public class TwoDimentionalIntoOne {
    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3, 4}, {5, 6, 7}};
        int[] newArray = new int[7];
        for (int i = 0; i < numbers.length; ++i) {
            for (int j = 0; j < numbers[i].length; ++j) {
                newArray[i] = numbers[i][j];
                System.out.println( newArray[i]);

            }
        }
    }
}