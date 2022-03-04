import java.util.Scanner;

public class GameController {
private AlphabetDisplay alphabetDisplay;
private WordDisplay wordDisplay;
private Gallows gallows;

    GameController(AlphabetDisplay ad, WordDisplay wd, Gallows g) {
        this.alphabetDisplay = ad;
        this.wordDisplay = wd;
        this.gallows = g;
    }

    void playGame(Word w) {
        Alphabet alphabet = new Alphabet();
        //Mentre no hagi acabat, mostram el
        while (!gallows.isHung() && !w.isGuessed()){
            //Mostrem estat del joc
            this.gallows.display();
            this.wordDisplay.display(w);
            this.alphabetDisplay.display(alphabet);
        }
    }

    private char getInput() {
        return 0;
    }
}
