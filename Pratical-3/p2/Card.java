import java.util.Objects;

class Card {

    private String rank;
    private String suit;

    // Constructor
    Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // toString()
    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    // equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Card c = (Card) obj;
        return rank.equals(c.rank) && suit.equals(c.suit);
    }

    // hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(rank, suit);
    }

    // Main Method
    public static void main(String[] args) {

        Card[] cards = new Card[5];

        cards[0] = new Card("Ace", "Spades");
        cards[1] = new Card("King", "Hearts");
        cards[2] = new Card("Queen", "Clubs");
        cards[3] = new Card("Ace", "Spades"); // Duplicate
        cards[4] = new Card("Jack", "Diamonds");

        boolean duplicateFound = false;

        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < i; j++) {
                if (cards[i].equals(cards[j])) {
                    System.out.println("Duplicate found: " + cards[i]);
                    duplicateFound = true;
                    break;
                }
            }

            if (duplicateFound) {
                break;
            }
        }
    }
}