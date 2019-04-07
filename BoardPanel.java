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
    
    public BoardPanel(){
        setPreferredSize(new Dimension(1000,1500));
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawImage(board2, 0, 0, getWidth(), getHeight(), this);
    }

    public static void createAndShowGUI(){
        JFrame frame = new JFrame("Ticket to Ride: NYC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BoardPanel panel = new BoardPanel();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    createAndShowGUI();
                }
            });
        
    }
}
