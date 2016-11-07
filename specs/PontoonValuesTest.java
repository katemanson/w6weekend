import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import game.*;

public class PontoonValuesTest {

  PontoonValues values;
  ArrayList<Card> hand;

  @Before
  public void before() {
    values = new PontoonValues();
    hand = new ArrayList<Card>();
  }

  @Test 
  public void emptyHandHasValueZero() {
    assertEquals(0, values.getHandValue(hand));
  }

  @Test
  public void canGetHandValue() {
    hand.add(new Card(Suit.HEARTS, Rank.ACE));
    hand.add(new Card(Suit.HEARTS, Rank.KING));
    assertEquals(21, values.getHandValue(hand));
  }

}