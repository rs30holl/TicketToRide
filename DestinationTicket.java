import java.awt.Color;
/**
 * This class creates the destination tickets.
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
     * @param s: starting LocationNode 
     *        e: ending LocationNode
     *        p: number of points received if the path is completed
     */
    public DestinationTicket(LocationNode s, LocationNode e, int p){
        start = s;
        end = e;
        score = p;
    }
    
    
    /**
     * Returns the starting location.
     * 
     * @return The start location node on the destination ticket
     */
    public LocationNode getStart(){
        return start;
    }
    
    /**
     * Returns the ending location.
     * 
     * @return The end location node on the destination ticket
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
