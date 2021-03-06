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
    private static final ImageIcon red = new ImageIcon(
            ".\\fwdpieces1\\verticalRed.jpg");
    private static final ImageIcon pink = new ImageIcon(
            ".\\fwdpieces1\\verticalPink.jpg");
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
    private static int numPlayers = 0;
    private static Player p1;
    private static Player p2;
    private static Player p3;
    private static Player p4;
    private static Board b = new Board();

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

    }

    private static void generateCards(JPanel p){
        //BoardPanel p = new BoardPanel();
        int halfWidth = (int)(0.5 * frame.getWidth());
        int quarterHeight = (int)(0.71 * frame.getHeight());
        int cardWidth = frame.getWidth() / 15;
        int cardHeight = frame.getHeight() / 5;

        for(int i = 0; i < 5; i++){
            if((b.tcDeck.get(b.tcDeck.size() - 1)).getColor().equals("ORANGE")){
                Card x = (b.tcDeck.get(b.tcDeck.size() - 1));
                JLabel faceUp11 = new JLabel();
                faceUp11.addMouseListener(new MouseAdapter(){
                        public void mouseClicked(MouseEvent e){
                            for (Player p : list){
                                if (p.getState()){
                                    if (p.getTurnCount() == 2){
                                        p.setState(false);
                                        p.setTurnCount(0);
                                        break;
                                    }
                                    else if (p.getTurnCount() == 1){
                                        p.turn(3,null,x);
                                        p.setState(false);
                                        p.setTurnCount(0);
                                        break;
                                    }
                                    p.turn(3,null,x);
                                    break;
                                }
                            }
                            removeCard(faceUp11);
                        }
                    });
                if(i ==0){
                    faceUp11.setBounds((int)(0.51 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(orange.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 1){
                    faceUp11.setBounds((int)(0.6 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(orange.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 2){
                    faceUp11.setBounds((int)(0.7 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(orange.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 3){
                    faceUp11.setBounds((int)(0.8 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(orange.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else{
                    faceUp11.setBounds((int)(0.9 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(orange.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }

            }
            else if((b.tcDeck.get(b.tcDeck.size() - 1)).getColor().equals("GREEN")){
                Card x = (b.tcDeck.get(b.tcDeck.size() - 1));
                JLabel faceUp11 = new JLabel();
                faceUp11.addMouseListener(new MouseAdapter(){
                        public void mouseClicked(MouseEvent e){
                            for (Player p : list){
                                if (p.getState()){
                                    if (p.getTurnCount() == 2){
                                        p.setState(false);
                                        p.setTurnCount(0);
                                        break;
                                    }
                                    else if (p.getTurnCount() == 1){
                                        p.turn(3,null,x);
                                        p.setState(false);
                                        p.setTurnCount(0);
                                        break;
                                    }
                                    p.turn(3,null,x);
                                    break;
                                }
                            }
                            removeCard(faceUp11);
                        }
                    });
                if(i ==0){
                    faceUp11.setBounds((int)(0.51 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(green.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 1){
                    faceUp11.setBounds((int)(0.6 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(green.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 2){
                    faceUp11.setBounds((int)(0.7 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(green.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 3){
                    faceUp11.setBounds((int)(0.8 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(green.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else{
                    faceUp11.setBounds((int)(0.9 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(green.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }

            }
            else if((b.tcDeck.get(b.tcDeck.size() - 1)).getColor().equals("RED")){
                Card x = (b.tcDeck.get(b.tcDeck.size() - 1));
                JLabel faceUp11 = new JLabel();
                faceUp11.addMouseListener(new MouseAdapter(){
                        public void mouseClicked(MouseEvent e){
                            for (Player p : list){
                                if (p.getState()){
                                    if (p.getTurnCount() == 2){
                                        p.setState(false);
                                        p.setTurnCount(0);
                                        break;
                                    }
                                    else if (p.getTurnCount() == 1){
                                        p.turn(3,null,x);
                                        p.setState(false);
                                        p.setTurnCount(0);
                                        break;
                                    }
                                    p.turn(3,null,x);
                                    break;
                                }
                            }
                            removeCard(faceUp11);
                        }
                    });
                if(i ==0){
                    faceUp11.setBounds((int)(0.51 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(red.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 1){
                    faceUp11.setBounds((int)(0.6 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(red.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 2){
                    faceUp11.setBounds((int)(0.7 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(red.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 3){
                    faceUp11.setBounds((int)(0.8 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(red.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else{
                    faceUp11.setBounds((int)(0.9 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(red.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }

            }
            else if((b.tcDeck.get(b.tcDeck.size() - 1)).getColor().equals("BLACK")){
                Card x = (b.tcDeck.get(b.tcDeck.size() - 1));
                JLabel faceUp11 = new JLabel();
                faceUp11.addMouseListener(new MouseAdapter(){
                        public void mouseClicked(MouseEvent e){
                            for (Player p : list){
                                if (p.getState()){
                                    if (p.getTurnCount() == 2){
                                        p.setState(false);
                                        p.setTurnCount(0);
                                        break;
                                    }
                                    else if (p.getTurnCount() == 1){
                                        p.turn(3,null,x);
                                        p.setState(false);
                                        p.setTurnCount(0);
                                        break;
                                    }
                                    p.turn(3,null,x);
                                    break;
                                }
                            }
                            removeCard(faceUp11);
                        }
                    });
                if(i ==0){
                    faceUp11.setBounds((int)(0.51 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(black.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 1){
                    faceUp11.setBounds((int)(0.6 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(black.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 2){
                    faceUp11.setBounds((int)(0.7 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(black.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 3){
                    faceUp11.setBounds((int)(0.8 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(black.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else{
                    faceUp11.setBounds((int)(0.9 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(black.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
            }
            else if((b.tcDeck.get(b.tcDeck.size() - 1)).getColor().equals("BLUE")){
                Card x = (b.tcDeck.get(b.tcDeck.size() - 1));
                JLabel faceUp11 = new JLabel();
                faceUp11.addMouseListener(new MouseAdapter(){
                        public void mouseClicked(MouseEvent e){
                            for (Player p : list){
                                if (p.getState()){
                                    if (p.getTurnCount() == 2){
                                        p.setState(false);
                                        p.setTurnCount(0);
                                        break;
                                    }
                                    else if (p.getTurnCount() == 1){
                                        p.turn(3,null,x);
                                        p.setState(false);
                                        p.setTurnCount(0);
                                        break;
                                    }
                                    p.turn(3,null,x);
                                    break;
                                }
                            }
                            removeCard(faceUp11);
                        }
                    });
                if(i ==0){
                    faceUp11.setBounds((int)(0.51 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(blue.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 1){
                    faceUp11.setBounds((int)(0.6 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(blue.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 2){
                    faceUp11.setBounds((int)(0.7 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(blue.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 3){
                    faceUp11.setBounds((int)(0.8 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(blue.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else{
                    faceUp11.setBounds((int)(0.9 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(blue.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
            }
            else if((b.tcDeck.get(b.tcDeck.size() - 1)).getColor().equals("PINK")){
                Card x = (b.tcDeck.get(b.tcDeck.size() - 1));
                JLabel faceUp11 = new JLabel();
                faceUp11.addMouseListener(new MouseAdapter(){
                        public void mouseClicked(MouseEvent e){
                            for (Player p : list){
                                if (p.getState()){
                                    if (p.getTurnCount() == 2){
                                        p.setState(false);
                                        p.setTurnCount(0);
                                        break;
                                    }
                                    else if (p.getTurnCount() == 1){
                                        p.turn(3,null,x);
                                        p.setState(false);
                                        p.setTurnCount(0);
                                        break;
                                    }
                                    p.turn(3,null,x);
                                    break;
                                }
                            }
                            removeCard(faceUp11);
                        }
                    });
                if(i ==0){
                    faceUp11.setBounds((int)(0.51 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(pink.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 1){
                    faceUp11.setBounds((int)(0.6 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(pink.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 2){
                    faceUp11.setBounds((int)(0.7 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(pink.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 3){
                    faceUp11.setBounds((int)(0.8 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(pink.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else{
                    faceUp11.setBounds((int)(0.9 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(pink.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
            }
            else if((b.tcDeck.get(b.tcDeck.size() - 1)).getColor().equals("RAINBOW")){
                Card x = (b.tcDeck.get(b.tcDeck.size() - 1));
                JLabel faceUp11 = new JLabel();
                faceUp11.addMouseListener(new MouseAdapter(){
                        public void mouseClicked(MouseEvent e){
                            for (Player p : list){
                                if (p.getState()){
                                    if (p.getTurnCount() == 2){
                                        p.setState(false);
                                        p.setTurnCount(0);
                                        break;
                                    }
                                    else if (p.getTurnCount() == 1){
                                        p.turn(3,null,x);
                                        p.setState(false);
                                        p.setTurnCount(0);
                                        break;
                                    }
                                    p.turn(3,null,x);
                                    break;
                                }
                            }
                            removeCard(faceUp11);
                        }
                    });
                if(i ==0){
                    faceUp11.setBounds((int)(0.51 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(rainbow.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 1){
                    faceUp11.setBounds((int)(0.6 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(rainbow.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 2){
                    faceUp11.setBounds((int)(0.7 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(rainbow.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else if(i == 3){
                    faceUp11.setBounds((int)(0.8 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(rainbow.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
                else{
                    faceUp11.setBounds((int)(0.9 * frame.getWidth()),
                        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
                    faceUp11.setIcon(new ImageIcon(rainbow.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(faceUp11);
                }
            }
            b.discard.add(b.tcDeck.get(b.tcDeck.size()-1));
            b.tcDeck.remove(b.tcDeck.size() - 1);
        }
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
        //generateCards(panel);

        int halfWidth = (int)(0.5 * frame.getWidth());
        int quarterHeight = (int)(0.71 * frame.getHeight());
        int cardWidth = frame.getWidth() / 15;
        int cardHeight = frame.getHeight() / 5;

        JLabel faceUp11 = new JLabel();
        faceUp11.setBounds((int)(0.9 * frame.getWidth()),
            9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
        faceUp11.setIcon(new ImageIcon(rainbow.getImage().getScaledInstance(
                    cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        panel.add(faceUp11);

        JLabel tcDeck = new JLabel();
        tcDeck.setBounds( (int)(0.71 * frame.getWidth()),
            30, cardWidth, cardHeight);
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
            frame.getHeight() / 5 + 75 , cardWidth, cardHeight);
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

        //adds the card decks to the board    
        panel.add(tcDeck);
        panel.add(dtDeck);
        panel.generateCards(panel);
        /*
        JLabel faceUp21 = new JLabel();
        faceUp21.setBounds((int)(0.51 * frame.getWidth()),
        9*quarterHeight/10 + frame.getWidth() / 100 , cardWidth, cardHeight);
        faceUp21.setIcon(new ImageIcon(orange.getImage().getScaledInstance(
        cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        panel.add(faceUp21);
         */

        PathScrollPane scroll = new PathScrollPane(b);
        JScrollPane s = scroll.PathScrollPane();
        s.setBounds(halfWidth + 20, 30, cardWidth + 200, quarterHeight - 75);
        panel.add(s);

        JButton score = new JButton("Show Score");
        score.setBounds(1370, 650, 150,50);
        panel.add(score);
        score.addActionListener(new ActionListener() { 
                public void actionPerformed(ActionEvent e) { 
                    selectionButtonPressed();
                } 
            } );

        //score.setVisible(true);
        Object[] options = {"2", "3", "4"};
        int x = JOptionPane.showOptionDialog(frame,"How many players?",
                "Number of Players",JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,options,options[2]);

        if(x == JOptionPane.YES_OPTION){//2 players
            String name1 = JOptionPane.showInputDialog("Player 1 enter your name.");
            int a1 = Integer.parseInt(JOptionPane.
                    showInputDialog("Player 1 enter age"));
            p1 = new Player(name1, a1);

            String name2 = JOptionPane.
                showInputDialog("Player 2 enter your name.");
            int a2 = Integer.parseInt(JOptionPane.
                    showInputDialog("Player 2 enter age"));
            p2 = new Player(name2, a2);
            numPlayers = 2;
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
            p1 = new Player(name1, a1);

            String name2 = JOptionPane.
                showInputDialog("Player 2 enter your name.");
            int a2 = Integer.parseInt(JOptionPane.
                    showInputDialog("Player 2 enter age"));
            p2 = new Player(name2, a2);

            String name3 = JOptionPane.
                showInputDialog("Player 3 enter your name.");
            int a3 = Integer.parseInt(JOptionPane.
                    showInputDialog("Player 3 enter age"));
            p3 = new Player(name3, a3);
            numPlayers = 3;
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
            p1 = new Player(name1, a1);

            String name2 = JOptionPane.showInputDialog("Player 2 enter your name.");
            int a2 = Integer.parseInt(JOptionPane.
                    showInputDialog("Player 2 enter age"));
            p2 = new Player(name2, a2);

            String name3 = JOptionPane.showInputDialog("Player 3 enter your name.");
            int a3 = Integer.parseInt(JOptionPane.
                    showInputDialog("Player 3 enter age"));
            p3 = new Player(name3, a3);

            String name4 = JOptionPane.showInputDialog("Player 4 enter your name.");
            int a4 = Integer.parseInt(JOptionPane.
                    showInputDialog("Player 4 enter age"));
            p4 = new Player(name4, a4);
            numPlayers = 4; 
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


        addButtons(panel);
        for(Player p : list){
            p.startGame();
        }
        frame.pack();
        frame.setVisible(true);

    }
    

    public static void addButtons(JPanel panel){
        if (list.size() == 2){

            JButton j1 = new JButton();
            j1.setText(p1.getName() + "'s Hand");
            j1.setBounds(frame.getWidth() - 200,100,150,50);
            j1.setVisible(true);
            j1.addActionListener(new ActionListener() { 
                    public void actionPerformed(ActionEvent e) { 
                        new showHand();
                    } 
                } );

            JButton j2 = new JButton(p2.getName() + "'s Hand");
            j2.setBounds(frame.getWidth() - 200, 150, 150, 50);
            j2.addActionListener(new ActionListener() { 
                    public void actionPerformed(ActionEvent e) { 
                        new showHand();
                    } 
                } );

            panel.add(j1);
            panel.add(j2);

        }
        else if (list.size() == 3){
            JButton j1 = new JButton(p1.getName() + "'s Hand");
            j1.setBounds(frame.getWidth() - 200,100,150,50);
            j1.addActionListener(new ActionListener() { 
                    public void actionPerformed(ActionEvent e) { 
                        new showHand();
                    } 
                } );

            JButton j2 = new JButton(p2.getName() + "'s Hand");
            j2.setBounds(frame.getWidth() - 200, 150, 150, 50);
            j2.addActionListener(new ActionListener() { 
                    public void actionPerformed(ActionEvent e) { 
                        new showHand();
                    } 
                } );

            JButton j3 = new JButton(p3.getName() + "'s Hand");
            j3.setBounds(frame.getWidth() - 200, 200, 150, 50);
            j3.addActionListener(new ActionListener() { 
                    public void actionPerformed(ActionEvent e) { 
                         new showHand();
                    } 
                } );

            panel.add(j1);
            panel.add(j2);
            panel.add(j3);
        }
        else{
            JButton j1 = new JButton(p1.getName() + "'s Hand");
            j1.setBounds(frame.getWidth() - 200,100,150,50);
            j1.addActionListener(new ActionListener() { 
                    public void actionPerformed(ActionEvent e) { 
                        new showHand();
                    } 
                } );

            JButton j2 = new JButton(p2.getName() + "'s Hand");
            j2.setBounds(frame.getWidth() - 200, 150, 150, 50);
            j2.addActionListener(new ActionListener() { 
                    public void actionPerformed(ActionEvent e) { 
                        new showHand();
                    } 
                } );

            JButton j3 = new JButton(p3.getName() + "'s Hand");
            j3.setBounds(frame.getWidth() - 200, 200, 150, 50);
            j3.addActionListener(new ActionListener() { 
                    public void actionPerformed(ActionEvent e) { 
                        new showHand();
                    } 
                } );

            JButton j4 = new JButton(p4.getName() + "'s Hand");
            j4.setBounds(frame.getWidth() - 200, 250, 150, 50);
            j4.addActionListener(new ActionListener() { 
                    public void actionPerformed(ActionEvent e) { 
                        new showHand();
                    } 
                } );

            panel.add(j1);
            panel.add(j2);
            panel.add(j3);
            panel.add(j4);
        }
    }

    private static void selectionButtonPressed(){
        Scorecard s = new Scorecard(numPlayers, list);
    }

    public void mousePressed(MouseEvent e){}

    public void mouseEntered(MouseEvent e){}

    public void mouseReleased(MouseEvent e){}

    public void mouseExited(MouseEvent e){}

    public void mouseClicked(MouseEvent e){}

    public static void removeCard(JLabel l){
        int cardWidth = frame.getWidth() / 15;
        int cardHeight = frame.getHeight() / 5;
        if((b.tcDeck.get(b.tcDeck.size() - 1)).getColor().equals("ORANGE")){
            l.setIcon(new ImageIcon(orange.getImage().getScaledInstance(
                        cardWidth, cardHeight, Image.SCALE_SMOOTH)));
            b.discard.add(b.tcDeck.get(b.tcDeck.size() - 1));
            b.tcDeck.remove(b.tcDeck.size() - 1);
        }
        else if((b.tcDeck.get(b.tcDeck.size() - 1)).getColor().equals("RED")){
            l.setIcon(new ImageIcon(red.getImage().getScaledInstance(
                        cardWidth, cardHeight, Image.SCALE_SMOOTH)));
            b.discard.add(b.tcDeck.get(b.tcDeck.size() - 1));
            b.tcDeck.remove(b.tcDeck.size() - 1);
        }
        else if((b.tcDeck.get(b.tcDeck.size() - 1)).getColor().equals("BLACK")){
            l.setIcon(new ImageIcon(black.getImage().getScaledInstance(
                        cardWidth, cardHeight, Image.SCALE_SMOOTH)));
            b.discard.add(b.tcDeck.get(b.tcDeck.size() - 1));
            b.tcDeck.remove(b.tcDeck.size() - 1);
        }
        else if((b.tcDeck.get(b.tcDeck.size() - 1)).getColor().equals("BLUE")){
            l.setIcon(new ImageIcon(blue.getImage().getScaledInstance(
                        cardWidth, cardHeight, Image.SCALE_SMOOTH)));
            b.discard.add(b.tcDeck.get(b.tcDeck.size() - 1));
            b.tcDeck.remove(b.tcDeck.size() - 1);
        }
        else if((b.tcDeck.get(b.tcDeck.size() - 1)).getColor().equals("PINK")){
            l.setIcon(new ImageIcon(pink.getImage().getScaledInstance(
                        cardWidth, cardHeight, Image.SCALE_SMOOTH)));
            b.discard.add(b.tcDeck.get(b.tcDeck.size() - 1));
            b.tcDeck.remove(b.tcDeck.size() - 1);
        }
        else if((b.tcDeck.get(b.tcDeck.size() - 1)).getColor().equals("GREEN")){
            l.setIcon(new ImageIcon(green.getImage().getScaledInstance(
                        cardWidth, cardHeight, Image.SCALE_SMOOTH)));
            b.discard.add(b.tcDeck.get(b.tcDeck.size() - 1));
            b.tcDeck.remove(b.tcDeck.size() - 1);
        }
        else if((b.tcDeck.get(b.tcDeck.size() - 1)).getColor().equals("RAINBOW")){
            l.setIcon(new ImageIcon(rainbow.getImage().getScaledInstance(
                        cardWidth, cardHeight, Image.SCALE_SMOOTH)));
            b.discard.add(b.tcDeck.get(b.tcDeck.size() - 1));
            b.tcDeck.remove(b.tcDeck.size() - 1);
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
