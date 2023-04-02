import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> browserHistory = new ArrayDeque<>();

        String input = scanner.nextLine();
        String currentURL = "";

        while(!input.equals("home")){
            // read url or back
            if(input.equals("back")){
                if(browserHistory.size()>1){
                    browserHistory.pop();
                    currentURL = browserHistory.peek();
                    System.out.println(currentURL);
                }else{
                    System.out.println("No previous url");
                }

            }else{
                browserHistory.push(input);
                currentURL = browserHistory.peek();
                System.out.println(currentURL);
            }
            input = scanner.nextLine();
        }
    }
    }

