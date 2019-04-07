import java.util.*; //imports necessary to implement this class.
import java.awt.Color; 
/**
 * Class designed to construct the board in its entirety. This includes the
 * locations, paths, card deck(s), and discarded card deck(s)
 * @author Ryan Holland, Julia Krasinski, Briella Sala, Matt Harrison,          
 * & Michael Lostritto
 * @version (04.07.2019)
 */
public class Board
{
    //list of points that exist on the board
    private ArrayList<LocationNode> points = new ArrayList<>();
    //list of cards which emulates a card deck 
    public static ArrayList<Card> deck = new ArrayList<>(); 
    //list of cards that have been used
    public static ArrayList<Card> discard = new ArrayList<>();
    /**
     * Empty Constructor which constructs the board with all locations, and 
     * given paths to each location. The deck is also set up with the 6 
     * transportation cards with their respective colors using the initDeck
     * method.
     */
    public Board(){
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

        cp.addPath(new Path(cp, lc, "ORANGE", 0, 2));
        cp.addPath(new Path(cp, un, "PINK", 0, 3));
        cp.addPath(new Path(cp, ts, "RED", 0, 2));
        cp.addPath(new Path(cp, ts, "BLACK", 0, 2));

        lc.addPath(new Path(lc, cp, "ORANGE", 0, 2));
        lc.addPath(new Path(lc, mw, "RED", 0, 2));
        lc.addPath(new Path(lc, ts, "GREEN", 0, 2));
        lc.addPath(new Path(lc, ts, "BLUE", 0, 2));

        ts.addPath(new Path(ts, cp, "RED", 0, 2));
        ts.addPath(new Path(ts, cp, "BLACK", 0, 2));
        ts.addPath(new Path(ts, lc, "BLUE", 0, 2));
        ts.addPath(new Path(ts, lc, "GREEN", 0, 2));
        ts.addPath(new Path(ts, mw, "GRAY", 0, 1));
        ts.addPath(new Path(ts, un, "GRAY", 0, 2));
        ts.addPath(new Path(ts, esb, "PINK", 0, 1));
        ts.addPath(new Path(ts, esb, "ORANGE", 0, 1));

        mw.addPath(new Path(mw, lc, "RED", 0, 2));
        mw.addPath(new Path(mw, esb, "GREEN", 0, 2));
        mw.addPath(new Path(mw, ch, "BLUE", 0, 2));
        mw.addPath(new Path(mw, ts, "GRAY", 0, 1));

        un.addPath(new Path(un, cp, "PINK", 0, 3));
        un.addPath(new Path(un, ts, "GRAY", 0, 2));
        un.addPath(new Path(un, esb, "BLACK", 0, 2));
        un.addPath(new Path(un, gp, "GREEN", 0, 3));

        esb.addPath(new Path(esb, ts, "PINK", 0, 1));
        esb.addPath(new Path(esb, ts, "ORANGE", 0, 1));
        esb.addPath(new Path(esb, un, "BLACK", 0, 2));
        esb.addPath(new Path(esb, gp, "BLUE", 0, 1));
        esb.addPath(new Path(esb, gp, "RED", 0, 1));
        esb.addPath(new Path(esb, ch, "GRAY", 0, 2));
        esb.addPath(new Path(esb, ch, "GRAY", 0, 2));
        esb.addPath(new Path(esb, mw, "GREEN", 0, 2));

        ch.addPath(new Path(ch, mw, "BLUE", 0, 2));
        ch.addPath(new Path(ch, so, "PINK", 0, 4));
        ch.addPath(new Path(ch, gv, "RED", 0, 3));
        ch.addPath(new Path(ch, gv, "GREEN", 0, 3));
        ch.addPath(new Path(ch, gp, "ORANGE", 0, 2));
        ch.addPath(new Path(ch, esb, "GRAY", 0, 2));
        ch.addPath(new Path(ch, esb, "GRAY", 0, 2));

        gp.addPath(new Path(gp, un, "GREEN", 0, 3));
        gp.addPath(new Path(gp, ev, "GRAY", 0, 2));
        gp.addPath(new Path(gp, gv, "PINK", 0, 2));
        gp.addPath(new Path(gp, gv, "BLACK", 0, 2));
        gp.addPath(new Path(gp, esb, "BLUE", 0, 1));
        gp.addPath(new Path(gp, esb, "RED", 0, 1));
        gp.addPath(new Path(gp, ch, "ORANGE", 0, 2));

        gv.addPath(new Path(gv, ev, "BLUE", 0, 2));
        gv.addPath(new Path(gv, so, "ORANGE", 0, 2));
        gv.addPath(new Path(gv, les, "GRAY", 0, 2));
        gv.addPath(new Path(gv, ct, "GRAY", 0, 2));
        gv.addPath(new Path(gv, ct, "GRAY", 0, 2));
        gv.addPath(new Path(gv, gp, "PINK", 0, 2));
        gv.addPath(new Path(gv, gp, "BLACK", 0, 2));
        gv.addPath(new Path(gv, ch, "RED", 0, 3));
        gv.addPath(new Path(gv, ch, "GREEN", 0, 3));

        ev.addPath(new Path(ev, gp, "GRAY", 0, 2));
        ev.addPath(new Path(ev, gv, "BLUE", 0, 2));
        ev.addPath(new Path(ev, les, "BLACK", 0, 1));

        so.addPath(new Path(so, ch, "PINK", 0, 4));
        so.addPath(new Path(so, gv, "ORANGE", 0, 2));
        so.addPath(new Path(so, ws, "GRAY", 0, 2));

        ct.addPath(new Path(ct, gv, "GRAY", 0, 2));
        ct.addPath(new Path(ct, gv, "GRAY", 0, 2));
        ct.addPath(new Path(ct, les, "BLUE", 0, 1));
        ct.addPath(new Path(ct, bk, "ORANGE", 0, 3));
        ct.addPath(new Path(ct, bk, "ORANGE", 0, 3));
        ct.addPath(new Path(ct, ws, "PINK", 0, 1));
        ct.addPath(new Path(ct, ws, "GREEN", 0, 1));

        les.addPath(new Path(les, ev, "BLACK", 0, 1));
        les.addPath(new Path(les, ct, "BLUE", 0,1));
        les.addPath(new Path(les, gv, "GRAY", 0, 2));
        les.addPath(new Path(les, bk, "GRAY", 0, 3));

        ws.addPath(new Path(ws, ct, "GREEN", 0, 1));
        ws.addPath(new Path(ws, ct, "PINK", 0, 1));
        ws.addPath(new Path(ws, so, "GRAY", 0, 2));
        ws.addPath(new Path(ws, bk, "BLUE", 0, 3));
        ws.addPath(new Path(ws, bk, "BLACK", 0, 3));

        bk.addPath(new Path(bk, ws, "BLUE", 0, 3));
        bk.addPath(new Path(bk, ws, "BLACK", 0, 3));
        bk.addPath(new Path(bk, ct, "ORANGE", 0, 3));
        bk.addPath(new Path(bk, ct, "RED", 0, 3));
        bk.addPath(new Path(bk, les, "GRAY", 0, 3));

        initDeck();
    }

    /**
     * Method which creates the deck of transportation cards by adding them to 
     * the deck arrayList. The deck is then shuffled to ensure random placement
     * of all cards (including rainbow)
     */
    public void initDeck(){
        for (int i = 0; i < 6; i++){
            TransportationCard a = new TransportationCard("BLUE");
            TransportationCard b = new TransportationCard("BLACK");
            TransportationCard c = new TransportationCard("RED");
            TransportationCard d = new TransportationCard("ORANGE");
            TransportationCard e = new TransportationCard("PINK");
            TransportationCard f = new TransportationCard("GREEN");
            deck.add(a);
            deck.add(b);
            deck.add(c);
            deck.add(d);
            deck.add(e);
            deck.add(f);
        }

        for (int i = 0; i < 8; i++){
            TransportationCard c = new TransportationCard("RAINBOW");
            deck.add(c);
        }

        Collections.shuffle(deck);
    }

    /**
     * Main program
     * @param args command line arguments (not used)
     */
    public static void main(String[] args){
        Board b = new Board();
        for (LocationNode n : b.points){
            n.printPaths();
            System.out.println();
        }
    }
}
