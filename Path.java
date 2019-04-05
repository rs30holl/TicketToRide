import java.awt.Color;
/**
 * Write a description of class Path here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
////////////////////////////////////////////////////////////////////////////////
public class Path
{
    private LocationNode start, end;
    private String color;
    private int weight, length;

    /**
     * Constructor for objects of class Path
     */
    public Path(LocationNode s, LocationNode e, String c, int w, int l){
        start = s;
        end = e;
        color = c;
        weight = w;
        length = l;
    }
    
    public int getLength(){
        return length;
    }
    
    public String getColor(){
        return color;
    }
    
    public LocationNode getStart(){
        return start;
    }
    
    public LocationNode getEnd(){
        return end;
    }
}
