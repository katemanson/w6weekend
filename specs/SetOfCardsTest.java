import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class SetOfCardsTest {

  SetOfCards cards;
  Card aceOfHearts;
  Card nineOfClubs;

  @Before
  public void before() {
    cards = new SetOfCards();
    aceOfHearts = new Card(Suit.HEARTS, Rank.ACE);
    nineOfClubs = new Card(Suit.CLUBS, Rank.NINE);
  }

  @Test
  public void setStartsEmpty() {
    assertEquals(0, cards.countCards());
  }

  @Test
  public void canAddCards() {
    cards.addCard(aceOfHearts);
    cards.addCard(nineOfClubs);
    assertEquals(2, cards.countCards());
  }

  @Test
  public void canGetCardWithIndex() {
    cards.addCard(aceOfHearts);
    Card card = cards.getCardWithIndex(0);
    assertEquals(Suit.HEARTS, card.getSuit());
    assertEquals(Rank.ACE, card.getRank());
  }

  @Test
  public void canRemoveCardWithIndex() {
    cards.addCard(aceOfHearts);
    cards.addCard(nineOfClubs);
    Card card = cards.removeCardWithIndex(1);
    assertEquals(1, cards.countCards());
    assertEquals(Suit.CLUBS, card.getSuit());
    assertEquals(Rank.NINE, card.getRank());
  }

  @Test
  public void canGetFirstCard() {
    cards.addCard(aceOfHearts);
    cards.addCard(nineOfClubs);
    Card card = cards.getFirstCard();
    assertEquals(2, cards.countCards());
    assertEquals(Suit.HEARTS, card.getSuit());
    assertEquals(Rank.ACE, card.getRank());
  }

  @Test
  public void canRemoveFirstCard() {
    cards.addCard(nineOfClubs);
    cards.addCard(aceOfHearts);
    Card card = cards.removeFirstCard();
    assertEquals(1, cards.countCards());
    assertEquals(Suit.CLUBS, card.getSuit());
    assertEquals(Rank.NINE, card.getRank());
  }

}