import java.util.Arrays ;

public class ClientDateCalendrier {
    public static void main(String [] args) {
        DateCalendrier anniversaire = new DateCalendrier(31, 4, 2022);
        DateCalendrier d1 = new DateCalendrier();
        DateCalendrier d2 = new DateCalendrier(22,5,2003);
        System.out.println(anniversaire.toString());
        System.out.println(d1.toString());
        System.out.println(d1.dateDuLendemain());
        System.out.println(d1.dateDeLaVeille());
        DateCalendrier [] tab = {anniversaire,d1,d2,new DateCalendrier(2,3,1999)};
        Arrays.sort(tab);
        System.out.println(Arrays.toString(tab));

    }
}
