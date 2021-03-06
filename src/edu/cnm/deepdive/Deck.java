package edu.cnm.deepdive;

import java.util.Random;

public class Deck {

  private Card[] cards;
  private Random rng;  //NEW

  public Card[] getCards() {
    return cards;
  }

  public void shuffle() {
    for (int target = cards.length - 1; target > 0; target--) {
      int source = rng.nextInt(target + 1);
      if (source != target) {
        Card temp = cards[target];
        cards[target] = cards[source];
        cards[source] = temp;
      }
    }
  }

  public Deck() {
    rng = new Random(); //NEW
    cards = new Card[Suit.values().length * Rank.values().length];
    int slot = 0;
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        Card card = new Card(rank, suit);
        // cards[slot++] = card;
        cards[slot] = card;
        slot++;
        //slot+= 1;

      }
    }
  }
}