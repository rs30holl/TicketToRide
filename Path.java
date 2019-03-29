import java.awt.Color;
/**
 * Write a description of class Path here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Path
{
    private LocationNode start, end;
    private Color color;
    private int weight, length;

    /**
     * Constructor for objects of class Path
     */
    public Path(LocationNode s, LocationNode e, Color c, int w, int l){
        start = s;
        end = e;
        color = c;
        weight = w;
        length = l;
    }
}
