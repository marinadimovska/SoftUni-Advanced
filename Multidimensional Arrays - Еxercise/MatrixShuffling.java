/*import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");

        }
        String command = scanner.nextLine();
        while (!command.equals("END")) {
            //validation command
            //invalid
            if (!validateCommand(command, rows, cols)) {
                System.out.println("Invalid input!");
            } else {
                //swap 0 0 1 1
                String[] commandParts = command.split("\\s+");
                int row1 = Integer.parseInt(commandParts[1]);//>= 0 && < rows
                int col1 = Integer.parseInt(commandParts[2]);//>= 0 && < rows
                int row2 = Integer.parseInt(commandParts[3]);//>= 0 && < rows
                int col2 = Integer.parseInt(commandParts[4]);//>= 0 && < rows

                String firstElement = matrix[row1][col1];
                String secondElement = matrix[row2][col2];

                matrix[row1][col1] = secondElement;
                matrix[row2][col2] = firstElement;

                printMatrix(matrix, rows, cols);

            }

            command = scanner.nextLine();
        }
    }
    public static void printMatrix(String[][] matrix,int rows,  int cols){
        for (int row = 0; row < rows ; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.println(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    private static boolean validateCommand(String command, int rows, int cols) {
        //command = row1 col1 row2 col2; 5parts
        String[] commandParts = command.split("\\s+");
        if(commandParts.length != 5){
            return false;
        }
        //must start with "swap"
        if(!commandParts[0].equals("swap")){
            return false;
        }
        //whether the rows and columns are valid
        int row1 = Integer.parseInt(commandParts[1]);//>= 0 && < rows
        int col1 = Integer.parseInt(commandParts[2]);//>= 0 && < rows
        int row2 = Integer.parseInt(commandParts[3]);//>= 0 && < rows
        int col2 = Integer.parseInt(commandParts[4]);//>= 0 && < rows

        if(row1 <0 || row1>= rows || row2 <0 || row2>= rows || col1 <0 || col1>= cols || col2 <0 || col2>= cols){
            return false;
        }

        return true;
    }
}*/
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine(); // consume the newline character after reading the integer inputs

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] rowElements = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = rowElements[col];
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("END")) {
            if (!validateCommand(command, rows, cols)) {
                System.out.println("Invalid input!");
            } else {
                String[] commandParts = command.split("\\s+");
                int row1 = Integer.parseInt(commandParts[1]);
                int col1 = Integer.parseInt(commandParts[2]);
                int row2 = Integer.parseInt(commandParts[3]);
                int col2 = Integer.parseInt(commandParts[4]);

                String temp = matrix[row1][col1];
                matrix[row1][col1] = matrix[row2][col2];
                matrix[row2][col2] = temp;

                printMatrix(matrix);
            }

            command = scanner.nextLine();
        }
    }

    public static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static boolean validateCommand(String command, int rows, int cols) {
        String[] commandParts = command.split("\\s+");
        if (commandParts.length != 5 || !commandParts[0].equals("swap")) {
            return false;
        }
        int row1 = Integer.parseInt(commandParts[1]);
        int col1 = Integer.parseInt(commandParts[2]);
        int row2 = Integer.parseInt(commandParts[3]);
        int col2 = Integer.parseInt(commandParts[4]);

        if (row1 < 0 || row1 >= rows || row2 < 0 || row2 >= rows || col1 < 0 || col1 >= cols || col2 < 0 || col2 >= cols) {
            return false;
        }

        return true;
    }
}

