import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import game.*;

public class GameTest {

  Game game;
  Card twoOfHearts;
  Card kingOfClubs;
  Card aceOfDiamonds;
  Card sevenOfSpades;
  Card sixOfSpades;
  Card sixOfClubs;

  @Before
  public void before() {
    game = new Game(2);
    twoOfHearts = new Card(Suit.HEARTS, Rank.TWO);
    kingOfClubs = new Card(Suit.CLUBS, Rank.KING);
    aceOfDiamonds = new Card(Suit.DIAMONDS, Rank.ACE);
    sevenOfSpades = new Card(Suit.SPADES, Rank.SEVEN);
    sixOfSpades = new Card(Suit.SPADES, Rank.SIX);
    sixOfClubs = new Card(Suit.CLUBS, Rank.SIX);
  }

  @Test
  public void canAddPlayer() {
    game.addPlayer("Player");
    ArrayList<Player> players = game.getPlayers();
    assertEquals(1, players.size());
  }

  @Test
  public void canGetPlayer() {
    game.addPlayer("Player 0");
    game.addPlayer("Player 1");
    assertEquals("Player 0", game.getPlayer(0).getName());
  }

  @Test
  public void canDeal() {
    game.addPlayer("Player 0");
    game.addPlayer("Player 1");
    game.addPlayer("Player 2");
    game.deal(2);
    assertEquals(46, game.getDeck().cardCount());
    assertEquals(2, game.getPlayer(0).getHand().cardCount());
    assertEquals(2, game.getPlayer(1).getHand().cardCount());
    assertEquals(2, game.getPlayer(2).getHand().cardCount());
  }

  @Test
  public void canGetHandValueForPlayer() {
    game.addPlayer("Player 0");
    game.getPlayer(0).getHand().addCard(twoOfHearts);
    game.getPlayer(0).getHand().addCard(kingOfClubs);
    assertEquals(12, game.getHandValueForPlayer(0));
  }

  @Test
  public void canGetWinner() {
    game.addPlayer("Player 0");
    game.getPlayer(0).getHand().addCard(twoOfHearts);
    game.getPlayer(0).getHand().addCard(kingOfClubs);
    game.addPlayer("Player 1");
    game.getPlayer(1).getHand().addCard(aceOfDiamonds);
    game.getPlayer(1).getHand().addCard(sevenOfSpades);
    assertEquals("Player 0", game.getWinner().getName());
  }

  @Test
  public void canGetDraw() {
    game.addPlayer("Player 0");
    game.getPlayer(0).getHand().addCard(twoOfHearts);
    game.getPlayer(0).getHand().addCard(kingOfClubs);
    game.addPlayer("Player 1");
    game.getPlayer(1).getHand().addCard(sixOfSpades);
    game.getPlayer(1).getHand().addCard(sixOfClubs);
    assertEquals(null, game.getWinner());
  }

}