import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import game.*;

public class GameTest {

  Game game;
  Card cardOne;
  Card cardTwo;

  @Before
  public void before() {
    game = new Game(2);
    cardOne = new Card(Suit.HEARTS, Rank.TWO);
    cardTwo = new Card(Suit.CLUBS, Rank.KING);
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
    game.getPlayer(0).getHand().addCard(cardOne);
    game.getPlayer(0).getHand().addCard(cardTwo);
    assertEquals(12, game.getHandValueForPlayer(0));
  }

}