package QN5;

public class Customer {
    static AccountType accountType;

    public enum AccountType {
        SAVING, CURRENT, FIXED
    }

    public static void main(String[] args) {
        String name = "This Person";
        accountType = AccountType.CURRENT;
        System.out.println(name + " has " + accountType + " account.");
    }
}
