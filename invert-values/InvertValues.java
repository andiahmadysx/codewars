public class InvertValues {
    public static void main(String[] args) {

        int[] input = {1,2,-3,-4,-5};
        System.out.print(invert(input));

    }
    public static int[] invert(int[] array){

//        Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.
//
//        invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
//        invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
//        invert([]) == []

        int[] result = new int[array.length];

        for(int i = 0; i < array.length; i++) {

            if(array[i] < 0){
                result[i] = Math.abs(array[i]);
            } else {
                result[i] = -array[i];
            }

            System.out.println(result[i]);
        }

        return result;

    }
}
