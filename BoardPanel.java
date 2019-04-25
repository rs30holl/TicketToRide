import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 * Write a description of class BoardPanel here.
 *
 * @author Ryan Holland, Julia Krasinski, Briella Sala,
 *  * Matt Harrison, Michael Lostritto
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
    private static final ImageIcon transCardBack = new ImageIcon(
            ".\\ttr cards\\vcardback.png");
    // private static final Image transCardBack2 = transCardBack.getImage();
    private static final ImageIcon blue = new ImageIcon(
            ".\\ttr cards\\bluecard.png");
    private static final ImageIcon black = new ImageIcon(
            ".\\ttr cards\\blackcard.png");
    private static final ImageIcon green = new ImageIcon(
            ".\\ttr cards\\greencard.png");
    private static final ImageIcon orange = new ImageIcon(
            ".\\ttr cards\\orangecard.png");
    private static final ImageIcon rainbow = new ImageIcon(
            ".\\ttr cards\\rainbowcard.png");
    private static final ImageIcon transCardSide = new ImageIcon(
            ".\\ttr cards\\cardback.png");
    //private final Image transCardSide2 = transCardSide.getImage();
    private static final ImageIcon destTicketBack = new ImageIcon(
            ".\\ttr cards\\vcardbackDT.png");

    //private final Image destTicketBack2 = destTicketBack.getImage();
    static ArrayList<Player> list = new ArrayList<>();

    /**
     *
     */
    public BoardPanel(){
        setPreferredSize(new Dimension(2500,1500));

    }

    /**
     * @param g Graphics
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

        /*
        g.drawImage(transCardBack2, (int)(0.715 * getWidth()),
        40, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(destTicketBack2, (int)(0.715 * getWidth()), 
        270, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardSide2, (int)(0.865 * getWidth()), 
        40, getWidth() / 10, getHeight() / 8, this);

        g.drawImage(transCardBack2, (int)(0.51 * getWidth()), 
        quarterHeight +25, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardBack2, (int)(0.6 * getWidth()), 
        quarterHeight +25, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardBack2, (int)(0.7 * getWidth()), 
        quarterHeight +25, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardBack2, (int)(0.8 * getWidth()), 
        quarterHeight +25, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardBack2, (int)(0.9 * getWidth()), 
        quarterHeight +25, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardBack2, (int)(0.715 * getWidth()), 
        40, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(destTicketBack2, (int)(0.715 * getWidth()), 
        270, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardSide2, (int)(0.865 * getWidth()), 40, 
        getWidth() / 10, getHeight() / 8, this);

        g.drawImage(transCardBack2, (int)(0.51 * getWidth()), 
        quarterHeight +25, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardBack2, (int)(0.6 * getWidth()), 
        quarterHeight +25, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardBack2, (int)(0.7 * getWidth()), 
        quarterHeight +25, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardBack2, (int)(0.8 * getWidth()), 
        quarterHeight +25, getWidth() / 15, getHeight() / 5, this);
        g.drawImage(transCardBack2, (int)(0.9 * getWidth()), 
        quarterHeight +25, getWidth() / 15, getHeight() / 5, this);

         */

    }

    /**
     *
     */
    private static void createAndShowGUI(){
        //JFrame frame = new JFrame("Ticket to Ride: NYC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BoardPanel panel = new BoardPanel();
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        frame.pack();
        frame.setVisible(true);

        //int halfWidth = (int)(0.5 * frame.getWidth());
        int quarterHeight = (int)(0.71 * frame.getHeight());
        int cardWidth = frame.getWidth() / 15;
        int cardHeight = frame.getHeight() / 5;

        JLabel tcDeck = new JLabel();
        tcDeck.setBounds( (int)(0.71 * frame.getWidth()),
            15, cardWidth, cardHeight);
        tcDeck.setIcon(new ImageIcon(transCardBack.getImage().getScaledInstance(
                    cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        tcDeck.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    for (Player p : list){
                        if (p.getState()){
                            p.turn(0, null, null);
                            p.turn(0, null, null);
                            p.setState(false);
                            break;
                        }
                    }
                }
            });

        JLabel dtDeck = new JLabel();
        dtDeck.setBounds( (int)(0.71 * frame.getWidth()),
            frame.getHeight() / 5 + 20 , cardWidth, cardHeight);
        dtDeck.setIcon(new ImageIcon(destTicketBack.getImage().getScaledInstance(
                    cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        dtDeck.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    for (Player p : list){
                        if (p.getState()){
                            p.turn(1, null, null);
                            p.setState(false);
                            break;
                        }
                    }
                }
            });

        JLabel faceUp1 = new JLabel();
        faceUp1.setBounds((int)(0.51 * frame.getWidth()),
            9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
        faceUp1.setIcon(new ImageIcon(transCardBack.getImage().getScaledInstance(
                    cardWidth, cardHeight, Image.SCALE_SMOOTH)));

        JLabel faceUp2 = new JLabel();
        faceUp2.setBounds((int)(0.6 * frame.getWidth()),
            9*quarterHeight/10 + frame.getWidth() / 100, cardWidth, cardHeight);
        faceUp2.setIcon(new ImageIcon(transCardBack.getImage().getScaledInstance(
                    cardWidth, cardHeight, Image.SCALE_SMOOTH)));

        JLabel faceUp3 = new JLabel();
        faceUp3.setBounds((int)(0.7 * frame.getWidth()),
            9*quarterHeight/10 + frame.getWidth() / 100, cardWidth, cardHeight);
        faceUp3.setIcon(new ImageIcon(transCardBack.getImage().getScaledInstance(
                    faceUp3.getWidth(), faceUp3.getHeight(), Image.SCALE_SMOOTH)));

        JLabel faceUp4 = new JLabel();
        faceUp4.setBounds((int)(0.8 * frame.getWidth()),
            9*quarterHeight/10 + (frame.getWidth() / 100), cardWidth, cardHeight);
        faceUp4.setIcon(new ImageIcon(transCardBack.getImage().getScaledInstance(
                    cardWidth, cardHeight, Image.SCALE_SMOOTH)));

        JLabel faceUp5 = new JLabel();
        faceUp5.setBounds((int)(0.9 * frame.getWidth()),
            9*quarterHeight/10 + frame.getWidth() / 100, cardWidth, cardHeight);
        faceUp5.setIcon(new ImageIcon(transCardBack.getImage().getScaledInstance(
                    cardWidth, cardHeight, Image.SCALE_SMOOTH)));

        panel.add(tcDeck);
        panel.add(dtDeck);
        panel.add(faceUp1);
        panel.add(faceUp2);
        panel.add(faceUp3);
        panel.add(faceUp4);
        panel.add(faceUp5);
        Board b = new Board();
        for(int i = 0; i < 6; i++){
            if(b.tcDeck.get(i).getColor().equals("ORANGE")){
                JLabel faceUp11 = new JLabel();
                faceUp11.setBounds((int)(0.51 * frame.getWidth()),
                    9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                faceUp11.setIcon(new ImageIcon(orange.getImage().getScaledInstance(
                            cardWidth, cardHeight, Image.SCALE_SMOOTH)));
            }
            if(b.tcDeck.get(i).getColor().equals("RED")){
                JLabel faceUp11 = new JLabel();
                faceUp11.setBounds((int)(0.51 * frame.getWidth()),
                    9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                faceUp11.setIcon(new ImageIcon(red.getImage().getScaledInstance(
                            cardWidth, cardHeight, Image.SCALE_SMOOTH)));
            }
            if(b.tcDeck.get(i).getColor().equals("BLACK")){
                JLabel faceUp11 = new JLabel();
                faceUp11.setBounds((int)(0.51 * frame.getWidth()),
                    9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                faceUp11.setIcon(new ImageIcon(black.getImage().getScaledInstance(
                            cardWidth, cardHeight, Image.SCALE_SMOOTH)));
            }
            if(b.tcDeck.get(i).getColor().equals("BLUE")){
                JLabel faceUp11 = new JLabel();
                faceUp11.setBounds((int)(0.51 * frame.getWidth()),
                    9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                faceUp11.setIcon(new ImageIcon(blue.getImage().getScaledInstance(
                            cardWidth, cardHeight, Image.SCALE_SMOOTH)));
            }
            if(b.tcDeck.get(i).getColor().equals("PINK")){
                JLabel faceUp11 = new JLabel();
                faceUp11.setBounds((int)(0.51 * frame.getWidth()),
                    9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                faceUp11.setIcon(new ImageIcon(pink.getImage().getScaledInstance(
                            cardWidth, cardHeight, Image.SCALE_SMOOTH)));
            }
            if(b.tcDeck.get(i).getColor().equals("RAINBOW")){
                JLabel faceUp11 = new JLabel();
                faceUp11.setBounds((int)(0.51 * frame.getWidth()),
                    9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                faceUp11.setIcon(new ImageIcon(rainbow.getImage().getScaledInstance(
                            cardWidth, cardHeight, Image.SCALE_SMOOTH)));
            }
        }

        Object[] options = {"2", "3", "4"};

        int x = JOptionPane.showOptionDialog(frame,"How many players?",
                "Number of Players",JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,options,options[2]);

        if(x == JOptionPane.YES_OPTION){//2 players
            String name1 = JOptionPane.showInputDialog("Player 1 enter your name.");
            int a1 = Integer.parseInt(JOptionPane.
                    showInputDialog("Player 1 enter age"));
            Player p1 = new Player(name1, a1);

            String name2 = JOptionPane.
                showInputDialog("Player 2 enter your name.");
            int a2 = Integer.parseInt(JOptionPane.
                    showInputDialog("Player 2 enter age"));
            Player p2 = new Player(name2, a2);

            if(p1.getAge() < p2.getAge()){
                JOptionPane.showMessageDialog(frame, p1.getName() + " goes first.");
                list.add(p1);
                list.add(p2);

            }
            else{
                JOptionPane.showMessageDialog(frame, p2.getName() + " goes first.");
                list.add(p2);
                list.add(p1);

            }
        }
        else if(x == JOptionPane.NO_OPTION){//3 players
            String name1 = JOptionPane.
                showInputDialog("Player 1 enter your name.");
            int a1 = Integer.parseInt(JOptionPane.
                    showInputDialog("Player 1 enter age"));
            Player p1 = new Player(name1, a1);

            String name2 = JOptionPane.
                showInputDialog("Player 2 enter your name.");
            int a2 = Integer.parseInt(JOptionPane.
                    showInputDialog("Player 2 enter age"));
            Player p2 = new Player(name2, a2);

            String name3 = JOptionPane.
                showInputDialog("Player 3 enter your name.");
            int a3 = Integer.parseInt(JOptionPane.
                    showInputDialog("Player 3 enter age"));
            Player p3 = new Player(name3, a3);
            if(p1.getAge() < p2.getAge() && p1.getAge() < p3.getAge()){

                list.add(p1);
                list.add(p2);
                list.add(p3);
                JOptionPane.showMessageDialog(frame, p1.getName() + " goes first.");
            }
            else if(p2.getAge() < p1.getAge() && p2.getAge() < p3.getAge()){

                JOptionPane.showMessageDialog(frame, p2.getName() + " goes first.");
                list.add(p2);
                list.add(p3);
                list.add(p1);
            }      
            else{
                JOptionPane.showMessageDialog(frame, p3.getName() + " goes first.");                
                list.add(p3);
                list.add(p1);
                list.add(p2);
            }
        }
        else{//4 players
            String name1 = JOptionPane.showInputDialog("Player 1 enter your name.");
            int a1 = Integer.parseInt(JOptionPane.
                    showInputDialog("Player 1 enter age"));
            Player p1 = new Player(name1, a1);

            String name2 = JOptionPane.showInputDialog("Player 2 enter your name.");
            int a2 = Integer.parseInt(JOptionPane.
                    showInputDialog("Player 2 enter age"));
            Player p2 = new Player(name2, a2);

            String name3 = JOptionPane.showInputDialog("Player 3 enter your name.");
            int a3 = Integer.parseInt(JOptionPane.
                    showInputDialog("Player 3 enter age"));
            Player p3 = new Player(name3, a3);

            String name4 = JOptionPane.showInputDialog("Player 4 enter your name.");
            int a4 = Integer.parseInt(JOptionPane.
                    showInputDialog("Player 4 enter age"));
            Player p4 = new Player(name4, a4);

            if(p1.getAge() < p2.getAge() && p1.getAge() < p3.getAge() && 
            p1.getAge()< p4.getAge()){
                list.add(p1);
                list.add(p2);
                list.add(p3);
                list.add(p4);
                JOptionPane.showMessageDialog(frame, p1.getName() + " goes first.");
            }
            else if(p2.getAge() < p1.getAge() && p2.getAge() < p3.getAge() &&
            p2.getAge() < p4.getAge()){
                list.add(p2);
                list.add(p3);
                list.add(p4);
                list.add(p1);
                JOptionPane.showMessageDialog(frame, p2.getName() + " goes first.");
                list.add(p2);
            } 
            else if(p3.getAge() < p1.getAge() && p3.getAge() < p2.getAge() &&
            p3.getAge() < p4.getAge()){
                list.add(p3);
                list.add(p4);
                list.add(p1);
                list.add(p2);
                JOptionPane.showMessageDialog(frame, p3.getName() + " goes first.");
            }
            else{
                JOptionPane.showMessageDialog(frame, p4.getName() + " goes first.");
                list.add(p4);
                list.add(p1);
                list.add(p2);
                list.add(p3);
            }
        }

        if (list.size() == 2){
            JLabel p1 = new JLabel();
            //p1.setBounds();
            p1.setIcon(new ImageIcon(transCardSide.getImage().getScaledInstance(
                        cardWidth, cardHeight, Image.SCALE_SMOOTH)));

            JLabel p2 = new JLabel();
            //p2.setBounds();
            p2.setIcon(new ImageIcon(transCardSide.getImage().getScaledInstance(
                        cardWidth, cardHeight, Image.SCALE_SMOOTH)));

            panel.add(p1);
            panel.add(p2);
        }
        else if (list.size() == 3){
            JLabel p1 = new JLabel();
            //p1.setBounds();
            p1.setIcon(new ImageIcon(transCardSide.getImage().getScaledInstance(
                        cardWidth, cardHeight, Image.SCALE_SMOOTH)));

            JLabel p2 = new JLabel();
            //p2.setBounds();
            p2.setIcon(new ImageIcon(transCardSide.getImage().getScaledInstance(
                        cardWidth, cardHeight, Image.SCALE_SMOOTH)));

            JLabel p3 = new JLabel();
            //p3.setBounds();
            p3.setIcon(new ImageIcon(transCardSide.getImage().getScaledInstance(
                        cardWidth, cardHeight, Image.SCALE_SMOOTH)));

            panel.add(p1);
            panel.add(p2);
            panel.add(p3);
        }
        else if (list.size() == 4){
            JLabel p1 = new JLabel();
            //p1.setBounds();
            p1.setIcon(new ImageIcon(transCardSide.getImage().getScaledInstance(
                        cardWidth, cardHeight, Image.SCALE_SMOOTH)));

            JLabel p2 = new JLabel();
            //p2.setBounds();
            p2.setIcon(new ImageIcon(transCardSide.getImage().getScaledInstance(
                        cardWidth, cardHeight, Image.SCALE_SMOOTH)));

            JLabel p3 = new JLabel();
            //p3.setBounds();
            p3.setIcon(new ImageIcon(transCardSide.getImage().getScaledInstance(
                        cardWidth, cardHeight, Image.SCALE_SMOOTH)));

            JLabel p4 = new JLabel();
            //p4.setBounds();
            p4.setIcon(new ImageIcon(transCardSide.getImage().getScaledInstance(
                        cardWidth, cardHeight, Image.SCALE_SMOOTH)));

            panel.add(p1);
            panel.add(p2);
            panel.add(p3);
            panel.add(p4);
        }

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
     * @param args not used
     */
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
                public void run(){
                    createAndShowGUI();
                }
            });

    }
}
