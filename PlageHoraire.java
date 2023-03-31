public class PlageHoraire implements  Comparable <PlageHoraire>{
    private Horaire chDebut,chFin;
    final static int DUREE = 60;

    public PlageHoraire(Horaire parDebut, Horaire parFin) {
        chDebut = parDebut;
        chFin = parFin;
    }

    public String toString() {
        return chDebut.toString() + " - " + chFin.toString();
    }

    public int duree() {
        return chFin.toMinutes() - chDebut.toMinutes();
    }

    public boolean estValide() {
        return duree() > 60;
    }


    public int compareTo(PlageHoraire parPH) {
        if (chFin.toMinutes() < parPH.chDebut.toMinutes()) {
            return -1;
        }
        if (chDebut.toMinutes() > parPH.chFin.toMinutes()) {
            return 1;
        }
        return 0;
    }


}
