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

  // ?creates new Player?
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

  // public void deal() {
  //   Deck deck = this.deck.buildStandardDeck();
  //   deck.shuffle();
  //   for ( int i = 0; i < this.numberOfPlayers ; i++ )
  //       for each player in turn
  //     new up hand
  //   then for number of cards in hand
  //     remove first card from deck
  //     add to each player's hand, in turn



  //   for ( this.numberOfPlayers )



  // }



}