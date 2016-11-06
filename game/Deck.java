package game;
import java.util.*;

public class Deck extends SetOfCards {

  public void buildStandardDeck() {
    for (Suit suit : Suit.values() ) {
      for (Rank rank : Rank.values() ) {
        Card card = new Card(suit, rank);
        this.deck.add(card);
      }
    }
  }

}