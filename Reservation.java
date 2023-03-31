import java.util.Arrays ;


public class Reservation implements  Comparable <Reservation>{
    private DateCalendrier chdate;
    private PlageHoraire chPH;
    private String chtitre;

    public Reservation(DateCalendrier pardate, PlageHoraire parPH, String partitre) {
        chdate = pardate;
        chPH = parPH;
        chtitre = partitre;
    }

    public String toString() {
        return chtitre + ", " + chdate + ", " + chPH + ", " + chPH.duree();
    }

    public int compareTo(Reservation parReserv) {
        if (this.chdate.compareTo(parReserv.chdate) != 0) {
            return this.chdate.compareTo(parReserv.chdate);
        }
        return this.chPH.compareTo(parReserv.chPH);
    }
    public boolean estValide() {
    return chPH.duree() >= 60;
    }

    public DateCalendrier getDate() {
        return chdate;
    }

    public String gettitre() {
        return chtitre;
    }



}