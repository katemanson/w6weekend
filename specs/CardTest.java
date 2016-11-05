import static org.junit.Assert.*;
import org.junit.*;
import game.*;

public class CardTest {
     Card card;

     @Before
     public void before(){
          card = new Card(Suit.HEARTS, Rank.QUEEN);
     }

     @Test
     public void canGetSuit(){
          assertEquals(Suit.HEARTS, card.getSuit());
     }

     @Test
     public void canGetRank(){
          assertEquals(Rank.QUEEN, card.getRank());
     }
}