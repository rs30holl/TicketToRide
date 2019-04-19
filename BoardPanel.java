import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class BoardPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BoardPanel extends JPanel
{
    private final ImageIcon board = new ImageIcon(this.getClass().getResource("BoardPicture.jpg"));
    private final Image board2 = board.getImage();
    private  final ImageIcon trainTracks = new ImageIcon(this.getClass().getResource("tracks.jpg"));
    private final Image trainTracks2 = trainTracks.getImage();
    private  final ImageIcon table = new ImageIcon(this.getClass().getResource("table.jpg"));
    private final Image table2 = table.getImage();
    private final ImageIcon transCardBack = new ImageIcon(this.getClass().getResource(".\\fwdpieces1\\verticalCardFace.jpg"));
    private final Image transCardBack2 = transCardBack.getImage();
    private final ImageIcon transCardSide = new ImageIcon(this.getClass().getResource("\\fwdpieces1\\sideCardFace.jpg"));
    private final Image transCardSide2 = transCardSide.getImage();
    private final ImageIcon destTicketBack = new ImageIcon(this.getClass().getResource("\\fwdboardandtransport1\\frontOfCard.jpg"));
    private final Image destTicketBack2 = destTicketBack.getImage();

    /**
     *
     */
    public BoardPanel(){
        setPreferredSize(new Dimension(2500,1500));
    }

    /**
     * @param g
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int halfWidth = (int)(0.5 * getWidth());
        int quarterHeight = (int)(0.75 * getHeight());

        g.drawImage(board2, 0, 0, halfWidth, getHeight(), this);
        g.drawImage(trainTracks2, halfWidth, 0, halfWidth, quarterHeight,this);
        g.drawImage(table2, halfWidth, quarterHeight, halfWidth, quarterHeight / 3, this);
        //g.drawImage(transCardBack2, (int)(0.75 * getWidth()), getHeight() % 100, getWidth() / 10, getHeight() % 100, this);
        //g.drawImage(destTicketBack2, 0, 0, getWidth() / 10, getHeight() % 100, this);
        //g.drawImage(transCardBack2, 0, 0, getWidth() / 10, getHeight() % 100, this);
        g.drawImage(transCardBack2, (int)(0.71 * getWidth()), 40, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(destTicketBack2, (int)(0.71 * getWidth()), 290, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardSide2, (int)(0.865 * getWidth()), 40, getWidth() / 10, getHeight() / 10, this);
    }

    /**
     *
     */
    public static void createAndShowGUI(){
        JFrame frame = new JFrame("Ticket to Ride: NYC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BoardPanel panel = new BoardPanel();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }

    /**
     * @param args
     */
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    createAndShowGUI();
                }
            });

    }
}
