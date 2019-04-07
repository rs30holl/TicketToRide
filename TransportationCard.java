import java.awt.Color;
/**
 * This is a class for the transportation cards.
 *
 * @author Ryan Holland, Julia Krasinski, Briella Sala,
 * Matt Harrison, Michael Lostritto
 * @version (4/7/2019)
 */
public class TransportationCard extends Card
{
    private String color;
    
    /**
     * Constructor for the objects of TransportationCard class.
     * 
     * @param c: Color
     */
    public TransportationCard(String c){
        color = c;
    }
    
    /**
     * Gets the color of the card. 
     * 
     * @return color: String
     */
    @Override
    public String getColor(){
        return color;
    }
}
