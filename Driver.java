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
    public static void main(String[] args) throws InterruptedException{
        OpeningScreen.main(new String[0]);
        boolean done = false;
        int pos = 0;
        while (BoardPanel.list.size() < 2){
            Thread.sleep(1000);
        }
        while (!done){
            Player currentPlayer = BoardPanel.list.get(pos);
            currentPlayer.setState(true);
            if (currentPlayer.getTaxiCount() <= 2){
                for (int i = 0; i < BoardPanel.list.size() - 1; i++){
                    pos++;
                    if (pos == BoardPanel.list.size())pos = 0;
                    //BoardPanel.list.get(pos).turn(0, null, null);
                }
                done = true;
            }
            currentPlayer.setState(false);
            pos++;
            if (pos == BoardPanel.list.size())pos = 0;
        }
    }

}
