import iut.algo.*;
import java.awt.Color;
public class exercice3_6
{

   public static void main(String [] args)
   {
   	boolean vrai;
   	char tab[] = {'M','E','S','S','A','G','E',' ',' ',' '};
   	vrai = false;

   	while (vrai!=true){
  	
		for (int i=0 ; i < 10 ; i++){
			for (int j=0; j < 10 ; j++){
				int val = (i+j)% 10;
				   	int couleur = (int)(Math.random()*7+31);
   				String newcouleur =  ("\033["+couleur+"m");
				System.out.print(newcouleur + tab[val]+"\033[0m");
			}
			try{Thread.sleep(100);}catch(Exception e){}
			System.out.print("\n");
		}
   	}
   }
}


