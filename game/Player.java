package game;
import java.util.*;

public class Player {

  private String name;
  private Hand hand;

  public Player(String name) {
    this.name = name;
    this.hand = new Hand();
  }

  public String getName() {
    return this.name;
  }

  // ? Have tested in Runner, but not sure how best to write test for this method?
  public Hand getHand() {
    return this.hand;
  }

}