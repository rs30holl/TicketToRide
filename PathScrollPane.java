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
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ScrollPane s = new ScrollPane();
        for (LocationNode n : Board.points){
            for (Path p : n.paths){
                JButton b = new JButton();
                b.setText(p.getStart() + " to " + p.getEnd());
                buttonList.add(b);
            }
        }

        for (JButton b : buttonList){
            s.setContent(b);
        }

        JPanel container = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        container.add(panel);
        JScrollPane scrollPane = new JScrollPane(container);
        f.getContentPane().add(scrollPane);

        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public void addButtons(){

    }

    public void createButtons(){

    }

    /**
     * Creates a JFrame for Koch Curve display
     */
    private static void createAndShowGUI() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PathScrollPane panel = new PathScrollPane();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    createAndShowGUI();
                }
            });
    }
}
