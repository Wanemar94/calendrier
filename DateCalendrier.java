import java.util.Calendar;

public class DateCalendrier extends Date implements ConstantesCalendrier, Comparable <Date>{
    private int chJourSem;
    private int chNmSem;


    public DateCalendrier () {
        super(0,0,0);
        Calendar Today = Calendar.getInstance();
        chNmSem = Today.get(Calendar.WEEK_OF_YEAR);
        chAnnee = Today.get(Calendar.YEAR);
        chMois = Today.get(Calendar.MONTH) + 1;
        chJour = Today.get(Calendar.DAY_OF_MONTH);
        chJourSem = Today.get(Calendar.DAY_OF_WEEK);
        chJourSem = chJourSem - 1;
        if (chJourSem == 0) {
            chJourSem = 7;
        }
    }

    public DateCalendrier(int parJ, int parM, int parA) {
        super(parJ, parM, parA);
        Calendar day = Calendar.getInstance();
        day.set(parA, parM - 1, parJ);
        chNmSem = day.get(Calendar.WEEK_OF_YEAR);
        chJourSem = day.get(Calendar.DAY_OF_WEEK);
        chJourSem = chJourSem - 1;
        if (chJourSem == 0) {
            chJourSem = 7;
        }
    }

    public String toString() {
        return JOURS_SEMAINE[chJourSem - 1] + " " +  super.toString();
    }

    public void set(int year, int month,int dayOfmonth) {
        chAnnee = year;
        chMois = month;
        chJour = dayOfmonth;
    }


    public DateCalendrier dateDeLaVeille() {
        Date d = super.dateDeLaVeille();
        return new DateCalendrier(d.chJour,d.chMois,d.chAnnee);
    }

    public DateCalendrier dateDuLendemain() {
        Date d = super.dateDuLendemain();
        return new DateCalendrier(d.chJour,d.chMois,d.chAnnee);
    }

    public int getChJourSem() {
        return chJourSem;
    }

    public int getChNmSem() {
        return chNmSem;
    }




}
