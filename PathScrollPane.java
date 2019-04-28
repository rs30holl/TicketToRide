import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 *
 */
public class PathScrollPane extends JScrollPane{
    private JScrollPane pane = new JScrollPane();
    private ArrayList<JButton> buttonList = new ArrayList<>();

    /**
     *
     */
    public PathScrollPane(){
        createButtons();
        addButtons();
    }

    public void addButtons(){
        for (JButton b : buttonList){
            pane.add(b);
        }
    }

    public void createButtons(){
        for (LocationNode n : Board.points){
            for (Path p : n.paths){
                JButton b = new JButton();
                b.setText(p.getStart() + " to " + p.getEnd());
                buttonList.add(b);
            }
        }
    }
}
