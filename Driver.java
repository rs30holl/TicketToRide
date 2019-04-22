<<<<<<< HEAD

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
            if (currentPlayer.getTaxiCount() <= 2){
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
            if (currentPlayer.getTaxiCount() <= 2){
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
>>>>>>> b64d100e30e0e8d048e3d5e73471afa7f80f3043
