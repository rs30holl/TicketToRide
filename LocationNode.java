import java.util.*;
/**
 * Write a description of class LocationNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LocationNode
{
    private String name;
    private int x, y;
    private boolean point;
    private ArrayList<Path> paths = new ArrayList<>();
    
    public LocationNode(String n, int a, int b, boolean p){
        name = n;
        x = a;
        y = b;
        point = p;
    }
}
