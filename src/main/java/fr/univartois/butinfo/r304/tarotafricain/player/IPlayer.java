package fr.univartois.butinfo.r304.tarotafricain.player;

import fr.univartois.butinfo.r304.tarotafricain.Round;
import fr.univartois.butinfo.r304.tarotafricain.Trick;
import fr.univartois.butinfo.r304.tarotafricain.cards.Card;

import java.util.List;

public interface IPlayer {

    String getName();
    int getLife();
    void decreaseLife(int points);
    List<Card> getHand();
    void giveCard(Card card);
    int makeBid(Round round);
    Card play(Trick trick);
    String toString();

}
