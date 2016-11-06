import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class HandTest {

  SetOfCards hand;
  Card aceOfHearts;
  Card nineOfClubs;

  @Before
  public void before() {
    hand = new Hand();
    aceOfHearts = new Card(Suit.HEARTS, Rank.ACE);
    nineOfClubs = new Card(Suit.CLUBS, Rank.NINE);
  }

  @Test
  public void handStartsEmpty() {
    assertEquals(0, hand.countCards());
  }

  @Test
  public void canAddCards() {
    hand.addCard(aceOfHearts);
    hand.addCard(nineOfClubs);
    assertEquals(2, hand.countCards());
  }

  @Test
  public void canGetCardWithIndex() {
    hand.addCard(aceOfHearts);
    Card card = hand.getCardWithIndex(0);
    assertEquals(Suit.HEARTS, card.getSuit());
    assertEquals(Rank.ACE, card.getRank());
  }

  @Test
  public void canRemoveCardWithIndex() {
    hand.addCard(aceOfHearts);
    hand.addCard(nineOfClubs);
    Card card = hand.removeCardWithIndex(1);
    assertEquals(1, hand.countCards());
    assertEquals(Suit.CLUBS, card.getSuit());
    assertEquals(Rank.NINE, card.getRank());
  }

}