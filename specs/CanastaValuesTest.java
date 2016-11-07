import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import game.*;

public class CanastaValuesTest {

  CanastaValues values;
  ArrayList<Card> hand;

  @Before
  public void before() {
    values = new CanastaValues();
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
    hand.add(new Card(null, Rank.JOKER));
    hand.add(new Card(Suit.DIAMONDS, Rank.THREE));
    assertEquals(180, values.getHandValue(hand));
  }

}