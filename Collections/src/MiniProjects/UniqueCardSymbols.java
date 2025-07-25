package MiniProjects;
import java.util.*;
public class UniqueCardSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Cards> cardSet = new LinkedHashSet<>();

        while (cardSet.size() < 4) {
            System.out.println("Enter a card :");
            String symbol = sc.next();
            int number = sc.nextInt();

            // Check if symbol already exists
            boolean symbolExists = false;
            for (Cards c : cardSet) {
                if (c.getSymbol().equals(symbol)) {
                    symbolExists = true;
                    break;
                }
            }

            if (!symbolExists) {
                cardSet.add(new Cards(symbol, number));
            }
        }

        System.out.println("Four symbols gathered in " + cardSet.size() + " cards.");

        // Sort by symbol alphabetically
        List<Cards> sortedCards = new ArrayList<>(cardSet);
        sortedCards.sort(Comparator.comparing(Cards::getSymbol));

        System.out.println("Cards in Set are:");
        for (Cards card : sortedCards) {
            System.out.println(card);
        }

        sc.close();
    }
}
