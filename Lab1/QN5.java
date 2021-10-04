//5. Write a program in java to show:
//   i. addition of two matrices
//   ii. Transpose of a matrix.
package Lab1;

public class QN5 {
    static void matrixAdd() {
        int sum[][] = new int[2][2];
        int matrixA[][] = {{1, 2}, {3, 4}};
        int matrixB[][] = {{9, 8}, {7, 6}};
        System.out.println("5i\nMatrixA:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("\t" + matrixA[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("MatrixB:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("\t" + matrixB[i][j]);
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println("The sum of matrixA and matrixB is: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("\t" + sum[i][j]);
            }
            System.out.println(" ");
        }
    }

    static void matrixTranspose() {
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] temp = {{0, 0}, {0, 0}};
        System.out.println("\n5ii\nMatrixA before Transpose");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("\t" + matrixA[i][j]);
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                temp[i][j] = matrixA[j][i];
            }
        }
        System.out.println("\nMatrix B after Transpose");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixA[i][j] = temp[i][j];
                System.out.print("\t" + matrixA[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        matrixAdd();
        matrixTranspose();
    }
}

