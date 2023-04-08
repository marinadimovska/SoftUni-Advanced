import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        //read matrix
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }


        int maxSum = Integer.MIN_VALUE;
        int[][] maxSumMatrix = new int[3][3];

        for (int i = 0; i <= rows - 3; i++) {
            for (int j = 0; j <= cols - 3; j++) {
                int sum = 0;
                int[][] subMatrix = new int[3][3];
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        subMatrix[k][l] = matrix[i + k][j + l];
                        sum += subMatrix[k][l];
                    }
                }
                if (sum > maxSum) {
                    maxSum = sum;
                    maxSumMatrix = subMatrix;
                }
            }
        }

        System.out.println("Sum = " +maxSum);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(maxSumMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}

