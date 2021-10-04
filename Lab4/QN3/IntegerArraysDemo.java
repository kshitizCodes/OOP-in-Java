package QN3;

public class IntegerArraysDemo {
    public static void main(String[] args) {
        int[] arrA = {1, 2, 3, 4, 5};
        int[] arrB = {1, 2, 3, 4, 5};
        int[] result = new int[arrA.length];
        int n = 3;
        try {
            IntegerArrays ia = new IntegerArrays(arrA, arrB, n);
            result = ia.add();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            for (int i = 0; i < n; i++) {
                System.out.println(result[i]);
            }
        }
    }
}
