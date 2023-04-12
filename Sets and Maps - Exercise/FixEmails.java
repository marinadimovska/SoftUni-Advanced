import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Map<String,String > information = new HashMap<>();
        while(!name.equals("stop")){
            String email = scanner.nextLine();
            if(!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")) {
                information.put(name, email);
            }
            name = scanner.nextLine();
        }
        information.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " +
                entry.getValue()));
    }
}
