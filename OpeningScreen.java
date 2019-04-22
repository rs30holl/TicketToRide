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
public class OpeningScreen extends JPanel implements MouseListener
{
    private final ImageIcon cover = new ImageIcon(this.getClass().getResource("/fwdpieces1/Cover.jpg"));
    private final Image cover2 = cover.getImage();
    private static final JFrame frame = new JFrame("Ticket to Ride: NYC");

    public OpeningScreen(){
        setPreferredSize(new Dimension(1000,1000));
        addMouseListener(this);
        //Board b = new Board();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawImage(cover2, 0, 0, getWidth(), getHeight(), this);
    }

    public static void createAndShowGUI(){

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        OpeningScreen panel = new OpeningScreen();
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
        frame.dispose();
    }

    public static void main(String[] args){
        
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    createAndShowGUI();
                }
            });
    }
}
