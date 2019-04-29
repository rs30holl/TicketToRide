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
public class PathScrollPane extends JList{
    private static JList pane;
    private static ArrayList<ButtonItem> buttonList = new ArrayList<>();
    private Board board;

    public PathScrollPane(Board b1){
        board = b1;
    }

    public JScrollPane PathScrollPane(){
        //makes buttons for all of the paths on the board
        for (LocationNode n : board.points){
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
        pane.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent event)
            {
                clickButtonAt(event.getPoint());
            }
        });
        JScrollPane s = new JScrollPane(pane);
        return s;
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
    //public static void main(String[] args){
       // SwingUtilities.invokeLater(new PathScrollPane());
    //}
}
