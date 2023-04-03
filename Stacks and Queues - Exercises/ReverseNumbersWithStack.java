import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputNumbers = input.split("\\s+"); //искам да взема този инпут и да го сплитна по интервали

        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < inputNumbers.length ; i++) {
            stack.push(inputNumbers[i]);
        }

        while (!stack.isEmpty()){
            System.out.printf(stack.pop()+ " ");
        }
    }
}
