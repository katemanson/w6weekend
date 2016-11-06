import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class CanastaDeckTest {

  Deck deck;
  Card card;

  @Before
  public void before() {
    deck = new CanastaDeck();
  }

  @Test
  public void canBuildCanastaDeck() {
    deck.buildDeck();
    assertEquals(105, deck.countCards());
  }

}