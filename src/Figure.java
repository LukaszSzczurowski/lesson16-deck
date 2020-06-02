public enum Figure {

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

    Figure(String polishName, String englishName) {
        this.polishName = polishName;
        this.englishName = englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public String getEnglishName() {
        return englishName;
    }
}
