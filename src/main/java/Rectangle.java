
import java.util.Scanner;

// Activitat 06 — Perímetre i àrea d'un rectangle
public class Rectangle {
    public static void main(String[] args) {
        // TODO: llegeix el costat gran i el costat petit (enters) i mostra:
        //   Perímetre del rectangle = ...    (costatGran x 2 + costatPetit x 2)
        //   Àrea del rectangle = ...         (costatGran x costatPetit)


        Scanner teclat = new Scanner(System.in);
        int costat_gran = 0;
        System.out.println("costat gran :");
        costat_gran = teclat.nextInt();


        int costat_petit = 0;
        System.out.println("costat gran :");
        costat_petit = teclat.nextInt();


        System.out.println("Perímetre del rectangle =");
        System.out.println(costat_gran * 2 + costat_petit * 2);
        System.out.println("Àrea del rectangle =");
        System.out.println(costat_gran * costat_petit);





    

        

    
    }
}


