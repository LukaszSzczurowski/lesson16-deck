import java.util.*;

public class GenerateDecks {

    private static final String PL = "PL";
    private static final String EN = "EN";

    public void generatorForUser(String chose) throws NullPointerException {
        if (chose.equalsIgnoreCase(PL))
            System.out.println(generatePolishDeck());
        else if (chose.equalsIgnoreCase(EN))
            System.out.println(generateEnglisDeck());
    }

    private List<String> generatePolishDeck() {
        String[] fig = Figures.createPolishFigure();
        String[] col = Colors.createPolishColor();
        return getStringStringMap(fig, col);
    }

    private List<String> generateEnglisDeck() {
        String[] fig = Figures.createEnglishFigure();
        String[] col = Colors.createEnglishColor();
        return getStringStringMap(fig, col);
    }

    private List<String> getStringStringMap(String[] fig, String[] col) {
        List<String> deck = new LinkedList<>();
        for (int i = 0; i < col.length; i++) {
            System.out.println(col[i]);
            for (int j = 0; j < fig.length; j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(fig[j] + " " + col[i] + "\n");
                deck.add(sb.toString());
            }
        }
        return deck;
    }

}
