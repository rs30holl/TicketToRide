import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 *
 */
public class PathScrollPane implements Runnable{
    private static JList pane;
    private static ArrayList<ButtonItem> buttonList = new ArrayList<>();
    private Board b1 = new Board();

    public void run() {
        for (LocationNode n : b1.points){
            for (Path p : n.getPaths()){
                ButtonItem b = new ButtonItem(p.getStart().getName() + " to " + p.getEnd().getName() + " (" +p.getColor()+ ") ");
                buttonList.add(b);
            }
        }
        Object[] buttons = buttonList.toArray();
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
        frame.getContentPane().add(new JScrollPane(pane));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void clickButtonAt(Point point)
    {
        int index = pane.locationToIndex(point);
        ButtonItem item = (ButtonItem) pane.getModel().getElementAt(index);
        item.getButton().doClick();
    }

        public static void main(String[] args){
        SwingUtilities.invokeLater(new PathScrollPane());
    }
}
