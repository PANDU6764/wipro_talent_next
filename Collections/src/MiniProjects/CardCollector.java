package MiniProjects;
import java.util.*;

class Card {
    private String symbol;
    private int number;

    public Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return symbol + " " + number;
    }
}

public class CardCollector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Card>> cardMap = new TreeMap<>(); // TreeMap for alphabetical order

        System.out.print("Enter Number of Cards: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter card " + i + ":");
            String symbol = sc.nextLine().trim();
            int number = sc.nextInt();
            sc.nextLine(); // consume newline

            Card card = new Card(symbol, number);

            cardMap.putIfAbsent(symbol, new ArrayList<>());
            cardMap.get(symbol).add(card);
        }

        System.out.println("\nDistinct Symbols:");
        for (String symbol : cardMap.keySet()) {
            System.out.println(symbol);
        }

        for (String symbol : cardMap.keySet()) {
            List<Card> cards = cardMap.get(symbol);
            int sum = cards.stream().mapToInt(Card::getNumber).sum();

            System.out.println("\nCards in " + symbol + " Symbol");
            for (Card c : cards) {
                System.out.println(c);
            }
            System.out.println("Number of cards: " + cards.size());
            System.out.println("Sum of Numbers: " + sum);
        }

        sc.close();
    }
}
