package game;
import java.util.*;

public class PontoonValues implements Valuer {

  public int getHandValue(ArrayList<Card> hand) {
    int handValue = 0;
    int cardValue = 0;
    for (Card card : hand) {
      switch (card.getRank()) {
        case ACE: cardValue = 11;
                  break;
        case TWO: cardValue = 2;
                  break;
        case THREE: cardValue = 3;
                  break;
        case FOUR: cardValue = 4;
                  break;
        case FIVE: cardValue = 5;
                  break;
        case SIX: cardValue = 6;
                  break;
        case SEVEN: cardValue = 7;
                  break;
        case EIGHT: cardValue = 8;
                  break;
        case NINE: cardValue = 9;
                  break;
        case TEN: case JACK: case QUEEN: case KING:
                  cardValue = 10;
                  break;
      } 
      handValue += cardValue;
    }
    return handValue;
  }

}