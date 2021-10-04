package QN4;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PersonDetails personDetail1 = new PersonDetails("This Person", "That Street", 123456789L, 1000L);
        BankingDetails bankingDetail1 = new BankingDetails(2000L, 1000L, false, 5.0);
        PersonDetails personDetail2 = new PersonDetails("That Person", "This Street", 987654321L, 2000L);
        BankingDetails bankingDetail2 = new BankingDetails(1000L, 2000L, true, 4.0);

        Hashtable<Long, PersonDetails> person = new Hashtable<>();
        person.put(personDetail1.getAccountNumber(), personDetail1);
        person.put(personDetail2.getAccountNumber(), personDetail2);

        Hashtable<Long, BankingDetails> bank = new Hashtable<>();
        bank.put(bankingDetail1.getAccountNumber(), bankingDetail1);
        bank.put(bankingDetail2.getAccountNumber(), bankingDetail2);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter bank account no.: ");
        long accountNo = scan.nextLong();
        scan.close();

        bank.forEach((key, value) -> {
            person.forEach((i, j) -> {
                if (key == accountNo && i == accountNo) {
                    System.out.println(key + "\t" + j.getName() + "\t" + j.getAddress() + "\t" + j.getPhoneNumber()
                            + "\t" + value.getCardNumber() + "\t" + (value.isMobileBanking() ? "Yes" : "No") + "\t"
                            + value.getInterestRate());
                }
            });
        });

    }

}
