import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sizeOfMatrix =scanner.nextLine().split(", ");
        int rows = Integer.parseInt(sizeOfMatrix[0]);
        int cols = Integer.parseInt(sizeOfMatrix[1]);

        int matrix[][] = new int[rows][cols];
       
        //read the matrix
        for (int i = 0; i < rows ; i++) {
            int[] rowOfMatrix = Arrays.stream(scanner.nextLine().split(", ")).
                    mapToInt(Integer::parseInt).toArray();
            matrix[i] = rowOfMatrix;
        }
        //sum the elements of the matrix
        int sum = 0;
        for (int i= 0; i < rows ; i++) {
            for (int j = 0; j < cols ; j++) {
                        sum = sum+matrix[i][j];
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
