
/**
 * Write a description of class DestinationTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DestinationTicket extends Card
{
    private Path track;
    private int score;
    
    public DestinationTicket(Path t, int p){
        track = t;
        score = p;
    }
}
