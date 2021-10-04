package QN4;


class EmailCreationDemo {
    public static void main(String[] args) {
        String[] users = {"Ram Kumar Shah", "Pritam Shrestha", "Ravi Kumar Shah", "Mithlesh Chaudhary", "Pramod Shrestha", "Mahesh Chaudhary"};
        EmailCreation email = new EmailCreation(users);
        String[] emails = new String[users.length];
        try {
            emails = email.createEmail();
        } catch (NameException e) {
            e.printStackTrace();
        }
        for (String s : emails) {
            System.out.println(s);
        }
    }
}
