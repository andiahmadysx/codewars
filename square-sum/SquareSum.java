public class SquareSum {
    public static void main(String[] args) {

        int[] arr = {1,2,2};

        System.out.println(squareSum(arr));

    }
    public static int squareSum(int[] n) {

//        Complete the square sum function so that it squares each number passed into it and then sums the results together.
//        For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9

        int result = 0;

        for (int i = 0; i < n.length; i++) {
            result += n[i] * n[i];
        }
        return result;
    }
}
