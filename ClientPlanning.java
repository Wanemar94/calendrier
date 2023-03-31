import javax.naming.SizeLimitExceededException;
public class ClientPlanning {
    public static void main(String[] args) {
        Date date = new Date(2, 7, 2004);
        Date date1 = new Date(1, 7, 2004);
        Date date2 = new Date(1, 29, 1999);

        Horaire h1 = new Horaire(10, 15);
        Horaire h2 = new Horaire(12, 0);
        Horaire h3 = new Horaire(13, 0);
        Horaire h4 = new Horaire(14, 15);


        String titre2 = "Sport 2";
        String titre = "Sport";
        String titre3 = "menage";
        String titre4 = "sieste";


        Planning planning = new Planning(2);


        //  Reservation[] tab = planning.getReservations(new Date(2, 7, 2004));
        //  for (int i = 0; i < tab.length && tab[i] != null; i++)
        //      System.out.println(tab[i].toString());


        planning.algoTri();


    }
}






