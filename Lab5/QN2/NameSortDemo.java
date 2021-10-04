package QN2;

class NameSortDemo {
    public static void main(String[] args) {
        String[] names = {"Ram", "shyam", "indra", "Pramod", "hari"};
        NameSort name = new NameSort(names);
        String[] sorted = name.sort();
        for (String x : sorted) {
            System.out.print(x + " ");
        }
    }
}
