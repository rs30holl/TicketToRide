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
     * @param p
     */
    public PathScrollPane(JPanel p){
        setPreferredSize(new Dimension(p.getWidth() / 4, p.getHeight() - 30));
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