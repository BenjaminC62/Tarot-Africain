package fr.univartois.butinfo.r304.tarotafricain.cards;

import java.util.Objects;

public class Card implements Comparable<Card>{

    private ITrump trump;

    public Card(ITrump trump) {
        this.trump = trump;
    }

    public ITrump getTrump() {
        return trump;
    }

    public void setTrump(ITrump trump) {
        this.trump = trump;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(trump, card.trump);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getTrump());
    }

    @Override
    public int compareTo(Card card) {
        return 0;
    }
}
