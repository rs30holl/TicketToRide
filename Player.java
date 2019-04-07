import java.awt.Color;
import java.util.*;
/**
 * Write a description of class Player here.
 *
 * @author Ryan Holland, Julia Krasinski, Briella Sala,
 * Matt Harrison, Michael Lostritto
 * @version (a version number or a date)
 */
public class Player
{
    private Hand hand;
    private String name;
    private ArrayList<Path> claimedRoutes = new ArrayList<>();

    public Player(String n){
        hand = new Hand();
        name = n;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public String getName(){
        return name;
    }
    
    public void drawCard(){
        hand.addCard(Board.deck.get(0));
        Board.deck.remove(0);
    }

    public void claimRoute(Path p){
        int length = p.getLength();
        String color = p.getColor();
        int numCards = 0;
        for (Card c : hand.cards){
            if (c instanceof TransportationCard){
                if (c.getColor().equals(color)){
                    numCards++;
                    Board.discard.add(c);
                    hand.removeCard(c);
                }
            }
        }

        if (numCards >= length){
            claimedRoutes.add(p);
            p.getEnd().removePath(p);
        }
    }
}
