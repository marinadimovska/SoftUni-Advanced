import java.util.*;

public class HandsOfCards{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Set<String>> players = new LinkedHashMap<>();

        while (!input.equals("JOKER")){
            //input = Peter: 2C, 4H, 9H, AS, QS
            String playerName = input.split(":\\s+")[0];//Peter
            String cards = input.split(":\\s+")[1];//2C, 4H, 9H, AS, QS
            String[] cardsArray = cards.split(",\\s+");
            //съхраняваме каритите в сета
            Set<String> cardsSet = new HashSet<>();
            cardsSet.addAll(Arrays.asList(cardsArray));
            //добавяне в мапа
            //ако не сме го записли
            if(!players.containsKey(playerName)){
                players.put(playerName, cardsSet);
            }
            //ако сме
            else{
                //взимаме до момента картите и добавяме новите
                Set<String> currentCards = players.get(playerName);
                //към текущите добавям новите
                currentCards.addAll(cardsSet);
                players.put(playerName, currentCards);
            }

            input = scanner.nextLine();
        }
        //Peter: 167
        players.entrySet().forEach(entry -> {
            Set<String> cards = entry.getValue();
            int points = getCardsPoint(cards);
            System.out.printf("%s: %d%n",entry.getKey(),points );
        });
    }

    private static int getCardsPoint(Set<String> cards) {
        //символ - стойност
        Map<Character,Integer> symbolsValue = getSymbolsValues();

        //2C, 4H, 9H, AS, QS cards
        int sumPoints = 0;
        for (String card:cards) {
            // 2C card -> power,type
            //сила:J(11) D(12) K(13) A(14)
            //тип:S(4) H(3) D(2) C(1)
            //точки=сила*тип
            int points = 0;
            if(card.startsWith("10")){
                //card is 10
                char type = card.charAt(2);
                points = 10*symbolsValue.get(type);

            }else {
                //4H
                char power = card.charAt(0);
                char type = card.charAt(1);
                points = symbolsValue.get(power) * symbolsValue.get(type);
            }
            sumPoints += points;
        }

        return sumPoints;
    }

    private static Map<Character, Integer> getSymbolsValues() {
        Map<Character, Integer> charValues = new HashMap<>();
        charValues.put('2', 2);
        charValues.put('3', 3);
        charValues.put('4', 4);
        charValues.put('5', 5);
        charValues.put('6', 6);
        charValues.put('7', 7);
        charValues.put('8', 8);
        charValues.put('9', 9);
        charValues.put('J', 11);
        charValues.put('Q', 12);
        charValues.put('K', 13);
        charValues.put('A', 14);
        charValues.put('S', 4);
        charValues.put('H', 3);
        charValues.put('D', 2);
        charValues.put('C', 1);

        return charValues;
    }

}
