public enum Color {
    CLUBS("żołądź", "clubs"),
    DIAMONDS("dzwonek", "diamonds"),
    HEARTS("serce", "hearts"),
    SPADES("wino", "spades");

    private String polishColor;
    private String englishColor;
    private static final int MAX_COLOR_IN_DECK = 4;

    Color(String polishColor, String englishColor) {
        this.polishColor = polishColor;
        this.englishColor = englishColor;
    }

    public String getPolishColor() {
        return polishColor;
    }

    public String getEnglishColor() {
        return englishColor;
    }
}
