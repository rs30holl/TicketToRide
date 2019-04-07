import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class OpeningScreen here.
 *
 * @author Ryan Holland, Julia Krasinski, Briella Sala,
 * Matt Harrison, Michael Lostritto
 * @version (a version number or a date)
 */
public class OpeningScreen extends JPanel
{
    private final ImageIcon cover = new ImageIcon(this.getClass().getResource("/fwdpieces/Cover.jpg"));
    private final Image cover2 = cover.getImage();

    public OpeningScreen(){
        setPreferredSize(new Dimension(1000,1000));
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawImage(cover2, 0, 0, getWidth(), getHeight(), this);
    }

    public static void createAndShowGUI(){
        JFrame frame = new JFrame("Ticket to Ride: NYC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        OpeningScreen panel = new OpeningScreen();
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
