package QN2;

class NameSort {
    private String[] names;

    NameSort(String[] names) {
        this.names = names;
    }

    public String[] sort() {
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (names[i].compareToIgnoreCase(names[j]) < 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        return names;
    }
}
