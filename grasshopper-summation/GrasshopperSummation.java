public class GrasshopperSummation {
    public static void main(String[] args) {
        System.out.println(summation(8));
    }
    public static int summation(int n){

//        Write a program that finds the summation of every number from 1 to num. The number will always be a positive integer greater than 0.
//
//        For example (Input -> Output):
//
//        2 -> 3 (1 + 2)
//        8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)

//      Your code...
        int result = 0;

        for (int i = 1; i <= n; i++){
            result += i;
        }

        return result;
    }
}
