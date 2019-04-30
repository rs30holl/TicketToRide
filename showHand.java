import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 * Write a description of class showHand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class showHand
{
    private static Player p1;
    private static final ImageIcon chbk = new ImageIcon(
            ".\\ttr cards\\ch-bk.png");
    private static final ImageIcon chws = new ImageIcon(
            ".\\ttr cards\\ch-ws.png");
    private static final ImageIcon cpsh = new ImageIcon(
            ".\\ttr cards\\cp-sh.png");
    private static final ImageIcon cpct = new ImageIcon(
            ".\\ttr cards\\cp-ct.png");
    private static final ImageIcon cpgp = new ImageIcon(
            ".\\ttr cards\\cp-gp.png");
    private static final ImageIcon cpmw = new ImageIcon(
            ".\\ttr cards\\cp-mw.png");
    private static final ImageIcon esbbk = new ImageIcon(
            ".\\ttr cards\\esb-bk.png");
    private static final ImageIcon esbgv = new ImageIcon(
            ".\\ttr cards\\esb-gv.png");
    private static final ImageIcon evsh = new ImageIcon(
            ".\\ttr cards\\ev-sh.png");
    private static final ImageIcon gpct = new ImageIcon(
            ".\\ttr cards\\gp-ct.png");
    private static final ImageIcon lcesb = new ImageIcon(
            ".\\ttr cards\\lc-esb.png");
    private static final ImageIcon lcgv = new ImageIcon(
            ".\\ttr cards\\lc-gv.png");
    private static final ImageIcon lesws = new ImageIcon(
            ".\\ttr cards\\les-ws.png");
    private static final ImageIcon mwun = new ImageIcon(
            ".\\ttr cards\\mw-un.png");
    private static final ImageIcon tsbk = new ImageIcon(
            ".\\ttr cards\\ts-bk.png");
    private static final ImageIcon tsev = new ImageIcon(
            ".\\ttr cards\\ts-ev.png");
    private static final ImageIcon tssh = new ImageIcon(
            ".\\ttr cards\\ts-sh.png");
    private static final ImageIcon unws = new ImageIcon(
            ".\\ttr cards\\un-ws.png");

    /**
     * Constructor for objects of class showHand
     */
    public showHand()
    {
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setPreferredSize(new Dimension(1000,1000));
        int cardWidth = f.getWidth() / 15;
        int cardHeight = f.getHeight() / 5;
        for(Card c : p1.getHand().cards){
            if(c.getColor().equals("RED")){
                JLabel red = new JLabel(new ImageIcon(
                            ".\\fwdpieces1\\verticalRed.jpg"));
                p.add(red);
            }
            else if(c.getColor().equals("PINK")){
                JLabel pink = new JLabel(new ImageIcon(
                            ".\\fwdpieces1\\verticalPink.jpg"));
                p.add(pink);
            }
            else if(c.getColor().equals("BLACK")){
                JLabel black = new JLabel(new ImageIcon(
                            ".\\ttr cards\\blackcard.png"));
                p.add(black);
            }
            else if(c.getColor().equals("ORANGE")){
                JLabel orange = new JLabel(new ImageIcon(
                            ".\\ttr cards\\orangecard.png"));
                p.add(orange);
            }
            else if(c.getColor().equals("BLUE")){
                JLabel blue = new JLabel(new ImageIcon(
                            ".\\ttr cards\\bluecard.png"));
                p.add(blue);
            }
            else if(c.getColor().equals("RAINBOW")){
                JLabel rainbow = new JLabel(new ImageIcon(
                            ".\\ttr cards\\rainbowcard.png"));
                p.add(rainbow);
            }

            if(c instanceof DestinationTicket){
                if(((DestinationTicket)c).getName().equals("chbk")){

                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }
                if(((DestinationTicket)c).getName().equals("chws")){

                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }
                if(((DestinationTicket)c).getName().equals("cpsh")){

                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }
                if(((DestinationTicket)c).getName().equals("cpct")){

                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }
                if(((DestinationTicket)c).getName().equals("cpgp")){

                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }
                if(((DestinationTicket)c).getName().equals("cpmw")){

                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }
                if(((DestinationTicket)c).getName().equals("esbbk")){

                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }
                if(((DestinationTicket)c).getName().equals("esbgv")){
                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }
                if(((DestinationTicket)c).getName().equals("evsh")){
                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }
                if(((DestinationTicket)c).getName().equals("gpct")){

                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }

                if(((DestinationTicket)c).getName().equals("lcesb")){
                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);
                }

                if(((DestinationTicket)c).getName().equals("lcgv")){
                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }
                if(((DestinationTicket)c).getName().equals("lesws")){
                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }
                if(((DestinationTicket)c).getName().equals("mwun")){
                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }
                if(((DestinationTicket)c).getName().equals("tsbk")){

                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }
                if(((DestinationTicket)c).getName().equals("tsev")){

                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }
                if(((DestinationTicket)c).getName().equals("tssh")){

                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }
                if(((DestinationTicket)c).getName().equals("unws")){
                    JLabel j = new JLabel();
                    j.setBounds(0,0, 100,200);
                    j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
                                cardWidth, cardHeight, Image.SCALE_SMOOTH)));
                    p.add(j);

                }

            }
        }
        f.getContentPane().add(p);
        f.pack();
        f.setVisible(true);
    }
}

