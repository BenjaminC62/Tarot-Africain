package fr.univartois.butinfo.r304.tarotafricain;

import fr.univartois.butinfo.r304.tarotafricain.player.IPlayer;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public static final int NB_PLAYERS = 4;
    public static final int MAX_CARDS = 5;
    public static final int LIFE = 10;

    private List<IPlayer> players;
    private int currentPlayer;
    private int numberOfCards;
    public Game(){
        players = new ArrayList<>();
        currentPlayer = 0;
        numberOfCards = MAX_CARDS;
    }

    public void init(){

    }

    public void start(){

    }

    private boolean allPlayersHavePlayed(){
        for(IPlayer player : players){
            if(player.getLife() <= 0){
                return false;
            }
        }
        return true;
    }

    private void playRound(){
        Round round = new Round(players, currentPlayer, numberOfCards);
        round.play();
    }

    private void nextRound(){

    }

    private void displayLife(){
        
    }

}
