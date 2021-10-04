package QN1;

class Person {
    private int memberID;
    private String firstName;
    private String lastName;

    Person(int memberID, String firstName, String lastName) throws MemberIDLessThanZeroException, StringEmptyOrNullException {
        setMemberID(memberID);
        setFirstName(firstName);
        setLastName(lastName);
    }

    void setMemberID(int memberID) throws MemberIDLessThanZeroException {
        if (memberID <= 0) {
            throw new MemberIDLessThanZeroException("MemberID can't be 0 or negative!");
        } else {
            this.memberID = memberID;
        }
    }

    void setFirstName(String firstName) throws StringEmptyOrNullException {
        if (firstName == null || firstName.isEmpty()) {
            throw new StringEmptyOrNullException("First Name can't be null or empty.");
        } else {
            this.firstName = firstName;
        }
    }

    void setLastName(String lastName) throws StringEmptyOrNullException {
        if (lastName == null || lastName.isEmpty()) {
            throw new StringEmptyOrNullException("Last Name can't be null or empty.");
        } else {
            this.lastName = lastName;
        }
    }
}
