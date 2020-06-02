import java.util.*;

public class GenerateDecks {

    private static final String PL = "PL";
    private static final String EN = "EN";

    public void generatorForUser(String chose) {
        if (chose.equalsIgnoreCase(PL)){
            List<Card> polishDeck = generateDeck();
            printPolishDeck(polishDeck);
        }
        else if (chose.equalsIgnoreCase(EN)){
            List<Card> englishDeck = generateDeck();
            printEnglishDeck(englishDeck);
        }
        else
            throw new IllegalArgumentException("Nie ma takiej nazwy");
    }

    private void printEnglishDeck(List<Card> englishDeck) {
        for (Card card : englishDeck) {
            System.out.println(card.getFigure().getEnglishName() + " of " + card.getColor().getEnglishColor());
        }
    }

    private void printPolishDeck(List<Card> polishDeck) {
        for (Card card : polishDeck) {
            System.out.println(card.getFigure().getPolishName() + " " + card.getColor().getPolishColor());
        }
    }

    private List<Card> generateDeck() {
        List<Card> deck = new ArrayList<>();
        Figure[] figures = Figure.values();
        Color[] colors = Color.values();

        for (Color color : colors) {
            for (Figure figure : figures) {
                deck.add(new Card(color, figure));
            }
        }
        return deck;
    }

}
