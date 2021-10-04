package QN4;

import java.util.Arrays;

class EmailCreation {
    protected String[] name;
    protected String[] emails;

    EmailCreation(String[] name) {
        this.name = name;
        emails = new String[name.length];
    }

    public String[] createEmail() throws NameException {
        String domain = "@abc.com.np";
        int i = 0;
        StringBuilder email = new StringBuilder();
        for (String s : name) {
            String[] arr = s.toLowerCase().split(" ");
            if (arr.length < 2) {
                throw new NameException("Full name not supplied.");
            }
            if (arr.length == 2) {
                email = email.append(arr[0].substring(0, 1)).append(arr[1]);
                if (Arrays.asList(emails).contains(email.toString())) {
                    email.append("1");
                }
            } else if (arr.length == 3) {
                email.append(arr[0].substring(0, 1)).append(arr[1].substring(0, 1)).append(arr[2]);
                if (Arrays.asList(emails).contains(email.toString())) {
                    email.append("1");
                }
            }
            emails[i] = email.toString();
            email.setLength(0);
            i++;
        }
        for (i = 0; i < emails.length; i++) {
            emails[i] += domain;
        }
        return emails;


    }
}
