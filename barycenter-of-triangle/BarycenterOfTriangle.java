import java.text.DecimalFormat;
import java.text.NumberFormat;

public class BarycenterOfTriangle {
    public static void main(String[] args) {
        double[] x = {4,6};
        double[] y = {12, 4};
        double[] z = {10, 10};

        System.out.println(barTriangle(x, y, z));

    }
    public static double[] barTriangle(double[] x, double[] y, double[] z){

//        Question : https://www.codewars.com/kata/5601c5f6ba804403c7000004/java

//       Your code...
        double[] coordinates = new double[2];

        for(int i=0;i<2;i++){
            coordinates[i] = Double.parseDouble(new DecimalFormat("##.####").format((x[i]+y[i]+z[i])/3));
        }

        return coordinates;
    }
}
