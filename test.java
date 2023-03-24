/*@ nullable_by_default @*/
public class Card {
    public int rank;
    public int suit;

    //@ ensures this.rank == rank && this.suit == suit;
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }
}

/*@ nullable_by_default @*/
public class Deck {
    public Card[] cards;
    public int cardIndex;

    //@ ensures this.cards.length == 52 && this.cardIndex == 0;
    public Deck() {
        cards = new Card[52];
        int index = 0;

        for (int suit = 0; suit < 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index++] = new Card(rank, suit);
            }
        }

        shuffle();
        cardIndex = 0;
    }

    //@ ensures cardIndex < 52;
    public void shuffle() {
        for (int i = cards.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    //@ ensures \result != null && cardIndex < 52;
    public Card drawCard() {
        if (cardIndex >= 52) {
            shuffle();
            cardIndex = 0;
        }

        return cards[cardIndex++];
    }
}

/*@ nullable_by_default @*/
public class Blackjack {
    public Deck deck;
    public Card[] playerHand;
    public Card[] dealerHand;
    public int playerIndex;
    public int dealerIndex;

    //@ ensures this.deck != null && this.playerHand.length == 10 && this.dealerHand.length == 10;
    public Blackjack() {
        deck = new Deck();
        playerHand = new Card[10];
        dealerHand = new Card[10];
        playerIndex = 0;
        dealerIndex = 0;
    }

    public int cardValue(Card card) {
        if (card.rank == 1) {
            return 11;
        } else if (card.rank >= 10) {
            return 10;
        } else {
            return card.rank;
        }
    }

    public int handValue(Card[] hand, int count) {
        int value = 0;
        int aces = 0;

        for (int i = 0; i < count; i++) {
            Card card = hand[i];
            value += cardValue(card);

            if (card.rank == 1) {
                aces++;
            }
        }

        while (value > 21 && aces > 0) {
            value -= 10;
            aces--;
        }

        return value;
    }

    public void playerHit() {
        playerHand[playerIndex++] = deck.drawCard();
    }

    public void dealerHit() {
        dealerHand[dealerIndex++] = deck.drawCard();
    }

    public boolean isPlayerBust() {
        return handValue(playerHand, playerIndex) > 21;
    }

    public boolean isDealerBust() {
        return handValue(dealerHand, dealerIndex) > 21;
    }

    public boolean isPlayerBlackjack() {
        return handValue(playerHand, playerIndex) == 21;
    }

    public boolean isDealerBlackjack() {
        return handValue(dealerHand, dealerIndex) == 21;
    }
}

