package cardGame;

public class Card extends PCard {

    String suit;
    String rank;
    String symbol;

    @Override
            public String getText() {
        return symbol;
    }

    Card(int cardNumber, String cardType) {
        if(cardNumber == 1)
            suit = "A";
        else if(cardNumber == 2)
            suit = "2";
        else if(cardNumber == 3)
            suit = "3";
        else if(cardNumber == 4)
            suit = "4";
        else if(cardNumber == 5)
            suit = "5";
        else if(cardNumber == 6)
            suit = "6";
        else if(cardNumber == 7)
            suit = "7";
        else if(cardNumber == 8)
            suit = "8";
        else if(cardNumber == 9)
            suit = "9";
        else if(cardNumber == 10)
            suit = "10";
        else if(cardNumber == 11)
            suit = "J";
        else if(cardNumber == 12)
            suit = "N";
        else if(cardNumber == 13)
            suit = "Q";
        else if(cardNumber == 14)
            suit = "K";

        if (cardType == "heart")
            rank = "\u2661";
        else if (cardType == "spade")
            rank = "\u2660";
        else if (cardType == "diamond")
            rank = "\u2662";
        else if (cardType == "club")
            rank = "\u2663";

        symbol = suit + "" + rank;

    }
}
