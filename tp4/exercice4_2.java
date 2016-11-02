import iut.algo.*;

public class exercice4_2 {
    public static void main(String[] args) {
        int n, i, u;
        i = 0;
        n = (int)(Math.random() * 101);
        u = Clavier.lire_int();
        while (u != n) {
            u = Clavier.lire_int();
            if (u > n) {
                System.out.println("en dessus");
            }
            if (u < n) {
                System.out.println("au dessous");
            }
            i++;
        }
        System.out.println("Bravo, vous avez gagne en " + i + "coups");
    }
}