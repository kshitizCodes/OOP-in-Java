package QN3;

class Domain {
    private String[] old;

    Domain(String[] old) {
        this.old = old;
    }

    public void newDomain() {
        for (String s : old) {
            String[] arr = s.split("@");
            StringBuilder newDomain = new StringBuilder();
            newDomain.append(arr[0]).append("@pqr.edu.np");
            System.out.println(s + " ->  " + newDomain);
        }
    }
}
