public enum Figures {

    DWOJKA("Dwójka", "Two"),
    TROJKA("Trójka", "Three"),
    CZWORKA("Czwórka", "Four"),
    PIATKA("Piątka", "Five"),
    SZOSTKA("Szóstka", "Six"),
    SIODEMKA("Siódemka", "Seven"),
    OSEMKA("Ósemka", "Eight"),
    DZIEWIATKA("Dziewiątka", "Nine"),
    DZIESIATKA("Dziesiątka", "Ten"),
    WALET("Walet", "Jack"),
    DAMA("Dama", "Lady"),
    KROL("Król", "King"),
    AS("As", "Ace");

    private String polishName;
    private String englishName;
    private static final int MAX_FIGURE_NUMBER_IN_DECK = 13;

    Figures(String polishName, String englishName) {
        this.polishName = polishName;
        this.englishName = englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public static String[] createPolishFigure() {
        String[] values = new String[MAX_FIGURE_NUMBER_IN_DECK];
        int index = 0;
        for (Figures f : Figures.values()) {
            values[index] = f.getPolishName();
            index++;
        }
        return values;
    }

    public static String[] createEnglishFigure() {
        String[] values = new String[MAX_FIGURE_NUMBER_IN_DECK];
        int index = 0;
        for (Figures f : Figures.values()) {
            values[index] = f.getEnglishName();
            index++;
        }
        return values;
    }

}
