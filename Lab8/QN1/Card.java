package QN1;

public class Card {
    public enum Suit {
        Club, Diamond, Heart, Spade
    }

    public enum Face {
        Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King
    }

    private final Suit suit;
    private final Face face;

    Card(Suit suit, Face face) {
        this.suit = suit;
        this.face = face;
    }

    @Override
    public String toString() {
        return this.face + " of " + this.suit;
    }
}
