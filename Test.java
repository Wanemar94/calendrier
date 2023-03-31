import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Test {
    public static void main (String [] arg) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("data"+File.separator+"planning.txt"));
        sc.useDelimiter(",\\s*");
        while(sc.hasNext()) {
            String titre = sc.next();
            int jour = sc.nextInt();
            int mois = sc.nextInt();
            int an = sc.nextInt();
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();
            System.out.println(titre + "," +  jour + "/" + mois + "/" + an);
        }
    }
}
