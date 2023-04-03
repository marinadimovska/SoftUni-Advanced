import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] commandNumbers = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(commandNumbers[0]); //броя на елементите,които трябва да добавя в стека
        int s = Integer.parseInt(commandNumbers[1]); //брой на числата за премахване - поп
        int  x = Integer.parseInt(commandNumbers[2]); // числото,което трябва да проверим

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // добавяне н брой пъти
        for (int i = 1; i <= n ; i++) {
            stack.push(scanner.nextInt());
        }

        for (int i = 1; i <= s ; i++) {
            stack.pop();

        }

        // проверка дали х го има
        if(stack.contains(x)){// х го има в стека
            System.out.println("true");
        }else{//х го няма в стека
            //има елементи в стека - мин.стойност
            //няма елементи в стека - 0
            if(!stack.isEmpty()){
                System.out.println(Collections.min(stack));
            }
            else{
                System.out.println(0);
            }
        }
    }
}
