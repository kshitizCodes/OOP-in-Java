package QN2;

import java.util.Scanner;

public class TokenizeDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String toTokenize = scan.nextLine();
        scan.close();
        Tokenize tokenize = new Tokenize(toTokenize);
        tokenize.print();
    }
}
