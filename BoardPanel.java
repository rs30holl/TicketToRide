import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/**
 * Write a description of class BoardPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BoardPanel extends JPanel implements MouseListener
{
////////////////////////////////////////////////////////////////////////////////                  
    private static final JFrame frame = new JFrame("Ticket to Ride: NYC");
    private final ImageIcon board = new ImageIcon(this.getClass().
        getResource("BoardPicture.jpg"));
    //private final ImageIcon board = new ImageIcon("Images" + File.separator 
        //+"BoardPicture.jpg").getImage();
    private final Image board2 = board.getImage();
    //private static Image board;
    private  final ImageIcon trainTracks = new ImageIcon(this.getClass().
        getResource("tracks.jpg"));
    private final Image trainTracks2 = trainTracks.getImage();
    private  final ImageIcon table = new ImageIcon(this.getClass().
        getResource("table.jpg"));
    private final Image table2 = table.getImage();
    private final ImageIcon transCardBack = new ImageIcon(this.getClass().
        getResource(".\\fwdpieces1\\verticalCardFace.jpg"));
    private final Image transCardBack2 = transCardBack.getImage();
    private final ImageIcon transCardSide = new ImageIcon(this.getClass().
        getResource("\\fwdpieces1\\sideCardFace.jpg"));
    private final Image transCardSide2 = transCardSide.getImage();
    private final ImageIcon destTicketBack = new ImageIcon(this.getClass().
        getResource("\\fwdboardandtransport1\\frontOfCard.jpg"));
    private final Image destTicketBack2 = destTicketBack.getImage();

    /**
     *
     */
    public BoardPanel(){
        setPreferredSize(new Dimension(2500,1500));
        //board = new ImageIcon("Images" + File.separator 
           // +"BoardPicture.jpg").getImage();
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
        g.drawImage(table2, halfWidth, quarterHeight, halfWidth, 
            quarterHeight / 3, this);
        //g.drawImage(transCardBack2, (int)(0.75 * getWidth()), getHeight() % 100, getWidth() / 10, getHeight() % 100, this);
        //g.drawImage(destTicketBack2, 0, 0, getWidth() / 10, getHeight() % 100, this);
        //g.drawImage(transCardBack2, 0, 0, getWidth() / 10, getHeight() % 100, this);
        g.drawImage(transCardBack2, (int)(0.715 * getWidth()), 
            40, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(destTicketBack2, (int)(0.715 * getWidth()), 
            270, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardSide2, (int)(0.865 * getWidth()), 40, 
            getWidth() / 10, getHeight() / 8, this);

        g.drawImage(transCardBack2, (int)(0.51 * getWidth()), 750, 
            getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardBack2, (int)(0.6 * getWidth()), 750, 
            getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardBack2, (int)(0.7 * getWidth()), 750, 
            getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardBack2, (int)(0.8 * getWidth()), 750, 
            getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardBack2, (int)(0.9 * getWidth()), 750, 
            getWidth() / 15, getHeight() / 5, this);
    }

    /**
     *
     */
    public static void createAndShowGUI(){
        //JFrame frame = new JFrame("Ticket to Ride: NYC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BoardPanel panel = new BoardPanel();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }

    public void mousePressed(MouseEvent e){}

    public void mouseEntered(MouseEvent e){}

    public void mouseReleased(MouseEvent e){}

    public void mouseExited(MouseEvent e){}

    public void mouseClicked(MouseEvent e){
        BoardPanel.main(new String[0]);
        for(int i = 0; i < 4; i++){
            //TransportationCard t = Board.tcDeck(0);
            //tcdeck.remove();
            ImageIcon t1 = new ImageIcon(this.getClass().
                getResource("\\fwdpieces1\\verticalPink.jpg"));
            Image t2 = destTicketBack.getImage();
            //.drawImage(t2, (int)(0.51 * getWidth()), 750, getWidth() / 15, getHeight() / 5, this);
        }
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
