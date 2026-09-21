// Activitat 02 — AvaluarExpressions
public class AvaluarExpressions {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        int c = 4;
        int d = 2;

        // TODO: mostra el resultat d'avaluar cada expressió, una per línia:
        //   2 - a * b + c
        //   (2 - a) * b + c
        //   a * b - c * a - d
        //   a / 3 - b
        //   a / (33 - b)
        //   d * 23 - 1 + b

        System.out.println(2 - 3 * 8 + 4 );
        System.out.println((2 - 3 ) * 8 + 4 );
        System.out.println(3 * 8 - 4 * 3 - 2 );
        System.out.println(3 / 3 - 8 );
        System.out.println(3 / (33 - 8));
        System.out.println(2 * 23 - 1 + 8);
    }
}
