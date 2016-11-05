import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class HandTest {

  Hand hand;
  Card cardOne;
  Card cardTwo;

  @Before
  public void before() {
    hand = new Hand();
    cardOne = new Card(Suit.HEARTS, Rank.ACE);
    cardTwo = new Card(Suit.CLUBS, Rank.NINE);
  }

  @Test
  public void handStartsEmpty() {
    assertEquals(0, hand.cardCount());
  }

  @Test
  public void canAddCards() {
    hand.addCard(cardOne);
    hand.addCard(cardTwo);
    assertEquals(2, hand.cardCount());
  }

  @Test
  public void canGetCard() {
    hand.addCard(cardOne);
    Card card = hand.getCard(0);
    assertEquals(Suit.HEARTS, card.getSuit());
    assertEquals(Rank.ACE, card.getRank());
  }

  @Test
  public void canRemoveCard() {
    hand.addCard(cardOne);
    hand.addCard(cardTwo);
    Card card = hand.removeCard(1);
    assertEquals(1, hand.cardCount());
    assertEquals(Suit.CLUBS, card.getSuit());
    assertEquals(Rank.NINE, card.getRank());
  }

}