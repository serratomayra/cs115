package cardGame;

public class Test {

    public static void main(String[] args) {
        PHand hand = new PHandImp();
        PDeck deck = new Deck();
        HandTest.run(deck, hand);

    }
}
