package fr.univartois.butinfo.r304.tarotafricain;

import fr.univartois.butinfo.r304.tarotafricain.cards.Card;

public class Trick {



    public boolean isEmpty(){
        return false;
    }

    public Card getBestCard(){
        Card card = new Card();
        return card;
    }

    public int getWinner(){
        return 0;
    }

}
