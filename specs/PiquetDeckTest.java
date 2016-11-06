import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class PiquetDeckTest {

  Deck deck;
  Card card;

  @Before
  public void before() {
    deck = new PiquetDeck();
  }

  @Test
  public void canBuildPiquetDeck() {
    deck.buildDeck();
    assertEquals(32, deck.countCards());
  }

}