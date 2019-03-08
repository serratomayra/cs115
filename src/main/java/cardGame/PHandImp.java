package cardGame;

import java.util.ArrayList;
import  java.util.Collections;
import java.util.List;

public class PHandImp implements PHand {

    List<PCard> hand = new ArrayList();

    @Override
    public int getSize() {
        return hand.size();

    }

    @Override
    public void addCard(PCard card) {
        hand.add(card);

    }

    @Override
    public PCard getCard(int index) {
        return hand.get(index);

    }

    @Override
    public PCard removeCard(int index) {
        return hand.remove(index);
    }


    @Override
    public int getValue() {
        int value = 0;
        for (PCard card : hand) {
            FaceCard faceCard = new FaceCard();
            // int tempVal = findBestFaceValue(faceCard.getRank(), value);
            value += faceCard.getRank();
        }

        return value;


    }
}
