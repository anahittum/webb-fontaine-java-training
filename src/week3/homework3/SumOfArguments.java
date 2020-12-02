package week3.homework3;

class SumOfArguments {


    public static void main(String[] args) {
        SumOfArguments sum = new SumOfArguments();

        System.out.println("sum is " + sum.sumNumber(1, 2, 3, 4, 5));

    }

    private int sumNumber(int... args) {
        int sum = 0;
        for (int x : args) {
            sum += x;
        }
        return sum;
    }
}