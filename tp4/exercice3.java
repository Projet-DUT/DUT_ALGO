import iut.algo.*;

public class exercice3 {
    public static void main(String[] args) {
        int n, i;
        n = 1;
        i = 0;
        System.out.println("suite1");
        while (i < 100) {
            System.out.println(n);
            n = (n + 2);
            i++;

        }
        System.out.println("suite2");
        n = 1;
        i = 1;
        while (i < 100) {
            System.out.println(n);
            n = n + i;

            i++;

        }
	System.out.println("suite3");
	n=1;
	i=1;
    int cpt;
     cpt = 2;
        System.out.println(n);
        while (i<100){

            if (cpt==1) {
                n = n + 1;
                System.out.println(n);
                cpt = 2;
            }
            if(cpt==2){
               n=n+2;
                System.out.println(n);
                cpt=1;

            }
            i++;
        }
    }
}
