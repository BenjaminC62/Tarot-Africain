package fr.univartois.butinfo.r304.tarotafricain;

import fr.univartois.butinfo.r304.tarotafricain.cards.DeckOfCards;
import fr.univartois.butinfo.r304.tarotafricain.player.IPlayer;

import java.util.List;

public class Round {

    private List<IPlayer> players;
    private int[] bids;
    private int[] scores;
    private int totalsBids;
    private int numbersOfCards;
    private int numbersOfBids;
    private DeckOfCards deck;

    public Round(List<IPlayer> players, int currrent) {
        this.players = players;

    }

    public int getNumberOfCards(){
        return 0;
    }

    public int getNumberOfBids(){
        return 0;
    }

    public int getTotalOfBids(){
        return 0;
    }
}
