<<<<<<< HEAD

/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Driver
     */
    public Driver()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
=======

/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver {

    /**
     * @param args not used
     */
    public static void main(String[] args){
        OpeningScreen.main(new String[0]);
        boolean done = false;
        int pos = 0;
        while (!done){
            Player currentPlayer = BoardPanel.list.get(pos);
            currentPlayer.turn();
            if (currentPlayer.taxiCount <= 2){
                for (int i = 0; i < BoardPanel.list.size() - 1; i++){
                    pos++;
                    if (pos == BoardPanel.list.size())pos = 0;
                    BoardPanel.list.get(pos).turn();
                }
                done = true;
            }
            pos++;
            if (pos == BoardPanel.list.size())pos = 0;
        }
    }

}
>>>>>>> 122f690cc047668d1834eb3b658fd6a6568edaf8
