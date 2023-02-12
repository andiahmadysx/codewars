public class EvenOrOdd {
    public static void main(String[] args) {

        System.out.println(even_or_odd(3));

    }
    public static String even_or_odd(int number) {

        // Create a function that takes an integer as an argument,
        // returns "Even" for even numbers or "Odd" for odd numbers.

        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
