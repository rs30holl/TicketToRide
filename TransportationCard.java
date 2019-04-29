import java.awt.Color;
/**
 * This iclass creates the transportation cards.
 *
 * @author Ryan Holland, Julia Krasinski, Briella Sala,
 * Matt Harrison, Michael Lostritto
 * @version (4/28/2019)
 */
public class TransportationCard extends Card
{
    private String color;
    
    /**
     * Constructor for the objects of TransportationCard class.
     * 
     * @param c: The color of the transportation card
     */
    public TransportationCard(String c){
        color = c;
    }
    
    /**
     * Gets the color of the card. 
     * 
     * @return The color of the transportation card
     */
    @Override
    public String getColor(){
        return color;
    }
}
