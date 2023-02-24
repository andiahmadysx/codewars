public class RemoveExclamationMarks {
    public static void main(String[] args) {

        System.out.println(removeExclamationMarks("Hello World!!!"));

    }
    public static String removeExclamationMarks(String s) {

//        Write function RemoveExclamationMarks which removes all exclamation marks from a given string.

//        Your code...

        return s.replaceAll("[!]", "");
    }
}
