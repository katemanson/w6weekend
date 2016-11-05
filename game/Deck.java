package game;
import java.util.*;

public class Deck {

  private ArrayList<Card> deck;

  public Deck() {
    this.deck = new ArrayList<Card>();
  }

  public ArrayList<Card> getDeck() {
    return this.deck;
  }

  public int cardCount() {
    return this.deck.size();
  }

  public void addCard(Card card) {
    this.deck.add(card);
  } 

  public Card getFirstCard() {
    return this.deck.get(0);
  }

  public void buildStandardDeck() {
    for (Suit suit : Suit.values() ) {
      for (Rank rank : Rank.values() ) {
        Card card = new Card(suit, rank);
        this.deck.add(card);
      }
    }
  }

  public void shuffle() {
    Collections.shuffle(deck); 
  }

  public Card removeFirstCard() {
    Card firstCard = this.deck.remove(0);
    return firstCard;
  }



}