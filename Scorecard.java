import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 * Write a description of class Scorecard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scorecard
{
    // instance variables - replace the example below with your own
    private int x;private static Player p1;
    private static Player p2;
    private static Player p3;
    private static Player p4;
    private boolean gameOver = false;
    /**
     * Constructor for objects of class Scorecard
     */
    public Scorecard(int numPlayers, ArrayList<Player> players)
    {
        //JDialog d = new JDialog(frame , "Score Board", true); 
        JFrame f = new JFrame();
        JPanel p = new JPanel();

        if (players.size() == 2){
            p1 = players.get(0);
            p2 = players.get(1);
        }
        else if(players.size() == 3){
            p1 = players.get(0);
            p2 = players.get(1);
            p3 = players.get(2);
        }
        else{
            p1 = players.get(0);
            p2 = players.get(1);
            p3 = players.get(2);
            p4 = players.get(3);
        }

        JLabel scoreCard = new JLabel(new ImageIcon(".\\fwdpieces1\\scoreCard.jpg"));
        p.add(scoreCard);
        if(numPlayers == 2){
            JLabel name1 = new JLabel(p1.getName());
            name1.setBounds(300,50,100,50);
            name1.setFont(name1.getFont().deriveFont(24.0f));
            scoreCard.add(name1);
            JLabel name2 = new JLabel(p2.getName());
            name2.setBounds(500,50,100,50);
            name2.setFont(name2.getFont().deriveFont(24.0f));
            scoreCard.add(name2);
            
            JLabel taxi1 = new JLabel(Integer.toString(p1.getTaxiCount()));
            taxi1.setBounds(300,160,100,50);
            taxi1.setFont(taxi1.getFont().deriveFont(24.0f));
            scoreCard.add(taxi1);
            JLabel taxi2 = new JLabel(Integer.toString(p2.getTaxiCount()));
            taxi2.setBounds(500,160,100,50);
            taxi2.setFont(taxi2.getFont().deriveFont(24.0f));
            scoreCard.add(taxi2);
            
            if(gameOver == true){

                DestinationTicket c1 = p1.getHand().getDestinationTicket();
                JLabel score1 = new JLabel(Integer.toString(c1.getScore()));
                scoreCard.add(score1);
                DestinationTicket c2 = p2.getHand().getDestinationTicket();
                JLabel score2 = new JLabel(Integer.toString(c2.getScore()));
                scoreCard.add(score2);
            }
            //for(Path w : p1.claimedRoutes){
                if(true){
                }
                f.add(p);
            //}
        }
            else if(numPlayers == 3){
                JLabel name1 = new JLabel(p1.getName());
                name1.setBounds(300,50,100,50);
                name1.setFont(name1.getFont().deriveFont(24.0f));
                scoreCard.add(name1);
                JLabel name2 = new JLabel(p2.getName());
                name2.setBounds(500,50,100,50);
                name2.setFont(name2.getFont().deriveFont(24.0f));
                scoreCard.add(name2);
                JLabel name3 = new JLabel(p3.getName());
                name3.setBounds(700,50,100,50);
                name3.setFont(name3.getFont().deriveFont(24.0f));
                scoreCard.add(name3);
                
                JLabel taxi1 = new JLabel(Integer.toString(p1.getTaxiCount()));
                taxi1.setBounds(300,160,100,50);
                taxi1.setFont(taxi1.getFont().deriveFont(24.0f));
                scoreCard.add(taxi1);
                JLabel taxi2 = new JLabel(Integer.toString(p2.getTaxiCount()));
                taxi2.setBounds(500,160,100,50);
                taxi2.setFont(taxi2.getFont().deriveFont(24.0f));
                scoreCard.add(taxi2);
                JLabel taxi3 = new JLabel(Integer.toString(p3.getTaxiCount()));
                taxi3.setBounds(700,160,100,50);
                taxi3.setFont(taxi3.getFont().deriveFont(24.0f));
                scoreCard.add(taxi3);
                
                if(gameOver == true){
                    DestinationTicket c1 = p1.getHand().getDestinationTicket();
                    JLabel score1 = new JLabel(Integer.toString(c1.getScore()));
                    scoreCard.add(score1);
                    DestinationTicket c2 = p2.getHand().getDestinationTicket();
                    JLabel score2 = new JLabel(Integer.toString(c2.getScore()));
                    scoreCard.add(score2);
                    DestinationTicket c3 = p3.getHand().getDestinationTicket();
                    JLabel score3 = new JLabel(Integer.toString(c3.getScore()));
                    scoreCard.add(score3);
                }
                f.add(p);
            }
            else if(numPlayers == 4){
                JLabel name1 = new JLabel(p1.getName());
                name1.setBounds(300,50,100,50);
                name1.setFont(name1.getFont().deriveFont(24.0f));
                scoreCard.add(name1);
                JLabel name2 = new JLabel(p2.getName());
                name2.setBounds(500,50,100,50);
                name2.setFont(name2.getFont().deriveFont(24.0f));
                scoreCard.add(name2);
                JLabel name3 = new JLabel(p3.getName());
                name3.setBounds(700,50,100,50);
                name3.setFont(name3.getFont().deriveFont(24.0f));
                scoreCard.add(name3);
                JLabel name4 = new JLabel(p4.getName());
                name4.setBounds(900,50,100,50);
                name4.setFont(name4.getFont().deriveFont(24.0f));
                scoreCard.add(name4);
                
                JLabel taxi1 = new JLabel(Integer.toString(p1.getTaxiCount()));
                taxi1.setBounds(300,160,100,50);
                taxi1.setFont(taxi1.getFont().deriveFont(24.0f));
                scoreCard.add(taxi1);  
                JLabel taxi2 = new JLabel(Integer.toString(p2.getTaxiCount()));
                taxi2.setBounds(500,160,100,50);
                taxi2.setFont(taxi2.getFont().deriveFont(24.0f));
                scoreCard.add(taxi2);         
                JLabel taxi3 = new JLabel(Integer.toString(p3.getTaxiCount()));
                taxi3.setBounds(700,160,100,50);
                taxi3.setFont(taxi3.getFont().deriveFont(24.0f));
                scoreCard.add(taxi3);                
                JLabel taxi4 = new JLabel(Integer.toString(p4.getTaxiCount()));
                taxi4.setBounds(900,160,100,50);
                taxi4.setFont(taxi4.getFont().deriveFont(24.0f));
                scoreCard.add(taxi4);
                if(gameOver == true){
                    DestinationTicket c1 = p1.getHand().getDestinationTicket();
                    JLabel score1 = new JLabel(Integer.toString(c1.getScore()));
                    scoreCard.add(score1);
                    DestinationTicket c2 = p2.getHand().getDestinationTicket();
                    JLabel score2 = new JLabel(Integer.toString(c2.getScore()));
                    scoreCard.add(score2);
                    DestinationTicket c3 = p3.getHand().getDestinationTicket();
                    JLabel score3 = new JLabel(Integer.toString(c3.getScore()));
                    scoreCard.add(score3);
                    DestinationTicket c4 = p4.getHand().getDestinationTicket();
                    JLabel score4 = new JLabel(Integer.toString(c4.getScore()));
                    scoreCard.add(score4);
                }
                f.add(p);
            }

            // set the size of the window
            f.setSize(1100,650);
            f.setVisible(true);
            //f.add(new JLabel("Scores"));
            //frame.add(f);
        }

    }

