import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // read the input
        // convert the String to stack
        // pop 33 elements => sum
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");// въвеждаме елемнтите и ги разделяме, заради празното

        ArrayDeque<String> tokens= new ArrayDeque<>();
        Collections.addAll(tokens, input); // добавяме в стека елементите от инпут

        while(tokens.size()>1) {
            int firstNumber = Integer.parseInt(tokens.pop());
            String operator = tokens.pop();
            int secondNumber = Integer.parseInt(tokens.pop());
            int result = 0;
            if (operator.equals("+")) {
                result = firstNumber + secondNumber;
            } else {
                result = firstNumber - secondNumber;
            }
            tokens.push(String.valueOf(result));
        }
        System.out.println(tokens.peek());
    }
}