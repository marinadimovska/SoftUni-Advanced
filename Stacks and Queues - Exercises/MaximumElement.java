import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //броя на въвежданите
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int inputNumber;
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            //"1 X" - Push the element X into the stack.
            //"2" - Delete the element present at the top of the stack.
            //"3" - Print the maximum element in the stack.

            if (input== 1) {
                int x = scanner.nextInt();
                stack.push(x);
            }
            else if (input == 2) {
                stack.pop();
            }
            else if (input== 3) {
                System.out.println(Collections.max(stack));
            }
        }
        }
    }

