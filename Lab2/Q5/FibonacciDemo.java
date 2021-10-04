package Q5;

import java.util.Scanner;

public class FibonacciDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n to get fibonacci number: ");
        int n = scan.nextInt();
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.fibonacci(n));
    }
}
