package QN1;

class NameFormatDemo {
    public static void main(String[] args) {
        NameFormat person1 = new NameFormat("RAM PRASAD");
        NameFormat person2 = new NameFormat("hari gopal acharya");
        System.out.println(person1.formatName());
        System.out.println(person2.formatName());
    }
}
