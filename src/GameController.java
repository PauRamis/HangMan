import java.util.Locale;
import java.util.Scanner;

public class GameController {
    private AlphabetDisplay alphabetDisplay;
    private WordDisplay wordDisplay;
    private Gallows gallows;
    private Scanner scanner = new Scanner(System.in);

    GameController(AlphabetDisplay ad, WordDisplay wd, Gallows g) {
        this.alphabetDisplay = ad;
        this.wordDisplay = wd;
        this.gallows = g;
    }

    void playGame(Word word) {
        Alphabet alphabet = new Alphabet();
        while (!gallows.isHung() && !word.isGuessed()) {
            //Mostrem l'estat del joc
            this.gallows.display();
            this.wordDisplay.display(word);
            this.alphabetDisplay.display(alphabet);

            char c = getInput();
            if (alphabet.isUsed(c)){
                System.out.println("Lletra repetida");
                continue;
            }

            //Lletra valida
            alphabet.doGuess(c);
            if (!word.doGuess(c)){
                this.gallows.addPart();
            }
        }
    }

    //Torna el caracter que introduesqui l'usuari (a - z)
    private char getInput() {
        while (true) {
            String line = scanner.nextLine().toLowerCase(Locale.ROOT);
            //Validam l'entrada de l'usuari
            if (line.length() == 1) {
                char c = line.charAt(0);
                if (c >= 'a' && c <= 'z')
                    return c;
                else System.out.println("L'entrada ha de ser una lletra");
            } else {
                System.out.println("Entrada no valida");
            }
        }
    }
}
