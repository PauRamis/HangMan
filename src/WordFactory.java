import java.util.Random;

public interface WordFactory {
    Word makeWord();
}

class DefaultWordFactory implements WordFactory {
    private String[] words = {
            "java",
            "taula"
    };

@Override
    public Word makeWord() {
    Random r = new Random();
    int n = r.nextInt(this.words.length);
    return new Word(this.words[n]);
    }
}


class DictWordFactory implements WordFactory {
    @Override
    public Word makeWord() {
        return null;
    }
}