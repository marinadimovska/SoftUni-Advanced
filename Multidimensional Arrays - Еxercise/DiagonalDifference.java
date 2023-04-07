import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        //put elements into matrix
        for (int rows = 0; rows < matrix.length ; rows++) {
            for (int cols = 0; cols <matrix.length; cols++) {
                matrix[rows][cols] = scanner.nextInt();
            }
        }
        int sumPrimary = 0;
        //get primary diagonal sum
        for (int rows = 0; rows < matrix.length ; rows++) {
            for (int cols = 0; cols < matrix.length; cols++) {
                int currentElement = matrix[rows][cols];
                if(rows==cols){
                    sumPrimary += currentElement;
                }
            }
        }
        //get secondary diagonal sum
        int sumSecondary = 0;
        for (int rows = 0; rows < matrix.length ; rows++) {
            for (int cols = 0; cols < matrix.length; cols++) {
                int currentElement = matrix[rows][cols];
                if(cols==n-rows-1){
                    sumSecondary+=currentElement;
                }
            }
        }
        System.out.println(Math.abs(sumPrimary-sumSecondary));
    }
}
