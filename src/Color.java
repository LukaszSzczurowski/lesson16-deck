public enum Color {
    CLUBS("żołądź", "clubs"),
    DIAMONDS("dzwonek", "diamonds"),
    HEARTS("serce", "hearts"),
    SPADES("wino", "spades");

    private String polishColor;
    private String englishColor;

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
