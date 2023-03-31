public class Planning {
    private Reservation [] chTabReserv;
    private int SIZE ;
    public Planning(int parSize) {
        SIZE = parSize;
        chTabReserv = new Reservation[SIZE];

    }
    public String toString() {
        String str = " ";
        for (int i = 0; i < SIZE && chTabReserv[i] != null; i++) {
            str += chTabReserv[i].toString() + "\n";
        }
        return str;
    }

    public void ajout(Reservation parReserv) throws ExceptionPlanning{
        if (parReserv.estValide() == false) {
            throw new ExceptionPlanning(0);
        }
        for (int i = 0; i<SIZE; i++) {
            if (chTabReserv[i] != null) {
                if (chTabReserv[i].compareTo(parReserv) == 0) {
                    throw new ExceptionPlanning(2);
                }
            }
            else {
                chTabReserv[i] = parReserv;
                return;
            }
        }
        throw new ExceptionPlanning(1);
    }
    public Reservation getReservation(Date parDate) {
        for (int i = 0; i< chTabReserv.length && chTabReserv[i] != null; i++){
            if (parDate.compareTo(chTabReserv[i].getDate()) == 0) {
                return chTabReserv[i];
                }
            }
        return null;
    }

    public Reservation [] getReservations(Date parDate) {
        Reservation [] tab = new Reservation[SIZE];
        int var = 0;
        for (int i = 0; i< chTabReserv.length && chTabReserv[i] != null; i++){
            if (parDate.compareTo(chTabReserv[i].getDate()) == 0) {
                tab[var] = chTabReserv[i];
                var ++;
            }
        }
        return tab;
    }

    public int plusAncienneReservation (int parDebut, int parFin) {
        Reservation plusAncien = chTabReserv[parDebut];
        int i_plusAncien = parDebut;
        for (int i = parDebut; i <= parFin && chTabReserv[i] != null; i++) {
            if (plusAncien.compareTo(chTabReserv[i]) == 1) {
                plusAncien = chTabReserv[i];
                i_plusAncien = i;
            }
        }
        return i_plusAncien;
    }
    public void algoTri() {
        int TAILLE_TAB = chTabReserv.length;
        for (int i = 0;i <= TAILLE_TAB && chTabReserv[i] != null; i++){
            int plusAncien = plusAncienneReservation(i,TAILLE_TAB);
            chTabReserv[i] = chTabReserv[plusAncien];
        }
    }

}
