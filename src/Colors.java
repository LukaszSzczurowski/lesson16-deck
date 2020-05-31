public enum Colors {
    TREFL (" żołądź","of clubs"),
    KARO (" dzwonek","of diamonds"),
    KIER (" serce","of hearts"),
    PIK (" wino","of spades");

    private String polishColor;
    private String englishColor;
    private static final int MAX_COLOR_IN_DECK = 4;

    Colors(String polishColor, String englishColor) {
        this.polishColor = polishColor;
        this.englishColor = englishColor;
    }

    public String getPolishColor() {
        return polishColor;
    }

    public String getEnglishColor() {
        return englishColor;
    }

    public static String[] createPolishColor() {
        String[] values = new String[MAX_COLOR_IN_DECK];
        int index = 0;
        for (Colors f : Colors.values()) {
            values[index] = f.getPolishColor();
            index++;
        }
        return values;
    }
     public static String[] createEnglishColor() {
        String[] values = new String[MAX_COLOR_IN_DECK];
        int index = 0;
        for (Colors f : Colors.values()) {
            values[index] = f.getEnglishColor();
            index++;
        }
        return values;
    }

}
