import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.TreeMap;

public class PlanningCollection {
    private ArrayList <Reservation> chReservlist;
    private TreeSet <Reservation> chReservset;
    private TreeMap<Integer,TreeSet<Reservation>> chReservmap;

    public PlanningCollection () {
        chReservlist = new ArrayList<Reservation>();
        chReservset = new TreeSet<Reservation>();
        chReservmap = new TreeMap<Integer,TreeSet<Reservation>>();
    }

    public String toString() {
        return chReservlist.toString() + "[" + chReservlist.size() + "]" + "\n" + chReservset.toString() + "[" + chReservset.size() + "]";
    }

    public void ajout(Reservation parReserv) {
        chReservlist.add(parReserv);
        chReservset.add(parReserv);

        int nMsM = parReserv.getDate().getChJourSem();
        if (chReservmap.containsKey(nMsM)) {
            TreeSet<Reservation> ts = chReservmap.get(nMsM);
            ts.add(parReserv);
        }
        else {
            TreeSet<Reservation> ts =new TreeSet<>();
            ts.add(parReserv);
            chReservmap.put(nMsM, ts);
        }
    }

    public TreeSet <Reservation> getReservations (DateCalendrier parDate) {
        TreeSet <Reservation> nouveau = new TreeSet<Reservation>();
        Iterator <Reservation> it = chReservset.iterator();
        while (it.hasNext()) {
            Reservation r = it.next();
            if (parDate.compareTo(r.getDate()) == 0){
                nouveau.add(r);
            }
        }
        return nouveau;

    }
    public TreeSet <Reservation> getReservations (String parString) {
        TreeSet <Reservation> nouveau = new TreeSet<Reservation>();
        Iterator <Reservation> it = chReservset.iterator();
        while (it.hasNext()) {
            Reservation r = it.next();
            if (r.gettitre() == parString){
                nouveau.add(r);
            }
        }
        return nouveau;

    }

}

