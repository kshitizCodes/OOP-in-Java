//6. Write a java program to check whether
//   the given number is palindrome or not
package Lab1;

import java.util.Scanner;

public class QN6 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int original = num;
        int remainder;
        int reversed = 0;
        while (num != 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }
        System.out.println("Original number is " + original);
        System.out.println("Reversed number is " + reversed);
        System.out.println((original == reversed) ? "Entered number is palindrome." : "Entered number is not palindrome.");
    }
}
