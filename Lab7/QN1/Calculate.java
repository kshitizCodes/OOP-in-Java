package QN1;

import java.lang.Math;
import java.text.DecimalFormat;

class Calculate {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        int[] angles = { 0, 30, 45, 60, 90, 120, 135, 150, 180 };
        for (int x : angles) {
            System.out.print("sin" + x + "\t " + (df.format(Math.sin(Math.toRadians(x)))) + "\t\t");
            System.out.print("cos" + x + "\t " + (df.format(Math.cos(Math.toRadians(x)))) + "\t\t");
            System.out.print("tan" + x + "\t " + (df.format(Math.tan(Math.toRadians(x)))) + "\n");

        }
    }
}