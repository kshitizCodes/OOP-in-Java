package QN3;

public class IntegerArrays {
    int[] a;
    int[] b;
    int n;

    IntegerArrays(int[] a, int[] b, int n) {
        this.a = a;
        this.b = b;
        this.n = n;
    }

    int[] add() throws NegativeValueException, ArrayLengthException {
        if (n < 0) {
            throw new NegativeValueException("Number of terms can't be negative");
        }
        if (n > a.length || n > b.length) {
            throw new ArrayLengthException("Insufficient elements in supplied array.");
        }
        int[] arrTemp = new int[n];
        for (int i = 0; i < n; i++) {
            arrTemp[i] = a[i] + b[i];
        }
        return arrTemp;
    }
}
