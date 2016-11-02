import iut.algo.*;
public class exercice3_5
{

   public static void main(String [] args)
   {
   
   		int[] tab = new int[40];
		int max , maxindex,minindex,min;
		max=0;
		min=40;
		minindex = 0;
		maxindex=0;
		for (int i=0; i < 40; i++){
			tab[i]= (int)(Math.random()*(21)+20);
			System.out.println("tab1="+tab[i]);
			if (tab[i]>max && tab[i]!=max ){
				max=tab[i]; 
				maxindex = i;
			}
			if (tab[i]<min && tab[i]!=min){
				min=tab[i]; 
				minindex = i;
			}
		}
		System.out.println("max "+max+" a l'index "+maxindex);
		System.out.println("max "+min+" a l'index "+minindex);
   }
}
