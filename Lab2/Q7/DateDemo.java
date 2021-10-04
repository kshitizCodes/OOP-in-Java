package Q7;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date(2021, 1, 10);
        Date date1 = new Date(2021, 1, 10);
        if (date.isBefore(date1) == 1) {
            System.out.println(date.toString() + " is before " + date1.toString() + ".");
        } else if (date.isBefore(date1) == -1) {
            System.out.println(date.toString() + " is after " + date1.toString() + ".");
        } else {
            System.out.println(date.toString() + " is the same day as " + date1.toString() + ".");
        }
    }
}
