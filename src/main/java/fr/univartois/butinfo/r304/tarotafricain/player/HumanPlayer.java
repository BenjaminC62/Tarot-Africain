package fr.univartois.butinfo.r304.tarotafricain.player;

import fr.univartois.butinfo.r304.tarotafricain.Game;
import fr.univartois.butinfo.r304.tarotafricain.Round;
import fr.univartois.butinfo.r304.tarotafricain.Trick;
import fr.univartois.butinfo.r304.tarotafricain.cards.Card;

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
        System.out.println("Enter your bid : ");
        int bid = scanner.nextInt();
        if(round.getNumberOfBids() == (Game.NB_PLAYERS - 1)){
            while((round.getTotalOfBids() + bid) == round.getNumberOfCards()){
                System.out.println("Erreur, enter new bid");
                bid = scanner.nextInt();
            }
        }
        return bid;
    }

    @Override
    public Card play(Trick trick) {
        
    }
}
