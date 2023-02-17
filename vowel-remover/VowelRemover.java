public class VowelRemover {
    public static void main(String[] args) {
        System.out.println(vowelRemover("codewars"));
    }
    public static String vowelRemover(String input){

//        Create a function called shortcut to remove the lowercase vowels (a, e, i, o, u ) in a given string.
//
//        Examples
//        "hello"     -->  "hll"
//        "codewars"  -->  "cdwrs"
//        "goodbye"   -->  "gdby"
//        "HELLO"     -->  "HELLO"
//
//        don't worry about uppercase vowels
//        y is not considered a vowel for this kata

//        Your code...
        return input.replaceAll("[aiueo]", "");
    }
}
