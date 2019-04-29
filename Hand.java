import java.util.*;
/**
 * Creates a hand of Ticket to Ride cards
 *
 * @author Ryan Holland, Julia Krasinski, Briella Sala,
 * Matt Harrison, Michael Lostritto
 * @version 4/28/19
 */
public class Hand
{
    public ArrayList<Card> cards = new ArrayList<>();
    
    /**
     * Constructor for a hand object.
     *
     * @param numCards Number of starting cards in a hand
     */
    public Hand(Card... numCards){
        for (Card c : numCards){
            cards.add(c);
        }
    }
    
    /**
     * Adds a card to the hand
     *
     * @param c The card to be added to the hand
     */
    public void addCard(Card c){
        cards.add(c);
    }
    
    /**
     * Removes a card from the hand
     *
     * @param c The card to be removed
     */
    public void removeCard(Card c){
        cards.remove(c);
    }
}
