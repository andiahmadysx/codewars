public class SimpleMultiplication {
    public static void main(String[] args) {

        System.out.println(simpleMultipication(1));

    }
    public static int simpleMultipication(int n) {

        //This kata is about multiplying a given number by eight
        //if it is an even number and by nine otherwise.

        if (n % 2 == 0) {
            return (n * 8);
        } else {
            return (n * 9);
        }

    }

}
