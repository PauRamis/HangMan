public interface WordFactory {
    Word makeWord();
}

class DefaultWordFactory implements WordFactory {
    public Word makeWord() {
        Word word = new Word("ordinador");
        return word;
    }
}


class DictWordFactory implements WordFactory {
    @Override
    public Word makeWord() {
        return null;
    }
}