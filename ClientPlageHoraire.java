public class ClientPlageHoraire {
    public static void main(String [] args) {
        Horaire h1 = new Horaire(12,15);
        Horaire h2 = new Horaire(13,45);
        PlageHoraire PH = new PlageHoraire(h1,h2);
        PlageHoraire PH1 = new PlageHoraire(h2,new Horaire(15,45));
        System.out.println(PH.compareTo(PH1));
    }

}
