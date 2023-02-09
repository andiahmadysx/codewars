public class BeginerSeriesClock {
    public static void main(String[] args) {
        System.out.println(past(0,1,1));
    }
    public static int past(int h, int m, int s){

//        Clock shows h hours, m minutes and s seconds after midnight.
//        Your task is to write a function which returns the time since midnight in milliseconds.
//
//        Example:
//        h = 0
//        m = 1
//        s = 1
//
//        result = 61000

        int hourToMin = h * 60;
        int minuteToSecond = (hourToMin + m) * 60;
        int result = (minuteToSecond + s) * 1000;

        return result;
    }
}
