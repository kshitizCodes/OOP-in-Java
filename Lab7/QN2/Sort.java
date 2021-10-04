package QN2;

public class Sort {
    public static void main(String[] args) {
        Double[] arr = { 0.555, 0.968, 0.567, 0.369, 0.222 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if ((arr[i].compareTo(arr[j])) < 0) {
                    Double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (double a : arr) {
            System.out.println(a);
        }
    }
}