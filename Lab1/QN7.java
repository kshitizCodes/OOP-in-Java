//7. Write a program in java to convert decimal number to binary
//   and binary to decimal.
package Lab1;

import java.util.Scanner;
import java.lang.Math;

public class QN7 {
    static int decToBin(int num) {
        int i = 1;
        int bin = 0;
        int rem;
        while (num != 0) {
            rem = num % 2;
            num /= 2;
            bin += rem * i;
            i *= 10;
        }
        return bin;
    }

    static int binToDec(int num) {
        int rem, dec = 0;
        int i = 0;
        while (num != 0) {
            rem = num % 10;
            num /= 10;
            dec += rem * Math.pow(2, i);
            i++;
        }
        return dec;
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("1. Decimal To Binary. \t 2. Binary to decimal.\n");
        System.out.print("Enter your choice: ");
        int ch = inp.nextInt();
        int num;
        switch (ch) {
            case 1:
                System.out.print("\tEnter a decimal number: ");
                num = inp.nextInt();
                System.out.println("\t\t-> " + num + " in binary is " + decToBin(num));
                break;
            case 2:
                System.out.print("\tEnter a binary number: ");
                num = inp.nextInt();
                System.out.println("\t\t-> " + num + " in decimal is " + binToDec(num));
                break;
            default:
                System.out.println("Error in choice. Exiting.....");
                System.exit(0);
                break;
        }
    }
}
