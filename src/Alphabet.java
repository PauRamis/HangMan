public class Alphabet {
    public String getUsedChars() {
        return usedChars;
    }

    private String usedChars = "";

    public boolean isUsed(char c) {
        return this.usedChars.contains("" + c);
    }

    public void doGuess(char c) {
        usedChars += c;
    }


}


interface AlphabetDisplay {
    void display(Alphabet a);
}

class TextAlphabetDisplay implements AlphabetDisplay {
    public void display(Alphabet a) {
        String usedChars = a.getUsedChars();
        System.out.println("Used chars: " + usedChars);
    }
}