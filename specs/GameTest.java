import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import game.*;

public class GameTest {

  Game game;

  @Before
  public void before() {
    game = new Game(2);
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

/*
  @Test
  public void canDeal() {
    game.deal();
    assertEquals(2, <number of hands>());
    assertEquals(2, <number of cards in each hand>());
  }
*/


}