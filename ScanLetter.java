import java.util.Scanner;

public class ScanLetter {
    public static void main(String[] args) {

        /*
         * demander à l'utilisateur de saisir une lettre
         * parcourir une liste de lettres
         * si la lettre saisie est dans la liste, avertir l'utilisateur
         * sinon prévenir que la lettre n'est pas dans la liste
         */

        char lettres[] = { 'a', 'b', 'd', 'g', 'y', 'e', 'h', 'm', 'i', 's' };
        char x = ' ';

        System.out.println("Entrez une seule lettre");

        Scanner lettre = new Scanner(System.in);
        x = lettre.nextLine().charAt(0);

        int resPositive = 0;
        int resNegative = 0;

        for (int i = 0; i < lettres.length; i++) {
            if (lettres[i] == x) {
                resPositive = 1;
                break;
            } else {
                resNegative = 0;
            }
        }
        if (resPositive == 1) {
            System.out.println("La lettre " + x + " est dans la liste");

        } else {
            System.out.println("La lettre " + x + " n'est pas dans la liste");
        }
    }
}
