package game;
import java.util.*;

public class StandardDeck extends Deck {

  public void buildDeck() {
    EnumSet<Rank> standardRanks = EnumSet.range(Rank.ACE, Rank.KING);
    for (Suit suit : Suit.values()) {
      for (Rank rank : standardRanks) {
        Card card = new Card(suit, rank);
        this.cards.add(card);
      }
    }
  }

}