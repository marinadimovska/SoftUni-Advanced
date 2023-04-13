import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("");
        Map<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < text.length; i++) {
            if(!map.containsKey(text[i])){
                map.put(text[i],1 );
            }
            else if(map.containsKey(text[i])){
                map.put(text[i], map.get(text[i] + 1) );

            }
        }
        //S: 1 time/s
        map.entrySet().forEach(entry -> System.out.printf("%s: %d time/s\n", entry.getKey(), entry.getValue()));
    }
}
