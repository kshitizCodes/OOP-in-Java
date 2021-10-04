//9. Write a program to show the concept of break,
//   continue and return.
package Lab1;

public class QN9 {
    static float breakF(int[] arr) {
        float sum = 0;
        for (int i = 0; i < 6; i++) {
            if (arr[i] < 0.0) {
                break;
            }
            sum += arr[i];
        }
        return sum;
        //Unreachable //System.out.println("The sum is " + sum);
    }

    static float continueF(int arr[]) {
        float sum = 0;
        for (int i = 0; i < 6; i++) {
            if (arr[i] < 0.0) {
                continue;
            }
            sum += arr[i];
        }
        return sum;
        //Unreachable //System.out.println("The sum is " + sum);
    }


    public static void main(String[] args) {
        int[] arr = {5, 10, -5, 0, 15, -15};
        System.out.println("The output of continue function is\t" + continueF(arr));
        System.out.println("The output of break function is\t\t" + breakF(arr));
    }
}
