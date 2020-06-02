import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DeckTest {
    public static void main(String[] args) {
        GenerateDecks cards = new GenerateDecks();
        Scanner scanner = new Scanner(System.in);
        boolean err = true;

        System.out.println("Jaką talię wybierasz PL czy EN ?");
        while (err) {
            try {
                String choose = scanner.nextLine();
                cards.generatorForUser(choose);
                err = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Nie ma takiej tali. Wpisz poprawnie jeszcze raz");
            }
        }
        System.out.println("Koniec");
    }
}
