import java.awt.Color;
/**
 * Write a description of class TransportationCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
////////////////////////////////////////////////////////////////////////////////
public class TransportationCard extends Card
{
    private String color;
    
    public TransportationCard(String c){
        color = c;
    }
    
    @Override
    public String getColor(){
        return color;
    }
}
