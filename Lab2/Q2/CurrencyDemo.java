package Q2;

public class CurrencyDemo {
    public static void main(String[] args) {
        Currency c1 = new Currency(100, 10);
        Currency c2 = new Currency(200, 50);
        Currency c3 = c1.addCurrency(c2);
        Currency c4 = c1.subtractCurrency(c2);
        System.out.println("Addition: " + c3.rupee + " Rupees " + c3.paisa + " Paisa");
        System.out.println("Subtraction: " + c4.rupee + " Rupees " + c4.paisa + " Paisa");
    }
}
