import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class DeckTest {
    public static void main(String[] args) {
        GenerateDecks cards = new GenerateDecks();
        boolean err = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jaką talię wybierasz PL czy EN ?");
        while (err) {
            try {
                String choose = scanner.nextLine();
                cards.generatorForUser(choose);
                err = false;
            } catch (NullPointerException e) {
                e.getMessage();
            } catch (NoSuchElementException e) {
                System.err.println("Nie ma takiej taliji. Spróbuj ponownie");
            }
        }
        System.out.println("Koniec");


    }
}
