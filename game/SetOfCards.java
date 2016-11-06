package game;
import java.util.*;

public class SetOfCards {

  public ArrayList<Card> cards;

  public SetOfCards() {
    this.cards = new ArrayList<Card>();
  }

  public ArrayList<Card> getSetOfCards() {
    return this.cards;
  }

  public int countCards() {
    return this.cards.size();
  }

  public void addCard(Card card) {
    this.cards.add(card);
  }
  
  public Card getCardWithIndex(int index) {
    return this.cards.get(index);
  }

  public Card removeCardWithIndex(int index) {
    return this.cards.remove(index);
  }

  public Card getFirstCard() {
    return this.cards.get(0);
  }

  public Card removeFirstCard() {
    return this.cards.remove(0);
  }

  public void shuffle() {
    Collections.shuffle(this.cards);
  }

}