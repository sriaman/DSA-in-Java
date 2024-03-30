package com.java.day2.design;

import com.java.day2.design.card.Card;
import com.java.day2.design.deckofcards.DeckOfCards;
import com.java.day2.design.enums.RANK;
import com.java.day2.design.enums.SUIT;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card(RANK.ACE, SUIT.CLUB);
        Card card2 = new Card(RANK.EIGHT,SUIT.DIAMOND);
        Card result = compareCards(card1,card2);
        System.out.println("Bigger Card based on Rank only is : "+result);
        DeckOfCards deckOfCards = new DeckOfCards();
        System.out.println(deckOfCards.deck);
        List<Card> sortedCards = deckOfCards.deck.stream().sorted(Comparator.comparing(Card::getSuit).thenComparing(Card::getRank)).collect(Collectors.toList());
        System.out.println(sortedCards);
    }
    private static Card compareCards(Card c1,Card c2){
        if(c1.getRank().compareTo(c2.getRank())>0){
            return c2;
        }
        return c1;
    }
}
