package game;
import java.util.*;

public class Game {

  private ArrayList<Player> players;
  private Deck gameDeck;
  private Valuer valueType;

  public Game(Deck gameDeck, Valuer valueType) {
    this.players = new ArrayList<Player>();
    this.gameDeck = gameDeck;
    this.valueType = valueType;
  }

// ?TEST?
  public Deck getGameDeck() {
    return this.gameDeck;
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
    this.gameDeck.buildDeck();
    this.gameDeck.shuffle();
    for ( int i = 0; i < numberOfCardsToDeal; i++ ) {
      for ( Player player : this.players ) {
        Card dealtCard = this.gameDeck.removeFirstCard();
        player.getHand().addCard(dealtCard);
      }
    }
  }

  public int getHandValueForPlayer(int playerIndex) {
    Player player = getPlayer(playerIndex);
    ArrayList<Card> hand = player.getHand().getSetOfCards();
    int value = this.valueType.getHandValue(hand);
    return value;
  }

  public void stickOrTwist(int playerIndex, String playerDecision) {
    if (playerDecision == "t") {
      Card dealtCard = this.gameDeck.removeFirstCard();
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