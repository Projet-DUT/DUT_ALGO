import iut.algo.*;

public class exercice8 {
    public static void main(String[] args) {
        int n,j,i;
        n = (int)(Math.random() * 21);
        for(i=1;i <= n ;i++){
            for(j=0;j < n ; j++){
                System.out.print("+--");
                if (j==n-1) System.out.println("+");
            }
            for(j=0; j < n ;j++) {
                 System.out.print("+" + ((int)(Math.random() * 21)+60)); 
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
