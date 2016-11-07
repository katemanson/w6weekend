package game;
import java.util.*;

public class CanastaValues implements Valuer {

  public int getHandValue(ArrayList<Card> hand) {
    int handValue = 0;
    int cardValue = 0;
    for (Card card : hand) {
      if (card.getRank() == Rank.THREE && (card.getSuit() == Suit.HEARTS || card.getSuit() == Suit.DIAMONDS)) {
        cardValue = 100;
      }
      else if (card.getRank() == Rank.THREE && (card.getSuit() == Suit.CLUBS || card.getSuit() == Suit.SPADES)) {
        cardValue = 5;
      }
      else {
        switch (card.getRank()) {
          case ACE: case TWO:
            cardValue = 20;
            break;
          case FOUR: case FIVE: case SIX: case SEVEN:
            cardValue = 5;
            break;
          case EIGHT: case NINE: case TEN: case JACK: case QUEEN: case KING:
            cardValue = 10;
            break;
          case JOKER:
            cardValue = 50;
            break;
        }
      } 
      handValue += cardValue;
    }
    return handValue;
  }

}