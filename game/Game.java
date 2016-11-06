package game;
import java.util.*;

public class Game {

  private ArrayList<Player> players;
  private Decker deckType;

  public Game(Decker deckType) {
    this.players = new ArrayList<Player>();
    this.deckType = deckType;
  }

  public Decker getDeckType() {
    return this.deckType;
  }

  public ArrayList<Player> getPlayers() {
    return this.players;
  }

  public void addPlayer(String name) {
    this.players.add(new Player(name));
  }

  public Player getPlayer(int index) {
    return this.players.get(index);
  }

  public void deal(int numberOfCardsToDeal) {
    this.deckType.buildDeck();
    this.deckType.shuffle();
    for ( int i = 0; i < numberOfCardsToDeal; i++ ) {
      for ( Player player : this.players ) {
        Card dealtCard = this.deckType.removeFirstCard();
        player.getHand().addCard(dealtCard);
      }
    }
  }

  public int getHandValueForPlayer(int playerIndex) {
    Player player = getPlayer(playerIndex);
    ArrayList<Card> hand = player.getHand().getSetOfCards();
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

  public void stickOrTwist(int playerIndex, String playerDecision) {
    if (playerDecision == "t") {
      Card dealtCard = this.deck.removeFirstCard();
      getPlayer(playerIndex).getHand().addCard(dealtCard);
    }
    return;
  }

  public boolean checkIfPlayerBust(int playerIndex) {
    return getHandValueForPlayer(playerIndex) > 21;
  }

  public Player checkForWinner() {
    if (checkIfPlayerBust(0) && checkIfPlayerBust(1)) {
      return null;
    }
    else if (checkIfPlayerBust(0) || checkIfPlayerBust(1)) {
      for (Player player : this.players) {
        int index = this.players.indexOf(player);
        if (checkIfPlayerBust(index) != true) {
          return player;
        }
      }
    }
    else {
      if (getHandValueForPlayer(0) > getHandValueForPlayer(1)) {
        return getPlayer(0);
      }
      else if (getHandValueForPlayer(0) < getHandValueForPlayer(1)) {
        return getPlayer(1);
      }
    }
    return null;
  }

}