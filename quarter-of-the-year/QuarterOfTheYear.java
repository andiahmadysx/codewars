public class QuarterOfTheYear {
    public static void main(String[] args) {

        System.out.println(quarterOf(5));

    }


    public static int quarterOf(int month){
        if (month > 0 && month <= 3){
            return 1;
        } else if (month <= 6){
            return 2;
        } else if (month <= 9) {
            return 3;
        } else if (month <= 12) {
            return 4;
        } else {
            System.out.println("Invalid Input");
            return 0;
        }
    }
}
