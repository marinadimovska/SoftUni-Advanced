import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> usernames = new LinkedHashSet<>();
        int countUsernames = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countUsernames ; i++) {
            String username = scanner.nextLine();
            usernames.add(username);
        }
        usernames.forEach(System.out::println );


    }
}
