public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {

        System.out.println(removeConsecutiveDuplicates("alpha alpha alpha"));

    }
    public static String removeConsecutiveDuplicates (String s){

//      Question : https://www.codewars.com/kata/5b39e91ee7a2c103300018b3/train/java

        String[] arr = s.split(" ");

        String result = arr[0];

        for (int i = 1; i < arr.length; i++){

            if ( arr[i].equals(arr[(i - 1)])){
                continue;
            }
                result += " " + arr[i];
        }

        return result;
    }
}
