public abstract class Gallows {
    int pointsLeft = 5;

    void display() {
        System.out.printf("Gallows: Points left %d\n", pointsLeft);
    }

    void addPart() {
        pointsLeft--;
    }

    boolean isHung() {
        return pointsLeft < 0;
    }
}


class TextGallows extends Gallows {
    private String[] graphics = new String[]{
            //Dibuixar els 6 pals
            " |                \n" +
            " |                \n" +
            " |                \n" +
            " |                \n" +
            " |                \n" +
            " |                \n" +
            " |                \n" +
            " |                ",

            " |-----|         \n" +
            " |     |          \n" +
            " |     0          \n" +
            " |                \n" +
            " |                \n" +
            " |                \n" +
            " |                \n" +
            " |                ",

            " |-----|         \n" +
            " |     |          \n" +
            " |     0          \n" +
            " |    /|\\        \n" +
            " |                \n" +
            " |                \n" +
            " |                \n" +
            " |                ",

            " |-----|          \n" +
            " |     |          \n" +
            " |     0          \n" +
            " |    /|\\        \n" +
            " |     |          \n" +
            " |                \n" +
            " |                \n" +
            " |                ",

            " |-----|          \n" +
            " |     |          \n" +
            " |     0          \n" +
            " |    /|\\        \n" +
            " |     |          \n" +
            " |     /\\        \n" +
            " |                \n" +
            " |                ",

            " |-----|          \n" +
            " |     |          \n" +
            " |     0          \n" +
            " |    /|\\        \n" +
            " |     |          \n" +
            " |    / \\        \n" +
            " |   /   \\       \n" +
            " |                ",
    };
    void display() {
        System.out.println(graphics[6 - pointsLeft]);
    }
}