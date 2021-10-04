package Q2;

class Currency {
    int rupee;
    int paisa;

    Currency(int rupee, int paisa) {
        this.rupee = rupee;
        this.paisa = paisa;
    }

    Currency addCurrency(Currency C) {
        int rupeeSum = rupee + C.rupee;
        int paisaSum = paisa + C.paisa;
        while (paisaSum >= 100) {
            rupeeSum++;
            paisaSum -= 100;
        }
        return new Currency(rupeeSum, paisaSum);
    }

    Currency subtractCurrency(Currency C) {
        int self = rupee * 100 + paisa;
        int notSelf = C.rupee * 100 + C.paisa;
        int res = self - notSelf;
        if (res < 0) {
            return new Currency(res / 100, -res % 100);
        } else {
            return new Currency(res / 100, res % 100);
        }
    }
}
