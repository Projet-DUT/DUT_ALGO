import iut.algo.*;

public class exercice5_2 {
    public static void main(String[] args) {
        int n, esp,et,i,cpt1;
        n = Clavier.lire_int();
        i=0;
        et=1;
        esp=n*2-1;
        while(i<n){
            cpt1=1;
            while(cpt1<esp){
                System.out.print(' ');
                cpt1++;
            }
            cpt1=0;
            while (cpt1<et){
                System.out.print('*');
                cpt1++;
            }
            esp=esp-1;
            et=et+2;
            i++;
            System.out.print('\n');
        }


    }
}