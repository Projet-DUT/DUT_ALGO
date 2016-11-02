import iut.algo.*;

public class exercice6 {
    public static void main(String[] args) {
        int n,j,i;
        System.out.println("Entrez une dimension :");
        n = Clavier.lire_int();
        for(i=1;i <= n ;i++){
            for(j=0;j < n ; j++){
                System.out.print("+--");
                if (j==n-1) System.out.println("+");
            }
            for(j=0; j < n ;j++) {
                if (n<10) System.out.print("+ " + (j+1));
                    else System.out.print("+" + n);
                if (j == n-1) System.out.println('+');
            }
            for(j=0;j>=n;j++)
            {
                System.out.print("+--");
                if(j==n-1) System.out.println("+");

            }
            if (i == n){
            	for (j=0; j<n;j++) System.out.print("+--");
            	System.out.println("+");
            } 
            
        }

    }

}
