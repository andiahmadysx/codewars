public class ReversedString {
    public static void main(String[] args) {

        System.out.println(reverseString("Hello"));

    }
    public static String reverseString(String str){

        String handleStr = "";
        char handleChar;

        for (int i = 0; i < str.length(); i++){
            handleChar = str.charAt(i);
            handleStr = handleChar + handleStr;
        }

        return handleStr;
    }
}
