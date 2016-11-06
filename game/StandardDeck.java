package game;

public class StandardDeck extends Deck {

  public void buildDeck() {
    for (Suit suit : Suit.values() ) {
      for (Rank rank : Rank.values() ) {
        Card card = new Card(suit, rank);
        this.cards.add(card);
      }
    }
  }

}