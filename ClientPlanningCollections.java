import java.util.ArrayList;
import java.util.TreeSet;

public class ClientPlanningCollections {
    public static void main(String[] args) {
        ArrayList<Reservation> al = new ArrayList<>();
        TreeSet<Reservation> ts = new TreeSet<>();
        DateCalendrier date = new DateCalendrier(2,7,2004);
        Horaire h1 = new Horaire(10,15);
        Horaire h2 = new Horaire(12,00);
        PlageHoraire PH = new PlageHoraire(h1,h2);
        String titre = "Sport";
        Reservation reservation = new Reservation(date,PH,titre);
        System.out.println(reservation.toString());
        PlageHoraire PH1 = new PlageHoraire(new Horaire(16,00),new Horaire(17,00));
        PlageHoraire PH2 = new PlageHoraire(new Horaire(11,00),new Horaire(13,45));
        Reservation reservation1 = new Reservation(new DateCalendrier(1,7,2004),PH1,titre);
        Reservation reservation2 = new Reservation(new DateCalendrier(2,7,2004),PH2,titre);
        DateCalendrier d1 = new DateCalendrier(31,12,2022);
        System.out.println(d1.getChNmSem());
    }
}
