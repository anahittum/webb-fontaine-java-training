package week2.homework2;

public class UniqueElement {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 50};
        int[] array2 = {10, 20, 40};

        for (int i = 0; i < array1.length; i++) {
            int j;
            for (j = 0; j < array2.length; j++)
                if (array1[i] == array2[j])
                    break;
            if (j == array2.length) {
                System.out.print(array1[i] + " ");
            }
        }
    }
}