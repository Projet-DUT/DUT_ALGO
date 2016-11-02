import iut.algo.*;

public class exo3 {


    public static void main(String[] args) {
        int n ,i;
		n=1;
        for (i=1 ; i<= 100; i++) {
			if ( n % 3 == 0 ){ 
				System.out.println(n);
			}
			n=n+1;
        }
    }
}
