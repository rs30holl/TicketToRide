import java.util.*;
/**
 * Write a description of class LocationNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
////////////////////////////////////////////////////////////////////////////////
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
    
    public void addPath(Path p){
        paths.add(p);
    }
    
    public void removePath(Path p){
        paths.remove(p);
    }
    
    public void printPaths(){
        System.out.println(this.name + " has paths to:");
        
        for (Path p : paths){
            System.out.println("-" + p.getEnd().name);
        }
        
        if (this.hasPoints()){
            System.out.println("This also has one point");
        }
    }
    
    public boolean hasPoints(){
        if (this.point){
            return true;
        }
        return false;
    }
}
