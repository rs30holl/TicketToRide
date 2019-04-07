import java.awt.Color;
/**
 * Write a description of class DestinationTicket here.
 *
 * @author Ryan Holland, Julia Krasinski, Briella Sala,
 * Matt Harrison, Michael Lostritto
 * @version (a version number or a date)
 */
public class DestinationTicket extends Card
{
    private LocationNode start, end;
    private int score;
    
    public DestinationTicket(LocationNode s, LocationNode e, int p){
        start = s;
        end = e;
        score = p;
    }
    
    public LocationNode getStart(){
        return start;
    }
    
    public LocationNode getEnd(){
        return end;
    }
    
    @Override
    public String getColor(){return null;}
}
