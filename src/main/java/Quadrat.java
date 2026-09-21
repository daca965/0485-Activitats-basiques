
import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

// Activitat 04 — Perímetre i àrea d'un quadrat
public class Quadrat {
    public static void main(String[] args) {
        // TODO: llegeix el costat (enter) i mostra:
        //   Perímetre del quadrat = ...      (costat x 4)
        //   Àrea del uadrat = ...           (costat x costat)
         
        Scanner teclat = new Scanner(System.in);
        int costat = 0;
        System.out.println("mesura del costat");
        costat = teclat.nextInt();
        System.out.println(costat * 4);
        System.out.println(costat * costat);





        
    }
}
