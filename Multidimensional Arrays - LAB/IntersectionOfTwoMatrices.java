import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][cols];
        //read first matrix
        for(int row = 0; row<rows; row++){
            String[] rowData = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols ; col++) {
                firstMatrix[row][col] = rowData[col].charAt(0);
            }
        }
        //read second matrix
        char[][] secondMatrix = new char[rows][cols];
        for(int row = 0; row<rows; row++){
            String[] rowData = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols ; col++) {
                secondMatrix[row][col] = rowData[col].charAt(0);
            }
        }
        //compare
        for(int row = 0; row<rows; row++){
            for (int col = 0; col < cols ; col++) {
                if(firstMatrix[row][col]==secondMatrix[row][col]){
                    System.out.print(firstMatrix[row][col] + " ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
