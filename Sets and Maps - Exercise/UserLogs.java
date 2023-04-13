import java.util.*;

import static javax.swing.UIManager.put;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //user -> {ip -> times} we use it
        TreeMap<String, LinkedHashMap<String, Integer>> data = new TreeMap<>();
        String input = scanner.nextLine();

        while(!input.equals("end")){
        //input IP=192.23.30.40 message='Hello&derps.' user=destroyer
            String[] inputParts = input.split("\\s+");
            String ip = inputParts[0].split("=")[1];
            String message = inputParts[1].split("=")[1];
            String username = inputParts[2].split("=")[1];
        // we don't have username
            if(!data.containsKey(username)){
                data.put(username,new LinkedHashMap<>(){{
                    put(ip, 1);
                }});
            }else{
                //текущия списък с ип
                Map<String, Integer> currentIps = data.get(username);//текущия списък
                //ип да е посетено
                if(currentIps.containsKey(ip)){
                    int currentTimes = currentIps.get(ip);
                    currentIps.put(ip, currentTimes +1);
                }
                //ип да не е посетено
                else{
                    currentIps.put(ip, 1);
                }
            }
            input = scanner.nextLine();
        }
        data.keySet().forEach(username -> {
            System.out.println(username+":");
            Map<String, Integer> ips = data.get(username);
            int ipsCount = ips.size();
            ips.entrySet().forEach(entry -> {
                ipsCount--;
                System.out.println(entry.getKey() + " => " + entry.getValue() + ", ");
            });
        });
    }
}
