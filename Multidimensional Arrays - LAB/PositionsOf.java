import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sizeOfMatrix = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(sizeOfMatrix[0]);
        int cols = Integer.parseInt(sizeOfMatrix[1]);

        int[][] matrix = new int [rows][cols];
        //read the matrix and write it
        for (int i = 0; i <rows ; i++) {
            String[] rowData = scanner.nextLine().split(" ");
            for (int j = 0; j < cols ; j++) {
                matrix[i][j] = Integer.parseInt(rowData[j]);
            }
        }
        boolean weFoundIt = false;
        int number = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols ; j++) {
                if(matrix[i][j] == number){
                    weFoundIt = true ;
                    System.out.println(i +" "+j);

                }
            }
        }
        if (!weFoundIt == true){
            System.out.println("not found");
        }
    }
}
