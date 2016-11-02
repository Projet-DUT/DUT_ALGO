import iut.algo.*;

public class exercice5 {
    public static void main(String[] args) {
        int compt = 0, n, k, somdiv, nbr;
        n = 10000;
        nbr = 2;
        while (compt != n){

            somdiv = 1;
            k = 2;
            while(k <= nbr/2 ) {
                if (nbr % k == 0) somdiv += k ;
                k++;
            }
            if (somdiv == nbr) {
                System.out.println(nbr+" est un nombre parfait");
                compt++;
            }
            nbr++;
        }
    }
}