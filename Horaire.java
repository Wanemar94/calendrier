public class Horaire {
    private int chHeure;
    private int chQuartHeure;

    public Horaire(int parHeure, int parQuartHeure) {
        chHeure = parHeure;
        chQuartHeure = parQuartHeure;
    }

    public int toMinutes() {
        return chHeure*60 + chQuartHeure;
    }

    public int getHeure() {
        return chHeure;
    }

    public int getQuartHeure() {
        return chQuartHeure;
    }

    public void setHeure(int parHeure) {
        chHeure = parHeure;
    }

    public void setQuartHeure(int parQuartHeure) {
        chQuartHeure = parQuartHeure;
    }

    public String toString() {
        return chHeure + "h" + chQuartHeure;
    }

    public int compareTo(Horaire parHoraire) {
        if (parHoraire.toMinutes() < this.toMinutes() ) {
            return -1;
        }
        else if ((parHoraire.toMinutes() > this.toMinutes() )) {
            return 1;
        }
        return 0;


    }
}
