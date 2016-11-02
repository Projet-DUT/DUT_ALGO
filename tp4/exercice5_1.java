import iut.algo.*;

public class exercice5_1 {
    public static void main(String[] args) {
        int i, n;
        String ch;
        n = Clavier.lire_int();
        i=1;
        ch= " ";
        while (i<=n){
            ch = ch + ' '+ Integer.toString(i);
            System.out.println(ch);
            i++;
        }
    }
}