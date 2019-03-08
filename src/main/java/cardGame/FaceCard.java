package cardGame;

import java.util.Random;

public class FaceCard extends PCard{

    public String getText() {
        return "5\u2605";
    }

    public int getRank() {
        Random r = new Random();
        return r.nextInt((13 - 1) + 1) + 1;
    }

}
