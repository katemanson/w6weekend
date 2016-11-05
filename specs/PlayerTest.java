import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import game.*;

public class PlayerTest {

  Player player; 

  @Before
  public void before() {
    player = new Player("Player");
  }

  @Test
  public void canGetName() {
    assertEquals("Player", player.getName());
  }

}