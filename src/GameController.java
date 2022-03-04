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

    void playGame(Word w) {
        Alphabet alphabet = new Alphabet();
        while (!gallows.isHung() && !w.isGuessed()){
            //Mostrem l'estat del joc
            this.gallows.display();
            this.wordDisplay.display(w);
            this.alphabetDisplay.display(alphabet);

            char c = getInput();


        }
    }

    private char getInput() {
        while (true){
            String line = scanner.nextLine().toLowerCase(Locale.ROOT);
            //Validam l'entrada de l'usuari
            if (line.length() == 1) {
                char c = line.charAt(0);
                if (c >= 'a' && c<= 'z')
                return line.charAt(0);
            } else {
                System.out.println("Entrada no valida");
            }
        }

    }
}
