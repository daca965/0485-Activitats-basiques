// Activitat 08 — Suma i mitjana de 4 enters

import java.util.Scanner;

public class SumaMitjana {
    public static void main(String[] args) {
        // TODO: llegeix 4 enters i mostra:
        //   Suma = ...
        //   Mitjana = ...      (recorda que la mitjana pot tenir decimals)

        Scanner teclat = new Scanner (System.in); 
        int numero_1 = 0; 
        System.out.println("numero_1");
        numero_1 = teclat.nextInt();

       int numero_2 = 0 ; 
        System.out.println("numero_2");
        numero_2 = teclat.nextInt();

       int numero_3 = 0; 
        System.out.println("numero_3");
        numero_3 = teclat.nextInt();

        int numero_4 = 0 ; 
        System.out.println("numero_4");
        numero_4 = teclat.nextInt();

        int suma = numero_1 + numero_2 + numero_3 + numero_4;
        double mitjana = suma / 4.0;
        
       System.out.println("Suma = " + suma);
       System.out.println("Mitjana = " + mitjana);





    }
}
