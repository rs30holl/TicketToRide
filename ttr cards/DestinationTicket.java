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
    private String name;
    
    /**
     * Constructor for the objects of DestinationCard class.
     * 
     * @param s: starting LocationNode 
     *        e: ending LocationNode
     *        p: number of points received if the path is completed
     */
    public DestinationTicket(LocationNode s, LocationNode e, int p, String n){
        start = s;
        end = e;
        score = p;
        name = n;
    }
    
    public String getName(){
        return name;
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
     * 
     */
    public int getScore(){
        return score;
    }
    
    /**
     * Gets the color of the card. 
     * 
     * @return null
     */
    @Override
    public String getColor(){return null;}
}
