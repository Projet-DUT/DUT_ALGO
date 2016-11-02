import iut.algo.*;

public class exo2 {


    public static void main(String[] args) {
        int n, i;

        i = 1;
        while (i<=10){
        n = Clavier.lire_int();
        i = i++;
        if (n % 2 == 0) {
            System.out.println(n * n);
        }
    }


    }
}
