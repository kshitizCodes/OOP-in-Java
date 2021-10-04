//10. Create an array to hold 10 numbers.
//    Print all of the numbers in the array in ascending order.
package Lab1;

public class QN10 {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println("The array is: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + arr[i]);
        }
        System.out.println("");
        int temp = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nThe array in ascending order is: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("\t" + arr[i]);
        }
    }
}
