import java.util.*;
/**
 * Write a description of class Board here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Board
{
    private ArrayList<LocationNode> points = new ArrayList<>();
    
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
        LocationNode ws = new LocationNode("Wall Stree", 0, 0, true);
        points.add(ws);
        LocationNode bk = new LocationNode("Brooklyn", 0, 0, true);
        points.add(bk);
    }
}
