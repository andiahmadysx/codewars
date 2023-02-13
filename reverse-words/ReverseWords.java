public class ReverseWords {
    public static void main(String[] args) {

        System.out.println(reverseWords("The greatest victory is that which requires no battle"));

    }
    public static String reverseWords(String str){

//        Complete the solution so that it reverses all of the words within the string passed in.
//        Words are separated by exactly one space and there are no leading or trailing spaces.

//        Example(Input --> Output): "The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"

       String arr[] = str.split(" ");

       String handleStr = "";

       for (int i = 0; i < arr.length; i++){
           handleStr = arr[i] + " " + handleStr;
       }

       String result = handleStr.replaceAll("\\s+$", "");

       return result;

    }
}
