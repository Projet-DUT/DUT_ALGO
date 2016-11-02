import iut.algo.*;
public class exercice2
{

   public static void main(String [] args)
   {
   
   		int[] tab1 = new int[15];
   		int[] tab2 = new int[20];
		
		
		for (int i=0; i < 15; i++){
			tab1[i]= (int)(Math.random()*(11));
			System.out.println("tab1="+tab1[i]);
		}
		for (int i = 0; i < 20; i++ ){
			tab2[i]=(int)(Math.random()*(21));	
			System.out.println("tab2="+tab2[i]);
		}
		
   }
}
