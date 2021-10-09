package QN5;

public class SalesTransaction {
    private final String name;
    private final Date date;
    private final String itemPurchased;
    private final double quantity;
    private final double unitPrice;

    SalesTransaction(String name, Date date, String itemPurchased, double quantity, double unitPrice) {
        this.name = name;
        this.date = date;
        this.itemPurchased = itemPurchased;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    static class Date {
        private final int year;
        private final int month;
        private final int day;

        Date(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public String _getDate() {
        return this.date.year + "" + this.date.month + "" + this.date.day;
    }

    public String getDate() {
        return this.date.year + "-" + this.date.month + "-" + this.date.day;
    }

    @Override
    public String toString() {
        return this.name + "\t\t" + this.getDate() + "\t\t" + this.itemPurchased + "\t\t" +
                this.quantity + "\t\t" + this.unitPrice;
    }
}

