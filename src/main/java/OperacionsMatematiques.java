
import java.util.Scanner;

// Activitat 05 — Operacions aritmètiques fonamentals
public class OperacionsMatematiques {
    public static void main(String[] args) {
        // TODO: llegeix dos enters i mostra suma, resta, producte i divisió:
        //   4 + 2 = 6
        //   4 - 2 = 2
        //   4 * 2 = 8
        //   4 / 2 = 2

        try { 

        Scanner teclat = new Scanner(System.in);
        int unitats = 0;
        System.out.println(" 1r nombre");
        unitats = teclat.nextInt();
 
        int unitats_2 = 0;
        System.out.println(" 2n nombre");
        unitats_2 = teclat.nextInt();

        int resultat = unitats + unitats_2;

        System.out.println(unitats+ " + "+ unitats_2+" = " +resultat );

        resultat = unitats - unitats_2;
        System.out.println(unitats+ " - " +unitats_2+ " = " + resultat  );

         resultat = unitats * unitats_2;
         System.out.println(unitats+ " * "+ unitats_2+" = " +resultat );

         resultat = unitats / unitats_2;
         System.out.println(unitats+ " / "+ unitats_2+" = " +resultat );

         }catch(Exception e) {                    //buscar errors 
         System.out.println("Error!");

          }
     }
 }





