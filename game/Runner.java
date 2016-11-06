import game.*;
import java.util.*;

public class Runner {

  public static void main(String[] args) {

  SetOfCards cards = new SetOfCards();
  cards.addCard(new Card(Suit.HEARTS, Rank.ACE));
  cards.addCard(new Card(Suit.HEARTS, Rank.TWO));
  cards.addCard(new Card(Suit.HEARTS, Rank.THREE));
  cards.addCard(new Card(Suit.HEARTS, Rank.FOUR));
  cards.addCard(new Card(Suit.HEARTS, Rank.FIVE));
  cards.addCard(new Card(Suit.HEARTS, Rank.SIX));
  cards.addCard(new Card(Suit.CLUBS, Rank.ACE));
  cards.addCard(new Card(Suit.CLUBS, Rank.TWO));
  cards.addCard(new Card(Suit.CLUBS, Rank.THREE));
  cards.addCard(new Card(Suit.CLUBS, Rank.FOUR));
  cards.addCard(new Card(Suit.CLUBS, Rank.FIVE));
  cards.addCard(new Card(Suit.CLUBS, Rank.SIX));

  cards.shuffle();

  for (Card card : cards.getSetOfCards() ) {
  System.out.println(card.getRank() + " of " + card.getSuit());
  }
  }
}