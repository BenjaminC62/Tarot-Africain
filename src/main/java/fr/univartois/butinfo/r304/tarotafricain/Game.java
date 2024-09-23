package fr.univartois.butinfo.r304.tarotafricain;

import fr.univartois.butinfo.r304.tarotafricain.player.IPlayer;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public static final int NB_PLAYERS = 4;
    public static final int MAX_CARDS = 5;
    public static final int LIFE = 10;

    private List<IPlayer> players;
    public Game(){
        players = new ArrayList<>();
    }

}
