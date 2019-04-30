import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
/**
 * This class creates individual players for the game.
 *
 * @author Ryan Holland, Julia Krasinski, Briella Sala,
 * Matt Harrison, Michael Lostritto
 * @version 4/28/2019
 */
public class Player
{
    private Hand hand;
    private String name;
    private int age;
    private ArrayList<Path> claimedRoutes = new ArrayList<>();
    private int taxiCount;
    private boolean state;
    private int turnCount = 0;
    private int black = 0;
    private int blue = 0;
    private int red = 0;
    private int green = 0;
    private int orange = 0;
    private int pink = 0;
    private int rainbow = 0;

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
     * Constructor for the objects of Player class
     * 
     * @param n: Name of the Player
     */
    public Player(String n, int x){
        ArrayList<Card> l = new ArrayList<Card>();
        l.add(Board.dtDeck.get(Board.dtDeck.size()-1));
        Board.dtDeck.remove(Board.dtDeck.size()-1);
        l.add(Board.dtDeck.get(Board.dtDeck.size()-1));
        Board.dtDeck.remove(Board.dtDeck.size()-1);
        Object[] l2 = l.toArray();
        
        hand = new Hand(l2);
        name = n;
        age = x;
        taxiCount = 15;

        state = false;

    }

    /**
     * This method sets the name of the Player
     * 
     * @param n: the name of the Player
     */
    public void setName(String n){
        name = n;
    }

    public Hand getHand(){
        return hand;
    }

    public int getTurnCount(){return turnCount;}

    public void setTurnCount(int t){turnCount = t;}

    /**
     * Setter method for state 
     * @param s, boolean state to be set 
     */
    public void setState(boolean s){
        state = s;
    }

    /**
     * Getter method for state 
     * @return state 
     */
    public boolean getState(){return state;}

    /**

     * This method returns the age of the Player
     * 
     * @return age: age of the Player
     */
    public int getAge(){
        return age;
    }

    /**
     * This method finds the name of the Player
     * 
     * @return the name of the Player
     */
    public String getName(){
        return name;
    }

    /**
     * This method returns the taxiCount of the Player
     *
     * @return the taxiCount of the Player
     */
    public int getTaxiCount(){ return taxiCount;}

    /**
     * This method draws cards from the deck and adds them to the Players's hand
     */
    public void drawCard(Card c){
        if (c instanceof TransportationCard){
            hand.addCard(Board.tcDeck.get(0));
            Board.tcDeck.remove(0);
            if (c.getColor().equalsIgnoreCase("blue"))blue++;
            else if (c.getColor().equalsIgnoreCase("black"))black++;
            else if (c.getColor().equalsIgnoreCase("pink"))pink++;
            else if (c.getColor().equalsIgnoreCase("green"))green++;
            else if (c.getColor().equalsIgnoreCase("orange"))orange++;
            else if (c.getColor().equalsIgnoreCase("red"))red++;
            else if (c.getColor().equalsIgnoreCase("rainbow"))rainbow++;
        }
        else {
            hand.addCard(Board.dtDeck.get(0));
            Board.dtDeck.remove(0);
        }
    }

    /**
     * This method allows a Player to claim a route
     * 
     * @param p: a path referring to the route a player wants to claim
     */
    public void claimRoute(Path p){
        int length = p.getLength();
        String color = p.getColor();
        //number of matching cards in hand
        int numCards = 0;
        for (Card c : hand.cards){
            if (c instanceof TransportationCard){
                //checks to see if the color of the path matches the color
                //of the transportation card
                for (int i = 0; i < length; i++){
                    if (c.getColor().equals(color)){

                        numCards++;
                        //adds the card being played to the discard array list
                        Board.discard.add(c);
                        //removes the card from the Player's hand
                        hand.removeCard(c);
                        if (numCards == length){
                            //adds path to claimed routes
                            claimedRoutes.add(p);
                            //removes that path from possible paths for other Players to claim
                            p.getEnd().removePath(p);
                            taxiCount = taxiCount - length;
                            if (getTaxiCount() <= 2){

                            }
                            break;
                        }
                    }
                }
            }
        }
        // if the number of matching cards is greater than or equal to the
        // length of the path than the route can be claimed

    }

    public void startGame(){
        JFrame frame = new JFrame();
        frame.setPreferredSize(new Dimension(500,500));
        JFrame frame2 = new JFrame();
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,500));
        frame2.getContentPane().add(panel);
        int cardWidth = 50;
        int cardHeight = 100;
        int count = 0;

        frame2.pack();
        frame2.setVisible(true);

        DestinationTicket a = Board.dtDeck.get(Board.dtDeck.size() - 1);
        Board.dtDeck.remove(Board.dtDeck.size() - 1);
        DestinationTicket b = Board.dtDeck.get(Board.dtDeck.size() - 1);
        Board.dtDeck.remove(Board.dtDeck.size() - 1);

        // if(a.getName().equals("chbk") || b.getName().equals("chbk") ){
        // if(count == 0){
        // JLabel j = new JLabel();
        // j.setBounds(0,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }
        // if(a.getName().equals("chws") || b.getName().equals("chws") ){
        // if(count == 0){
        // JLabel j = new JLabel();
        // j.setBounds(0,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }
        // if(a.getName().equals("cpsh") || b.getName().equals("cpsh") ){
        // if(count == 0){
        // JLabel j = new JLabel();
        // j.setBounds(0,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }
        // if(a.getName().equals("cpct") || b.getName().equals("cpct") ){
        // if(count == 0){
        // JLabel j1 = new JLabel();
        // j1.setBounds(0,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }
        // if(a.getName().equals("cpgp") || b.getName().equals("cpgp") ){
        // if(count == 0){
        // JLabel j1 = new JLabel();
        // j1.setBounds(0,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }
        // if(a.getName().equals("cpmw") || b.getName().equals("cpmw") ){
        // if(count == 0){
        // JLabel j = new JLabel();
        // j.setBounds(0,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }
        // if(a.getName().equals("esbbk") || b.getName().equals("esbbk") ){
        // if(count == 0){
        // JLabel j = new JLabel();
        // j.setBounds(0,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }
        // if(a.getName().equals("esbgv") || b.getName().equals("esbgv") ){
        // if(count == 0){
        // JLabel j = new JLabel();
        // j.setBounds(0,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }
        // if(a.getName().equals("evsh") || b.getName().equals("evsh") ){
        // if(count == 0){
        // JLabel j = new JLabel();
        // j.setBounds(0,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }
        // if(a.getName().equals("gpct") || b.getName().equals("gpct") ){
        // if(count == 0){
        // JLabel j = new JLabel();
        // j.setBounds(0,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }
        // if(a.getName().equals("lcesb") || b.getName().equals("lcesb") ){
        // if(count == 0){
        // JLabel j = new JLabel();
        // j.setBounds(0,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }
        // if(a.getName().equals("lcgv") || b.getName().equals("lcgb") ){
        // if(count == 0){
        // JLabel j = new JLabel();
        // j.setBounds(0,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }
        // if(a.getName().equals("lesws") || b.getName().equals("lesws") ){
        // if(count == 0){
        // JLabel j = new JLabel();
        // j.setBounds(0,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // else if(count == 1){
        // JLabel j = new JLabel();
        // j.setBounds(100,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // }
        // if(a.getName().equals("mwun") || b.getName().equals("mwun") ){
        // if(count == 0){
        // JLabel j = new JLabel();
        // j.setBounds(0,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }
        // if(a.getName().equals("tsbk") || b.getName().equals("tsbk") ){
        // if(count == 0){
        // JLabel j = new JLabel();
        // j.setBounds(0,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }
        // if(a.getName().equals("tsev") || b.getName().equals("tsev") ){
        // if(count == 0){
        // JLabel j = new JLabel();
        // j.setBounds(0,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }
        // if(a.getName().equals("tssh") || b.getName().equals("tssh") ){
        // if(count == 0){
        // JLabel j = new JLabel();
        // j.setBounds(0,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }
        // if(a.getName().equals("unws") || b.getName().equals("unws") ){
        // if(count == 0){
        // JLabel j = new JLabel();
        // j.setBounds(0,0, 100,200);
        // j.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j);
        // }
        // else if(count == 1){
        // JLabel j1 = new JLabel();
        // j1.setBounds(100,0, 100,200);
        // j1.setIcon(new ImageIcon(chbk.getImage().getScaledInstance(
        // cardWidth, cardHeight, Image.SCALE_SMOOTH)));
        // count++;
        // panel.add(j1);
        // }
        // }

        // Object[] options = {"First Card", "Second Card", "Both"};
        // int x = JOptionPane.showOptionDialog(frame2,"Destination Card Choice",
        // "Number of Players",JOptionPane.YES_NO_CANCEL_OPTION,
        // JOptionPane.QUESTION_MESSAGE,null,options,options[2]);

        // if(x == JOptionPane.YES_OPTION){//first card
        // drawCard(a);
        // }
        // else if(x == JOptionPane.NO_OPTION){//second card
        // drawCard(b);
        // }
        //both cards
        drawCard(a);
        drawCard(b);

    }
    /**
     * Method which allows player to make their turn 
     *
     * @param n marker which represents what type of move player wants to do 
     * @param p path chosen by player
     * @param c card chosen by player
     */
    public void turn(int n, Path p, Card c){

        if (n == 0){//Pick up two Transportation Cards
            drawCard(Board.tcDeck.remove(0));
            drawCard(Board.tcDeck.remove(0));
        }
        else if (n == 1){//Pick up a Destination Ticket
            drawCard(Board.dtDeck.remove(0));
        }
        else if (n == 2){//Claim a route
            if (p.getColor().equalsIgnoreCase("blue") && blue >= p.getLength())claimRoute(p);
            else if (p.getColor().equalsIgnoreCase("black") && black >= p.getLength())claimRoute(p);
            else if (p.getColor().equalsIgnoreCase("pink") && pink >= p.getLength())claimRoute(p);
            else if (p.getColor().equalsIgnoreCase("green") && green >= p.getLength())claimRoute(p);
            else if (p.getColor().equalsIgnoreCase("red") && red >= p.getLength())claimRoute(p);
            else if (p.getColor().equalsIgnoreCase("orange") && orange >= p.getLength())claimRoute(p);
            else if (p.getColor().equalsIgnoreCase("rainbow") && rainbow >= p.getLength())claimRoute(p);
        }
        else {//Pick up one of the face up cards
            if(c.getColor().equals("RAINBOW")){
                drawCard(c);
            }
            else{
                drawCard(c);
                drawCard(c);
            }
        }
    }
}
