package QN1;

import java.util.ArrayList;

public class Deck {
    ArrayList<Card> cards;

    Deck() {
        cards = new ArrayList<>();
        for (Card.Suit s : Card.Suit.values()) {
            for (Card.Face f : Card.Face.values()) {
                cards.add(new Card(s, f));
            }
        }
    }

    public void print() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }
}
