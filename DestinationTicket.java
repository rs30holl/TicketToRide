import java.awt.Color;
/**
 * This is a class for the destination cards.
 *
 * @author Ryan Holland, Julia Krasinski, Briella Sala,
 * Matt Harrison, Michael Lostritto
 * @version (4/7/2019)
 */
public class DestinationTicket extends Card
{
    private LocationNode start, end;
    private int score;
    
    /**
     * Constructor for the objects of DestinationCard class.
     * 
     * @param s: LocationNode
     * @param e: LocationNode
     * @param p: int of score
     */
    public DestinationTicket(LocationNode s, LocationNode e, int p){
        start = s;
        end = e;
        score = p;
    }
    
    
    /**
     * Returns the starting location.
     * 
     * @return start: LocationNode
     */
    public LocationNode getStart(){
        return start;
    }
    
    /**
     * Returns the ending location.
     * 
     * @return end: LocationNode
     */
    public LocationNode getEnd(){
        return end;
    }
    
    /**
     * Gets the color of the card. 
     * 
     * @return null
     */
    @Override
    public String getColor(){return null;}
}
