import java.util.*;
/**
 * Write a description of class LocationNode here.
 *
 * @author Ryan Holland, Julia Krasinski, Briella Sala,
 * Matt Harrison, Michael Lostritto
 * @version 4/28/2019
 */
public class LocationNode
{
    private String name;
    private int x, y;
    private boolean point;
    private ArrayList<Path> paths = new ArrayList<>();
    
    /**
     * Constructs an object of LocationNode
     * 
     * @param n: The name of the node
     *        a: The x-coordinate of the node
     *        b: The y-coordinate of the node
     *        p: States whether or not the node is worth a point
     */
    public LocationNode(String n, int a, int b, boolean p){
        name = n;
        x = a;
        y = b;
        point = p;
    }
    
    /**
     * Returns the name of this node
     * 
     * @return String
     */
    public String getName(){
        return name;
    }
    
    /**
     * Returns the X coordinate of this node
     * 
     * @return int
     */
    public int getX(){
        return x;
    }
    
    /**
     * Returns the Y coordinate of this node
     * 
     * @return int
     */
    public int getY(){
        return y;
    }

    /**
     * Returns the Path list for this node
     *
     * @return ArrayList
     */
    public ArrayList<Path> getPaths(){ return this.paths;}

    /**
     * Adds the specified path to this node's list of connected paths
     * 
     * @param p: The path to be added to the list of connected paths
     */
    public void addPath(Path p){
        this.paths.add(p);
    }
    
    /**
     * Removes the specified path from this nodes list of connected paths
     * 
     * @param p: The path to be removed from the list of connected paths
     */
    public void removePath(Path p){
        paths.remove(p);
    }
    
    /**
     * Prints every path connected to this node
     */
    public void printPaths(){
        System.out.println(this.name + " has paths to:");
        
        for (Path p : paths){
            System.out.println("-" + p.getEnd().name);
        }
        
        if (this.hasPoints()){
            System.out.println("This also has one point");
        }
    }
    
    /**
     * Returns whether this node is worth a point
     */
    public boolean hasPoints(){
        if (this.point){
            return true;
        }
        return false;
    }
}
