import java.awt.Color;
/**
 * Write a description of class Path here.
 *
 * @author Ryan Holland, Julia Krasinski, Briella Sala,
 * Matt Harrison, Michael Lostritto
 * @version (a version number or a date)
 */
public class Path
{
    private LocationNode start, end;
    private String color;
    private int weight, length;

    /**
     * Constructor for objects of class Path
     * 
     * @param s: Start location of the path to be traversed
     *        e: End location of the path to be traversed
     *        c: Color of the path to be traversed
     *        w: 
     *        l: Tile length of the path to be traversed
     */
    public Path(LocationNode s, LocationNode e, String c, int w, int l){
        start = s;
        end = e;
        color = c;
        weight = w;
        length = l;
    }
    
    /**
     * This method finds the length of the  path.
     * 
     * @return the length of the path
     */
    public int getLength(){
        return length;
    }
    
    /**
     * This method finds the color of the path.
     * 
     * @return the color of the path
     */
    public String getColor(){
        return color;
    }
    
    /**
     * This method finds the starting node of the path
     * 
     * @return the start node of the path
     */
    public LocationNode getStart(){
        return start;
    }
    
    /**
     * This method finds the ending node of the path
     * 
     * @return the end node of the path
     */
    public LocationNode getEnd(){
        return end;
    }
}
