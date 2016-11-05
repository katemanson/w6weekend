package game;
import java.util.*;

public class Hand {

  private ArrayList<Card> hand;

  public Hand() {
    this.hand = new ArrayList<Card>();
  }

  public ArrayList<Card> getHand() {
    return this.hand;
  }

  public int countCards() {
    return this.hand.size();
  }

  public void addCard(Card card) {
    this.hand.add(card);
  }
  
  public Card getCard(int index) {
    return this.hand.get(index);
  }

  public Card removeCard(int index) {
    return this.hand.remove(index);
  }

  // public int totalValue() {

  // }

}