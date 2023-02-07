public class ThirdAngleOfTriangle {
    public static void main(String[] args) {

        System.out.println(thirdAngle(60, 60));

    }

    public static int thirdAngle(int angle1, int angle2){

        // Total angles degrees of triangle is 180deg
        int angle3 = 180 - (angle1 + angle2);

        return angle3;
    }
}
