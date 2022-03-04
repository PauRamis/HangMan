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
        while (!gallows.isHung() && !w.isGuessed()){
            this.gallows.display();
        }
    }

    private char getInput() {
        return 0;
    }
}
