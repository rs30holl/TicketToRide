import java.util.*;
/**
 * Write a description of class Board here.
 *
 * @author Ryan Holland, Julia Krasinski, Briella Sala,
 * Matt Harrison, Michael Lostritto
 * @version (a version number or a date)
 */
public class Board
{
    protected static ArrayList<LocationNode> points = new ArrayList<>();
    static ArrayList<Card> tcDeck = new ArrayList<>();
    static ArrayList<DestinationTicket> dtDeck = new ArrayList<>();
    static ArrayList<Card> discard = new ArrayList<>();
    
    /** Constructor for objects of class Board
     * 
     * This method adds all the location nodes to the board and creates
     * the paths between those location nodes.  It also initializes the
     * destination tickets, and shuffles the deck
     * 
     */
    public Board(){
        //Creates location nodes
        LocationNode cp = new LocationNode("Central Park", 0, 0, true);
        points.add(cp);
        LocationNode un = new LocationNode("United Nations", 0, 0, true);
        points.add(un);
        LocationNode lc = new LocationNode("Lincoln Center", 0, 0, false);
        points.add(lc);
        LocationNode ts = new LocationNode("Times Square", 0, 0, true);
        points.add(ts);
        LocationNode esb = new LocationNode("Empire State Building", 0, 0, true);
        points.add(esb);
        LocationNode mw = new LocationNode("Midtown West", 0, 0, true);
        points.add(mw);
        LocationNode gp = new LocationNode("Gramercy Park", 0, 0, false);
        points.add(gp);
        LocationNode ch = new LocationNode("Chelsea", 0, 0, true);
        points.add(ch);
        LocationNode gv = new LocationNode("Greenwich Village", 0, 0, true);
        points.add(gv);
        LocationNode ev = new LocationNode("East Village", 0, 0, false);
        points.add(ev);
        LocationNode so = new LocationNode("Soho", 0, 0, false);
        points.add(so);
        LocationNode ct = new LocationNode("Chinatown", 0, 0, true);
        points.add(ct);
        LocationNode les = new LocationNode("Lower East Side", 0, 0, false);
        points.add(les);
        LocationNode ws = new LocationNode("Wall Street", 0, 0, true);
        points.add(ws);
        LocationNode bk = new LocationNode("Brooklyn", 0, 0, true);
        points.add(bk);

        //connects the location nodes with paths as they are on the game board
        cp.addPath(new Path(cp, lc, "ORANGE", 0, 2));
        cp.addPath(new Path(cp, un, "PINK", 0, 3));
        cp.addPath(new Path(cp, ts, "RED", 0, 2));
        cp.addPath(new Path(cp, ts, "BLACK", 0, 2));

        //lc.addPath(new Path(lc, cp, "ORANGE", 0, 2));
        lc.addPath(new Path(lc, mw, "RED", 0, 2));
        lc.addPath(new Path(lc, ts, "GREEN", 0, 2));
        lc.addPath(new Path(lc, ts, "BLUE", 0, 2));

        //ts.addPath(new Path(ts, cp, "RED", 0, 2));
        //ts.addPath(new Path(ts, cp, "BLACK", 0, 2));
        //ts.addPath(new Path(ts, lc, "BLUE", 0, 2));
        //ts.addPath(new Path(ts, lc, "GREEN", 0, 2));
        ts.addPath(new Path(ts, mw, "GRAY", 0, 1));
        ts.addPath(new Path(ts, un, "GRAY", 0, 2));
        ts.addPath(new Path(ts, esb, "PINK", 0, 1));
        ts.addPath(new Path(ts, esb, "ORANGE", 0, 1));

       // mw.addPath(new Path(mw, lc, "RED", 0, 2));
        mw.addPath(new Path(mw, esb, "GREEN", 0, 2));
        mw.addPath(new Path(mw, ch, "BLUE", 0, 2));
        //mw.addPath(new Path(mw, ts, "GRAY", 0, 1));
        
        //un.addPath(new Path(un, cp, "PINK", 0, 3));
        //un.addPath(new Path(un, ts, "GRAY", 0, 2));
        un.addPath(new Path(un, esb, "BLACK", 0, 2));
        un.addPath(new Path(un, gp, "GREEN", 0, 3));
        
        //esb.addPath(new Path(esb, ts, "PINK", 0, 1));
        //esb.addPath(new Path(esb, ts, "ORANGE", 0, 1));
        //esb.addPath(new Path(esb, un, "BLACK", 0, 2));
        esb.addPath(new Path(esb, gp, "BLUE", 0, 1));
        esb.addPath(new Path(esb, gp, "RED", 0, 1));
        esb.addPath(new Path(esb, ch, "GRAY", 0, 2));
        esb.addPath(new Path(esb, ch, "GRAY", 0, 2));
        //esb.addPath(new Path(esb, mw, "GREEN", 0, 2));
        
        //ch.addPath(new Path(ch, mw, "BLUE", 0, 2));
        ch.addPath(new Path(ch, so, "PINK", 0, 4));
        ch.addPath(new Path(ch, gv, "RED", 0, 3));
        ch.addPath(new Path(ch, gv, "GREEN", 0, 3));
        ch.addPath(new Path(ch, gp, "ORANGE", 0, 2));
        //ch.addPath(new Path(ch, esb, "GRAY", 0, 2));
        //ch.addPath(new Path(ch, esb, "GRAY", 0, 2));
        
        //gp.addPath(new Path(gp, un, "GREEN", 0, 3));
        gp.addPath(new Path(gp, ev, "GRAY", 0, 2));
        gp.addPath(new Path(gp, gv, "PINK", 0, 2));
        gp.addPath(new Path(gp, gv, "BLACK", 0, 2));
        //gp.addPath(new Path(gp, esb, "BLUE", 0, 1));
        //gp.addPath(new Path(gp, esb, "RED", 0, 1));
        //gp.addPath(new Path(gp, ch, "ORANGE", 0, 2));
        
        gv.addPath(new Path(gv, ev, "BLUE", 0, 2));
        gv.addPath(new Path(gv, so, "ORANGE", 0, 2));
        gv.addPath(new Path(gv, les, "GRAY", 0, 2));
        gv.addPath(new Path(gv, ct, "GRAY", 0, 2));
        gv.addPath(new Path(gv, ct, "GRAY", 0, 2));
        //gv.addPath(new Path(gv, gp, "PINK", 0, 2));
        //gv.addPath(new Path(gv, gp, "BLACK", 0, 2));
        //gv.addPath(new Path(gv, ch, "RED", 0, 3));
        //gv.addPath(new Path(gv, ch, "GREEN", 0, 3));
        
        //ev.addPath(new Path(ev, gp, "GRAY", 0, 2));
        //ev.addPath(new Path(ev, gv, "BLUE", 0, 2));
        ev.addPath(new Path(ev, les, "BLACK", 0, 1));
        
        //so.addPath(new Path(so, ch, "PINK", 0, 4));
        //so.addPath(new Path(so, gv, "ORANGE", 0, 2));
        so.addPath(new Path(so, ws, "GRAY", 0, 2));
        
        //ct.addPath(new Path(ct, gv, "GRAY", 0, 2));
        //ct.addPath(new Path(ct, gv, "GRAY", 0, 2));
        ct.addPath(new Path(ct, les, "BLUE", 0, 1));
        ct.addPath(new Path(ct, bk, "ORANGE", 0, 3));
        ct.addPath(new Path(ct, bk, "ORANGE", 0, 3));
        ct.addPath(new Path(ct, ws, "PINK", 0, 1));
        ct.addPath(new Path(ct, ws, "GREEN", 0, 1));
        
        //les.addPath(new Path(les, ev, "BLACK", 0, 1));
        //les.addPath(new Path(les, ct, "BLUE", 0,1));
        les.addPath(new Path(les, gv, "GRAY", 0, 2));
        les.addPath(new Path(les, bk, "GRAY", 0, 3));
        
        //ws.addPath(new Path(ws, ct, "GREEN", 0, 1));
        //ws.addPath(new Path(ws, ct, "PINK", 0, 1));
        //ws.addPath(new Path(ws, so, "GRAY", 0, 2));
        ws.addPath(new Path(ws, bk, "BLUE", 0, 3));
        ws.addPath(new Path(ws, bk, "BLACK", 0, 3));
        
        //bk.addPath(new Path(bk, ws, "BLUE", 0, 3));
        //bk.addPath(new Path(bk, ws, "BLACK", 0, 3));
        //bk.addPath(new Path(bk, ct, "ORANGE", 0, 3));
        //bk.addPath(new Path(bk, ct, "RED", 0, 3));
        //bk.addPath(new Path(bk, les, "GRAY", 0, 3));
        
        //Initialize the destination tickets
        dtDeck.add(new DestinationTicket(un,ws,8,"unws"));
        dtDeck.add(new DestinationTicket(lc,gv,6,"lcgv"));
        dtDeck.add(new DestinationTicket(esb,bk,7,"esbbk"));
        dtDeck.add(new DestinationTicket(cp,ct,8,"cpct"));
        dtDeck.add(new DestinationTicket(ts,so,6,"tsso"));
        dtDeck.add(new DestinationTicket(ch,ws,6,"chws"));
        dtDeck.add(new DestinationTicket(cp,ch,5,"cpch"));
        dtDeck.add(new DestinationTicket(ts,ev,4,"tsev"));
        dtDeck.add(new DestinationTicket(ev,so,4,"evso"));
        dtDeck.add(new DestinationTicket(ch,bk,8,"chbk"));
        dtDeck.add(new DestinationTicket(cp,gp,4,"cpgp"));
        dtDeck.add(new DestinationTicket(gp,ct,4,"gpct"));
        dtDeck.add(new DestinationTicket(un,mw,3,"unmw"));
        dtDeck.add(new DestinationTicket(cp,mw,2,"cpmw"));
        dtDeck.add(new DestinationTicket(lc,esb,3,"lcesb"));
        dtDeck.add(new DestinationTicket(les,ws,2,"lesws"));
        dtDeck.add(new DestinationTicket(esb,gv,3,"esbgv"));
        dtDeck.add(new DestinationTicket(ts,bk,8,"tsbk"));
        Collections.shuffle(dtDeck);
        
        initDeck();
    }
    
    /**
     * This class initializes the deck of transportation cards by creating
     * the 6 different colored cards and then adding them to the deck.  It
     * then adds in the wild cards and shuffles the deck
     */
    private void initDeck(){
        for (int i = 0; i < 6; i++){
            TransportationCard a = new TransportationCard("BLUE");
            TransportationCard b = new TransportationCard("BLACK");
            TransportationCard c = new TransportationCard("RED");
            TransportationCard d = new TransportationCard("ORANGE");
            TransportationCard e = new TransportationCard("PINK");
            TransportationCard f = new TransportationCard("GREEN");
            tcDeck.add(a);
            tcDeck.add(b);
            tcDeck.add(c);
            tcDeck.add(d);
            tcDeck.add(e);
            tcDeck.add(f);
        }
        
        for (int i = 0; i < 8; i++){
            TransportationCard c = new TransportationCard("RAINBOW");
            tcDeck.add(c);
        }
        
        Collections.shuffle(tcDeck);
        
        
    }
    
    /**
     * This is a main method that creates a Board object and prints all the
     * paths on that Board
     */
    public static void main(String[] args){
        Board b = new Board();
        for (LocationNode n : b.points){
            n.printPaths();
            System.out.println();
        }
        for (Card c : tcDeck){
            System.out.println(c.getColor());
        }
    }
}
