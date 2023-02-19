public class ReduceButGrow {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        System.out.println(grow(arr));

    }
    public static int grow(int[] x){

//        Given a non-empty array of integers, return the result of multiplying the values together in order.
//        Example:
//        [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24

//      Your code...
        int result = 1;

        for ( int arr : x ) {
           result *= arr;
        }

        return result;
    }
}
