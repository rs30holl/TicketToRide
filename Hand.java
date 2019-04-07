import java.util.*;
/**
 * Write a description of class Hand here.
 *
 * @author Ryan Holland, Julia Krasinski, Briella Sala,
 * Matt Harrison, Michael Lostritto
 * @version (a version number or a date)
 */
public class Hand
{
    public ArrayList<Card> cards = new ArrayList<>();
    
    public Hand(Card... numCards){
        for (Card c : numCards){
            cards.add(c);
        }
    }
    
    public void addCard(Card c){
        cards.add(c);
    }
    
    public void removeCard(Card c){
        cards.remove(c);
    }
}
