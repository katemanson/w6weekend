package game;
import java.util.*;

public class Game {

  private ArrayList<Player> players;
  private int sizeOfHand;
  private Deck deck;

  public Game(int sizeOfHand) {
    this.players = new ArrayList<Player>();
    this.deck = new Deck();
    this.sizeOfHand = sizeOfHand;
  }

  public Deck getDeck() {
    return this.deck;
  }

  public ArrayList<Player> getPlayers() {
    return this.players;
  }

  // ?okay to create new Player here ?
  public void addPlayer(String name) {
    this.players.add(new Player(name));
  }

  public Player getPlayer(int index) {
    return this.players.get(index);
  }

  public void deal(int sizeOfHand) {
    this.deck.buildStandardDeck();
    this.deck.shuffle();
    for ( int i = 0; i < sizeOfHand; i++ ) {
      for ( Player player : this.players ) {
        Card dealtCard = this.deck.removeFirstCard();
        player.getHand().addCard(dealtCard);
      }
    }
  }

  public int getHandValueForPlayer(int playerIndex) {
    Player player = getPlayer(playerIndex);
    ArrayList<Card> hand = player.getHand().getHand();
    int handValue = 0;
    int cardValue = 0;
    for (Card card : hand) {
      switch (card.getRank()) {
        case ACE: cardValue = 1;
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