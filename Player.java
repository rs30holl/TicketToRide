import java.awt.Color;
import java.util.*;
/**
 * Write a description of class Player here.
 *
 * @author (your name)
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

    public void claimRoute(Path p){
        int length = p.getLength();
        Color color = p.getColor();
        int numCards = 0;
        for (Card c : hand.cards){
            if (c instanceof TransportationCard){
                if (c.getColor().equals(color)){
                    numCards++;
                }
            }
        }

        if (numCards >= length){
            claimedRoutes.add(p);
            p.getEnd().removePath(p);
        }
    }
}
