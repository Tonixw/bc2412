public class Deck {
  // 52 card
  private Card[] cards;

  public Deck() {
    this.cards = new Card[Card.SUITES.length * Card.RANKS.length];
    int idx = 0;
    for (char rank : Card.RANKS) {
      for (char suite : Card.SUITES) {
        this.cards[idx++] = new Card(rank, suite);
      }
    }
  }

  public static void main(String[] args) {
    Deck deck = new Deck();
    Card.SUITES[0] = 'X';
    System.out.println(deck);
  }
  
}
