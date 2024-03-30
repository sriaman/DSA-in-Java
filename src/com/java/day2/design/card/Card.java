package com.java.day2.design.card;

import com.java.day2.design.enums.RANK;
import com.java.day2.design.enums.SUIT;

public class Card {
    private RANK rank;
    private SUIT suit;

    public Card(RANK rank, SUIT suit){
        this.rank=rank;
        this.suit=suit;
    }

    public SUIT getSuit() {
        return suit;
    }

    public void setSuit(SUIT suit) {
        this.suit = suit;
    }

    public RANK getRank() {
        return rank;
    }

    public void setRank(RANK rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "rank=" + rank +
                ", suit=" + suit +
                '}';
    }
}

