import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //име на човек - тел.номер
        Map<String,String > phonebook = new HashMap<>();

        String data = scanner.nextLine();
        //запълване на phonebook
        while (!data.equals("search")){
            //input = John-00359888001122
            String name = data.split("-")[0];
            String phoneNumber =data.split("-")[1];
            phonebook.put(name, phoneNumber);

            data = scanner.nextLine();
        }
        //търсене в phonebook
        String name = scanner.nextLine();
        while(!name.equals("stop")){
            //1. името има ли го в тел.указател
            if(phonebook.containsKey(name)){
                System.out.println(name + " -> " + phonebook.get(name));
            }
            //2. ако името го няма
            else{
                System.out.printf("Contact %s does not exist.\n", name);
            }
            name = scanner.nextLine();
        }
    }
}
