//4. Write a program to check whether the given number is prime or not.
package Lab1;

import java.util.Scanner;


public class QN4 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (n == 1) {
            System.out.println("1 is neither prime nor composite.");
        } else {
            if (isPrime) {
                System.out.print(n + " is Prime.");
            } else {
                System.out.print(n + " is not prime/composite.");
            }
        }
    }
}
