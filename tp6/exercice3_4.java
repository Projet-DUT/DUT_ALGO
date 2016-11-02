import iut.algo.*;
public class exercice3_4
{

   public static void main(String [] args)
   {
   		int dim=10;
   		char[] tab1 = new char[dim];
   		char[] tab2 = new char[dim];
		
		
		for (int i=0; i < dim; i++){
			tab1[i]= Clavier.lire_char();
			tab2[9-i]= tab1[i];
			
		}
		System.out.println("resultat:\n" );
		for (int i=0; i < dim ; i++){
			System.out.print(tab2[i]);
		}
		System.out.println("\n" );
   }
}
