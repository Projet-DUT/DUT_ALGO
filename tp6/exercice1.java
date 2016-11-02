import iut.algo.*;
public class exercice1
{

   public static void main(String [] args)
   {
   
   		int[] tab = new int[50];
		int s ,i ,n ;
		

		
		do {
			System.out.println("entrez nombre element n <=50");
			n = Clavier.lire_int();
		}while ((n < 0) && (n > 50));
		for (i=0; i < n; i++){
			System.out.println("tab["+i+"]");
			tab[i]= Clavier.lire_int();
		}
		s=0;
		for ( i = 0 ; i < n ; i++ ){
				System.out.println("tab["+i+"]="+ tab[i]);
				s = s + tab[i];
		}
		System.out.println ("la somme des element"+ s);
		int sp = 0;
		for ( i = 0 ; i < n ; i++){
			if (tab[i]%2==0) sp = sp + tab[i]; 
		} 
		System.out.println("la somme des nbr paire"+ sp);
		System.out.println("la somme des nbr impaire"+ (s-sp));
   }
}
