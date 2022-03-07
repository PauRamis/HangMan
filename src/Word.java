

public class Word {
    private String theString;
    private String goodChars = "";

    Word(String s) {
        this.theString = s;
    }

    //Mostram les letres de la paraula endivinades
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.theString.length(); i++) {
            char c = this.theString.charAt(i);
            if (goodChars.contains("" + c)){
                sb.append(c);
            } else {
                sb.append('-');
            }
        }
        return sb.toString();
    }

    boolean isGuessed() {
        return false;
    }

    boolean doGuess(char c) {
        if (theString.contains("" + c)){
            this.goodChars += c;
            return true;
        }
        return false;
    }
}


