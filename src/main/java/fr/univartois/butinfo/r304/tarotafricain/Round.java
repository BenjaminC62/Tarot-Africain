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
    private int currrentPlayer;

    public Round(List<IPlayer> players, int currrentPlayer, int numbersOfCards) {
        this.players = players;
        this.numbersOfCards = numbersOfCards;
        this.currrentPlayer = currrentPlayer;
        deck = DeckOfCards.newDeck();
        bids = new int[Game.NB_PLAYERS];
        scores = new int[Game.NB_PLAYERS];
        totalsBids = 0;
    }

    public int getNumberOfCards(){
        return numbersOfCards;
    }

    public int getNumberOfBids(){
        return numbersOfBids;
    }

    public int getTotalOfBids(){
        return totalsBids;
    }

    public void play(){
        dealCards();
        askBids();
        for(int i = 0; i < numbersOfCards; i++){
            Trick trick = new Trick();
            playTrick(trick);
            scores[trick.getWinner()]++;
            currrentPlayer = trick.getWinner();
        }
    }

    public void askBids(){
        for(int i = 0; i < Game.NB_PLAYERS; i++){
            bids[currrentPlayer] = players.get(currrentPlayer).makeBid(this);
            totalsBids += bids[currrentPlayer];
            currrentPlayer = (currrentPlayer + 1) % Game.NB_PLAYERS;
        }
    }

    public void playTrick(Trick trick){
        for(int i = 0; i < Game.NB_PLAYERS; i++){
            trick.play(currrentPlayer, players.get(currrentPlayer).play(trick));
            currrentPlayer = (currrentPlayer + 1) % Game.NB_PLAYERS;
        }
    }

    public int getPenality(int playerIndex){
        return Math.abs(bids[playerIndex] - scores[playerIndex]);
    }

    public void dealCards(){
        deck.shuffle();
        for (int i = 0; i < numbersOfCards; i++){
            for(IPlayer player : players){
                player.giveCard(deck.draw());
            }
        }
    }
}
