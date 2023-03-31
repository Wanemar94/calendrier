import java.util.Scanner;

public class Date implements ConstantesCalendrier{
    protected int chJour;
    protected int chMois;
    protected int chAnnee;

    public String toString () {
        return  chJour + " " + MOIS[chMois - 1] + " " + chAnnee;
    }
    public Date(int parjour, int parmois, int parannee) {
        chJour = parjour;
        chMois = parmois;
        chAnnee = parannee;
    }
    public Date(int parA) {
        chAnnee = parA;
        chMois = 1;
        chJour = 1;
    }

    public static int dernierJourDuMois(int chMois, int chAnnee) {
        switch (chMois) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                if ((chAnnee % 4 == 0 & chAnnee % 100 != 0) || chAnnee % 400 == 0)
                    return 29;
                else
                    return 28;

            default:
                return 31;
        }
    }

    public boolean estValide()   {
        return ((1 <= this.chJour && this.chJour <= dernierJourDuMois(this.chMois,this.chAnnee)) && (1 <= this.chMois && this.chMois <= 12));
    }

    public static Date lireDate() {
        Scanner scanner = new Scanner(System.in);
        int jour = scanner.nextInt();
        int mois = scanner.nextInt();
        int annee = scanner.nextInt();
        Date scandate = new Date(jour,mois,annee);
        return scandate;
    }

    public int compareTo(Date ParDate) {
        if (this.chAnnee > ParDate.chAnnee)
            return 1;
        else if (this.chAnnee < ParDate.chAnnee)
            return -1;

        if (this.chMois > ParDate.chMois)
            return 1;
        else if (this.chMois < ParDate.chMois)
            return -1;

        if (this.chJour > ParDate.chJour)
            return 1;
        else if (this.chJour > ParDate.chJour)
            return -1;
        return 0;

    }
     public int compareTO(Date ParDate) {
        int entier1 = chAnnee * 10000 + chMois *1000 + chJour;
        int entier2 = ParDate.chAnnee * 10000 + ParDate.chMois * 1000 + ParDate.chJour;
        return entier1 - entier2;
     }

     public Date dateDuLendemain() {
        int jour = chJour;
        int mois = chMois;
        int annee = chAnnee;
        jour++;
        if (jour > dernierJourDuMois(mois,annee)) {
            jour = 1;
            mois++;
            if (mois >12) {
                mois = 1;
                annee++;

            }
        }
        return new Date(jour,mois,annee);
     }

    public Date dateDeLaVeille() {
        int jourv = chJour;
        int moisv = chMois;
        int anneev = chAnnee;
        jourv--;
        if (jourv > dernierJourDuMois(moisv,anneev)) {
            jourv = 1;
            moisv++;
            if (moisv >12) {
                moisv = 1;
                anneev++;

            }
        }
        return new Date(jourv,moisv,anneev);
    }

}

