import iut.algo.*;

public class exercice4 {
    public static void main(String[] args) {
        int n, i;
        i = 1;
        n = Clavier.lire_int();
        int n2=n;

        while (n!=-1){
            if (n > n2) {
                n2 = n;
                i = 1;
            }else {
                if (n2 == n) {
                    i++;
                }
            }
            n = Clavier.lire_int();
        }
        System.out.println("la note max est" + n2);
        System.out.println("rencontrée" + i + "fois");

    }
}