import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sizeFirstSet = Integer.parseInt(input.split("\\s+")[0]);
        int sizeSecondSet = Integer.parseInt(input.split("\\s+")[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();
        //1.пълним двата сета
        for (int i = 1; i <= sizeFirstSet ; i++) {
            firstSet.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 1; i <=sizeSecondSet ; i++) {
            secondSet.add(Integer.parseInt(scanner.nextLine()));
        }

        //2.взимаме общите елементи от двата сета
        //сет1 - (1,3,5,7); сет2 - (3,4,5); сет3(3,5)
        Set<Integer> duplicateElements = new LinkedHashSet<>();
        for (int number: firstSet) {
            if(secondSet.contains(number)){
                duplicateElements.add(number);
            }
        }
        //начин 2:
        //firstSet.retainAll(secondSet);
        duplicateElements.forEach(el -> System.out.print(el + " "));

    }
}
