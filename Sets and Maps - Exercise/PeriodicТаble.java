import java.util.*;

public class PeriodicТаble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); //броя на редовете
        Set<String> uniqueElements = new TreeSet<>();

        for (int rows = 1; rows <= n; rows++) {
            String [] chemicalElements = scanner.nextLine().split("\\s+"); //Mo O Ce
            //начин 1:
            for (String el: chemicalElements) {
                uniqueElements.add(el);
            }
            //начин 2:
            //Collections.addAll(Arrays.asList(chemicalElements), uniqueElements);

            //начин 3:
            //uniqueElements.addAll(Arrays.asList(chemicalElements));
        }
        uniqueElements.forEach(el -> System.out.print(el + " "));
    }
}
