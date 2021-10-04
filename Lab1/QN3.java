//3. Write a program to show the use of left shift and right shift operator.
package Lab1;

import java.util.Scanner;

public class QN3 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        System.out.println("The entered number is " + num + " or " + Integer.toBinaryString(num));
        int y = num << 2;
        int z = num >> 2;
        int a = num >>> 2;
        System.out.println("Left shift: " + y + " or " + Integer.toBinaryString(y));
        System.out.println("Right shift " + z + " or " + Integer.toBinaryString(z));
        System.out.println("Zero fill Right shift " + a + " or " + Integer.toBinaryString(a));
    }
}
