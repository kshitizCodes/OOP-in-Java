//1. Write a program that asks three
//   integer from users and print the greatest one.
package Lab1;

import java.util.Scanner;

public class QN1 {
    public static void main(String[] args) {
        System.out.print("Enter three numbers: ");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        int y = num.nextInt();
        int z = num.nextInt();

        if (x > y && x > z) {
            System.out.println(x + " is the greatest.");
        } else if (y > z) {
            System.out.println(y + " is the greatest.");
        } else {
            System.out.println(z + " is the greatest.");
        }
        //System.out.println(((x > y && x > z) ? x : (y > z) ? y : z) + " is the greatest.");
    }
}
