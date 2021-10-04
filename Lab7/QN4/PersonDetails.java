package QN4;

class PersonDetails {
    private String name;
    private String address;
    private long phoneNumber;
    private long accountNumber;

    PersonDetails(String name, String address, long phoneNumber, long accountNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}
