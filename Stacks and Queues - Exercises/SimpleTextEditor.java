import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommands = Integer.parseInt(scanner.nextLine());
        StringBuilder currentText = new StringBuilder();

        ArrayDeque<String> textStack = new ArrayDeque<>();

        for (int i = 0; i < countCommands; i++) {
            String command = scanner.nextLine();//цифра + параметър
            //1 {string}" - добавя [string] в края на текста.
            //"2 {count}" - изтрива последните [count] елементи от текста.
            //"3 {index}" - връща елемента на позиция [index] от текста.
            //"4" - отменя последната неотменена команда от тип 1 или 2 и връща текста в
            int commandNumber = Integer.parseInt(command.split("\\s+")[0]); //за да получим масив

            switch (commandNumber){
                case 1:
                    textStack.push(currentText.toString());
                    String stringForAppend = command.split("\\s+")[1];
                    currentText.append(stringForAppend);
                    break;
                case 2:
                    textStack.push(currentText.toString());
                    int countElementsToDelete = Integer.parseInt(command.split("\\s+")[1]);
                    int startIndex = currentText.length() -countElementsToDelete;
                    currentText.delete(startIndex, startIndex+countElementsToDelete);
                    break;
                case 3:
                    int index = Integer.parseInt(command.split("\\s+")[1]);
                    System.out.println(currentText.charAt(index -1));
                    break;
                case 4:
                    if(!textStack.isEmpty()) {
                        currentText = new StringBuilder(textStack.pop());
                    }
                    break;
            }
        }
    }
}

