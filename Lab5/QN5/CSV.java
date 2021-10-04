package QN5;

class CSV {
    String[] phone;

    CSV(String[] phone) {
        this.phone = phone;
    }

    public String format() {
        String toReturn = "";
        StringBuffer sb = new StringBuffer();
        for (String s : phone) {
            s = s.replace("+", "");
            s = s.replace("-", "");
            toReturn = s.substring(s.length() - 10);
            sb.append(toReturn).append(", ");
        }
        toReturn = sb.toString();
        toReturn = toReturn.trim();
        return toReturn.substring(0, toReturn.length() - 1);
    }
}
