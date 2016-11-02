  import iut.algo.*;
public class Exo5
{
	public static void main(String[] arg)
	{
	
	int n, cpt, cpt1;
	
	System.out.println(" Entrer n entier positif ");
	n = Clavier.lire_int();
	cpt = 1;
	cpt1 = 1;
	if ( n % 2 == 0 )
	 { 
		
		System.out.println( n * n ); 
	 }
	System.out.println(" Entrer positif pour continuer sinon -1 ");
	while ( n != -1 )
	 {
	 	n = Clavier.lire_int();
	 	cpt = cpt + 1;
	 	if ( n % 2 == 0 )
	 	 {
	  		cpt1 =  cpt1 + 1 ;
	  		System.out.println( n * n );
	  	}
	  }
		
	}
}
