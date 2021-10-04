package QN5;

class CSVDemo {
    public static void main(String[] args) {
        String[] phones = {"+977-9841283783", "984-1-234-567", "+9841-234-342", "09779801234321"};
        CSV csv = new CSV(phones);
        System.out.println(csv.format());
    }
}
