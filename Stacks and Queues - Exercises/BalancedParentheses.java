import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //последната отворена да е равена на последната затворена
        String input = scanner.nextLine();
        boolean areBalanced = false;

        ArrayDeque<Character> openBracketsStack = new ArrayDeque<>();

        for (int index = 0; index <input.length() ; index++) {
            char currentBracket = input.charAt(index);
            //проверка за отворена скоба
            if(currentBracket == '(' || currentBracket == '[' || currentBracket == '{' ){
                openBracketsStack.push(currentBracket);
            }//проверка за затворена
            else if (currentBracket == ')' || currentBracket == ']' || currentBracket == '}') {
                //последната отворена съвпада с текуща затворена
                if(openBracketsStack.isEmpty()){
                    areBalanced = false;
                    break;
                }
                char lastOpen = openBracketsStack.pop(); //последната отворена скоба
                //проверка дали текущата затворена съвпада с последната отворена
                if(currentBracket == '(' && lastOpen == ')'){
                    //balance
                    areBalanced = true;
                } else if (currentBracket == '{' && lastOpen == '}') {
                    //balance
                    areBalanced = true;
                }
                else if (currentBracket == '[' && lastOpen == ']') {
                    //balance
                    areBalanced = true;
                }
                else{
                    //no balance
                    areBalanced = false;
                    break;
                }
            }
        }
        //преминали през всички скоби
        if(areBalanced ){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
