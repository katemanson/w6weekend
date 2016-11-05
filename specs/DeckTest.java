import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class DeckTest {

  Deck deck;
  Card card;

  @Before
  public void before() {
    deck = new Deck();
    card = new Card(Suit.HEARTS, Rank.QUEEN);
  }

  @Test
  public void deckStartsEmpty() {
    assertEquals(0, deck.countCards());
  }

  @Test
  public void canAddCard() {
    deck.addCard(card);
    assertEquals(1, deck.countCards());
  }

  @Test
  public void canBuildStandardDeck() {
    deck.buildStandardDeck();
    assertEquals(52, deck.countCards());
  }

  @Test
  public void canGetFirstCard() {
    deck.buildStandardDeck();
    Card firstCard = deck.getFirstCard();
    assertEquals(Rank.ACE, firstCard.getRank());
    assertEquals(Suit.SPADES, firstCard.getSuit());
  }

  @Test
  public void canRemoveFirstCard() {
    deck.buildStandardDeck();
    Card firstCard = deck.removeFirstCard();
    Card newFirstCard = deck.getFirstCard();
    assertEquals(Rank.ACE, firstCard.getRank());
    assertEquals(Suit.SPADES, firstCard.getSuit());
    assertEquals(Rank.TWO, newFirstCard.getRank());
    assertEquals(Suit.SPADES, newFirstCard.getSuit());
    assertEquals(51, deck.countCards());
  }

}