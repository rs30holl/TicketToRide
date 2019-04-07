import java.awt.Color;
import java.util.*;
/**
 * Write a description of class Player here.
 *
 * @author Ryan Holland, Julia Krasinski, Briella Sala,
 * Matt Harrison, Michael Lostritto
 * @version 4.7.2019
 */
public class Player
{
    private Hand hand;
    private String name;
    private ArrayList<Path> claimedRoutes = new ArrayList<>();
    private String color;
    
    /**
     * Constructor for the objects of Player class
     * 
     * @param n: Name of the Player
     */
    public Player(String n, String c){
        hand = new Hand();
        name = n;
        color = c;
    }
    
    /**
     * This method sets the name of the Player
     * 
     * @param n: the name of the Player
     */
    public void setName(String n){
        name = n;
    }
    
    /**
     * This method finds the name of the Player
     * 
     * @return the name of the Player
     */
    public String getName(){
        return name;
    }
    
    /**
     * This method draws cards from the deck and adds them to the Players's hand
     */
    public void drawCard(){
        hand.addCard(Board.deck.get(0));
        Board.deck.remove(0);
    }

    /**
     * This method allows a Player to claim a route
     * 
     * @param p: a path referring to the route a player wants to claim
     */
    public void claimRoute(Path p){
        int length = p.getLength();
        String color = p.getColor();
        //number of matching cards in hand
        int numCards = 0;
        for (Card c : hand.cards){
            if (c instanceof TransportationCard){
                //checks to see if the color of the path matches the color
                //of the transportation card
                if (c.getColor().equals(color)){
                    numCards++;
                    //adds the card being played to the discard array list
                    Board.discard.add(c);
                    //removes the card from the Player's hand
                    hand.removeCard(c);
                }
            }
        }
        // if the number of matching cards is greater than or equal to the
        // length of the path than the route can be claimed
        if (numCards >= length){
            //adds path to claimed routes
            claimedRoutes.add(p);
            //removes that path from possible paths for other Players to claim
            p.getEnd().removePath(p);
        }
    }
}
