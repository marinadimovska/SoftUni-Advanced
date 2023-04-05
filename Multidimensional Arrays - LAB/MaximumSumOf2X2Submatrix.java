import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sizeOfMatrix = scanner.nextLine().split(", ");
        
        int rows = Integer.parseInt(sizeOfMatrix[0]);
        int cols = Integer.parseInt(sizeOfMatrix[1]);
        int[][] firstMatrix = new int[rows][cols];
        //read first matrix
        for (int i = 0; i < rows ; i++) {
            int[] rowData = Arrays.stream(scanner.nextLine().split(", ")).
                    mapToInt(Integer::parseInt).toArray();
               firstMatrix[i]= rowData;
        }
        // Find biggest sum of 2x2 submatrix
        int maxSum = Integer.MIN_VALUE;
        int[][] maxSubmatrix = new int[2][2];
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                int sum = firstMatrix[i][j] + firstMatrix[i][j+1] + firstMatrix[i+1][j] + firstMatrix[i+1][j+1];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxSubmatrix[0][0] = firstMatrix[i][j];
                    maxSubmatrix[0][1] = firstMatrix[i][j+1];
                    maxSubmatrix[1][0] = firstMatrix[i+1][j];
                    maxSubmatrix[1][1] = firstMatrix[i+1][j+1];
                }
            }
        }
        // Print result
        System.out.println(maxSubmatrix[0][0] + " " + maxSubmatrix[0][1]);
        System.out.println(maxSubmatrix[1][0] + " " + maxSubmatrix[1][1]);
        System.out.println( maxSum);
    }
}
