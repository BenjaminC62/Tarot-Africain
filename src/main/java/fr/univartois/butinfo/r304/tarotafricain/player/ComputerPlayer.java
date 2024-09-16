package fr.univartois.butinfo.r304.tarotafricain.player;

import fr.univartois.butinfo.r304.tarotafricain.Game;
import fr.univartois.butinfo.r304.tarotafricain.Round;
import fr.univartois.butinfo.r304.tarotafricain.Trick;
import fr.univartois.butinfo.r304.tarotafricain.cards.Card;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ComputerPlayer extends AbstractPlayer{

    private static final Random RANDOM = new Random();

    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public int makeBid(Round round) {
        int bid = RANDOM.nextInt(round.getNumberOfCards());
        if(round.getNumberOfBids() == (Game.NB_PLAYERS - 1)){
            if((round.getTotalOfBids() + bid)  == round.getNumberOfCards()){
                bid = ((bid+1) <= round.getNumberOfCards()) ? bid + 1 : bid - 1;
            }
        }
        return bid;
    }

    @Override
    public Card play(Trick trick) {
        List<Card> playableCards = computedAllowedCards(trick);
        int index = RANDOM.nextInt(playableCards.size());
        Card card = playableCards.get(index);
        getHand().remove(card);
        return card;
    }
}
