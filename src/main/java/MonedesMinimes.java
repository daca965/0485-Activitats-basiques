
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.swing.plaf.ComponentInputMapUIResource;

// Activitat 12 — Monedes mínimes
public class MonedesMinimes {
    public static void main(String[] args) {
        // TODO: llegeix una quantitat en cèntims i mostra quantes monedes de
        //       cada tipus calen (200, 100, 50, 20, 10, 5, 2, 1), una per línia.
        //       Per a l'entrada 123:
        //   0 monedes de 2 euros
        //   1 monedes d'1 euro
        //   0 monedes de 50 cèntims
        //   1 monedes de 20 cèntims
        //   0 monedes de 10 cèntims
        //   0 monedes de 5 cèntims
        //   1 moneda de 2 cèntims
        //   1 moneda de 1 cèntims

        Scanner teclat = new Scanner(System.in);
        int centims = 0;
        System.out.println("Entre el numero de centims");
        centims = teclat.nextInt();

        //monedes de 2 euros
        int monedes2 = centims /200;
        centims = centims % 200 ;
        System.out.println(monedes2 + " monedes de 2 euros");

         //monedes de 1 euro
        int monedes1 = centims /100;
        centims = centims % 100;
        System.out.println(monedes1 + " monedes de 1 euros");

         //monedes de 50 centims
        int monedes50 = centims /50; 
        centims = centims % 50;
        System.out.println(monedes50 + " monedes de 50 centims");

         //monedes de 20 centims
        int monedes20 = centims /20; 
        centims = centims % 20 ;
        System.out.println(monedes20 + " monedes de 20 centims");

         //monedes de  10 centims
        int monedes10 = centims /10 ;
        centims = centims % 10;
        System.out.println(monedes10 + " monedes de 10 centims");

         //monedes de 5 centims 
        int monedes5 = centims /5; 
        centims = centims % 5;
        System.out.println(monedes5 + " monedes de 5 centims");

         //monedes de 2 centims
        int monedes_2 = centims /2 ;
        centims = centims % 200 ;
        System.out.println(monedes_2 + " monedes de 2 centims");

        //monedes de 2 centims
        int monedes_1 = centims /1; 
        centims = centims % 1; 
        System.out.println(monedes_1 + " monedes de 1 centims");


        

        


    }
}
