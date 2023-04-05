import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[][] matrix = new int[n][n];

            // read the matrix from the console
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            // print the first diagonal
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[i][i] + " ");
            }
            System.out.println();

            // print the second diagonal
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[n-i-1][i] + " ");
            }
            System.out.println();
        }
    }


