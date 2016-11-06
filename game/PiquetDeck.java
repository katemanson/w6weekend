package game;
import java.util.*;

public class PiquetDeck extends Deck {

  public void buildDeck() {
    EnumSet<Rank> piquetRanks = EnumSet.of(Rank.ACE, Rank.SEVEN, Rank.EIGHT, Rank.NINE, Rank.TEN, Rank.JACK, Rank.QUEEN, Rank.KING);
    for (Suit suit : Suit.values() ) {
      for (Rank rank : piquetRanks) {
        Card card = new Card(suit, rank);
        this.cards.add(card);
      }
    }
  }

}