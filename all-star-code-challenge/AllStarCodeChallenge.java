public class AllStarCodeChallenge {
    public static void main(String[] args) {

        System.out.println(strCount("hello", 'h'));

    }
    public static int strCount(String str, char letter ){

//        Create a function that accepts a string and a single character, and returns an integer of the count of occurrences the 2nd argument is found in the first one.
//
//        If no occurrences can be found, a count of 0 should be returned.
//
//        ("Hello", "o")  ==>  1
//        ("Hello", "l")  ==>  2
//        ("", "z")       ==>  0
//        str_count("Hello", 'o'); // returns 1
//        str_count("Hello", 'l'); // returns 2
//        str_count("", 'z'); // returns 0
        
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str != "" && str.charAt(i) == letter) count++;
        }

        return count;
    }
}
