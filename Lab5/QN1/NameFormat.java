package QN1;

class NameFormat {
    private String name;

    NameFormat(String name) {
        this.name = name;
    }

    public String formatName() {
        String[] arr = name.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
        }
        return sb.toString();
    }
}
