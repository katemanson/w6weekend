package game;
import java.util.*;

public class StandardDeck extends SetOfCards implements Decker {

  public void buildDeck() {
    for (Suit suit : Suit.values() ) {
      for (Rank rank : Rank.values() ) {
        Card card = new Card(suit, rank);
        this.cards.add(card);
      }
    }
  }

}