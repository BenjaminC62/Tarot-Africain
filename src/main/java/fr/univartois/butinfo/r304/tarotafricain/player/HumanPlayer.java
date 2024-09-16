package fr.univartois.butinfo.r304.tarotafricain.player;

import fr.univartois.butinfo.r304.tarotafricain.Game;
import fr.univartois.butinfo.r304.tarotafricain.Round;
import fr.univartois.butinfo.r304.tarotafricain.Trick;
import fr.univartois.butinfo.r304.tarotafricain.cards.Card;

import java.util.List;
import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer{
    private Scanner scanner;

    public HumanPlayer(String name) {
        super(name);
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int makeBid(Round round) {
        System.out.println("Voici votre main ");
        System.out.println(this);
        System.out.println("Enter your bid : ");
        return readBid(round);
    }

    private int readBid(Round round){
        System.out.println("Enter your bid :");
        int bid;
        do{
            try {
                bid = scanner.nextInt();
                if(bid < 0 || bid > round.getNumberOfCards()){
                    System.out.println("Error, enter a bid between 0 and 4");
                    bid = -1;
                    continue;
                }
            }catch (Exception e){
                System.out.println("The sum of the bids need to be different of the numbers of the cards");
                bid = -1;
                continue;
            }
            if(round.getNumberOfBids() == (Game.NB_PLAYERS - 1)){
                if((round.getTotalOfBids() + bid) == round.getNumberOfCards()){
                    System.out.println("Le total des enchères doit être diff du ");
                    bid = -1;
                }
            }
        }while(bid < 0 || bid > round.getNumberOfCards());
        return bid;
    }

    @Override
    public Card play(Trick trick) {
        List<Card> playabledCards = computedAllowedCards(trick);
        System.out.println("Voici les cartes que vous pouvez jouer");
        System.out.println(playabledCards);
        int index;
        do{
            try {
                index = scanner.nextInt();
            }catch (NumberFormatException e){
                System.out.println("Error, enter a number");
                index = -1;
            }
        }while(index < 0 || index >= playabledCards.size());
        Card card = playabledCards.get(index);
        getHand().remove(card);
        return card;
    }
}
