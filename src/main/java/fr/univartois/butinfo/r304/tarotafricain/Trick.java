package fr.univartois.butinfo.r304.tarotafricain;

import fr.univartois.butinfo.r304.tarotafricain.cards.Card;

import java.util.ArrayList;
import java.util.List;

public class Trick {

    private List<Card> cards;
    private int bestCardIndex;
    private int bestPlayerIndex;

    public Trick(){
        this.cards = new ArrayList<>();
        this.bestCardIndex = 0;
        this.bestPlayerIndex = 0;
    }


    public boolean isEmpty(){
        return false;
    }

    public Card getBestCard(){
        return cards.get(bestCardIndex);
    }

    public int getWinner(){
        return 0;
    }

    public void play(int playerIndex, Card card){
        cards.add(card);
        if(cards.size() == 1){
            bestCardIndex = 0;
            bestPlayerIndex = playerIndex;
        } else{
            if(card.compareTo(cards.get(bestCardIndex)) > 0){
                bestCardIndex = cards.size() - 1;
                bestPlayerIndex = playerIndex;
            }
        }
    }
}
