package QN4;

public class BankingDetails {
    private long accountNumber;
    private long cardNumber;
    private boolean mobileBanking;
    private double interestRate;

    BankingDetails(long accountNumber, long cardNumber, boolean mobileBanking, double interestRate) {
        this.accountNumber = accountNumber;
        this.cardNumber = cardNumber;
        this.mobileBanking = mobileBanking;
        this.interestRate = interestRate;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public boolean isMobileBanking() {
        return mobileBanking;
    }

    public double getInterestRate() {
        return interestRate;
    }

}
