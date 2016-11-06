package game;
import java.util.*;

public class CanastaDeck extends Deck {
// Canasta usually uses two 'standard' decks, plus four jokers


  public void buildDeck() {
    EnumSet<Rank> standardRanks = EnumSet.range(Rank.ACE, Rank.KING);
    for (Suit suit : Suit.values()) {
      for (Rank rank : standardRanks) {
        Card card = new Card(suit, rank);
        this.cards.add(card);
        this.cards.add(card);
      }
    }
    for ( int i = 0; i < 4; i++ ) {
      this.cards.add(new Card(null, Rank.JOKER));
    }
  }

}