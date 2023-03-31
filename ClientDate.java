import java.util.Scanner;

public class ClientDate {
    public static void main(String [] args) {
        Date anniversaire = new Date(31,4,2022);
        Date d = new Date(22,4,2023);
        System.out.println(anniversaire.compareTo(d));
    }
}



