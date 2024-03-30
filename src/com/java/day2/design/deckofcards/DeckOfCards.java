package com.java.day2.design.deckofcards;

import com.java.day2.design.card.Card;
import com.java.day2.design.enums.RANK;
import com.java.day2.design.enums.SUIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    public final List<Card> deck = new ArrayList<>();

    public DeckOfCards(){
        for(RANK rank: RANK.values()){
            //List<Card> temp = new ArrayList<>();
            for(SUIT suit: SUIT.values()){
                deck.add(new Card(rank,suit));
            }
           // deck.add(temp);
        }
        System.out.println("Before : "+deck);
        Collections.shuffle(deck);
        System.out.println("After : "+deck);
    }

}
