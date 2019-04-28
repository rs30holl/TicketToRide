import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
////////////////////////////////////////////////////////////////////////////////
/**
 * This class creates the panel that holds the possible routes
 * still available to be claimed.
 * 
 * @author Ryan Holland, Julia Krasinski, Briella Sala,
 * Matt Harrison, Michael Lostritto
 * @version 4.28.2019
 */
public class PathScrollPane implements Runnable{
    private static JList pane;
    private static ArrayList<ButtonItem> buttonList = new ArrayList<>();
    private Board b1 = new Board();

    /**
     * This method creates a JFrame which holds a list of buttons corresponding
     * to the path names available to be claimed
     */
    public void run() {
        //makes buttons for all of the paths on the board
        for (LocationNode n : b1.points){
            for (Path p : n.getPaths()){
                ButtonItem b = new ButtonItem(p.getStart().getName() + " to " 
                    + p.getEnd().getName() + " (" +p.getColor()+ ") ");
                buttonList.add(b);
            }
        }
        Object[] buttons = buttonList.toArray();
        //creates a list of all the buttons previously initialized
        pane = new JList(buttons);
        pane.setCellRenderer(new ButtonListRenderer());
        pane.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        pane.setVisibleRowCount(25);
        pane.setLocation(1500,100);
        pane.addMouseListener(new MouseAdapter()
            {
                @Override
                public void mouseClicked(MouseEvent event)
                {
                    clickButtonAt(event.getPoint());

                }
            });

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //adds the list of buttons to a JScrollPanel and adds that to the JFrame
        frame.getContentPane().add(new JScrollPane(pane));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * This method allows you to click the buttons on the JFrame
     * 
     * @param point: the coordinates where you click with your mouse
     */
    private static void clickButtonAt(Point point)
    {
        int index = pane.locationToIndex(point);
        ButtonItem item = (ButtonItem) pane.getModel().getElementAt(index);
        item.getButton().doClick();
    }

    /**
     * This main method creates a PathScrollPane object
     * 
     * @param args[]: not used
     */
    public static void main(String[] args){
        SwingUtilities.invokeLater(new PathScrollPane());
    }
}
