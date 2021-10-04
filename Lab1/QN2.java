package Lab1;

public class QN2 {
    static void i2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("\t" + j);
            }
            System.out.println(" ");
        }
    }

    static void ii2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("\t* ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("2i");
        i2();
        System.out.println("2ii");
        ii2();
    }
}
