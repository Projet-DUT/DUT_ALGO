import iut.algo.*;
import java.awt.Color;
public class matrix
{

   public static void main(String [] args)
   {
   int dim = 80;
   	boolean vrai;
   	char tab[] = new char[dim];
   for (int i=0; i< dim; i++){
     
	   int lettre = (int)(Math.random()*26+65);
    if (i%2 ==0){ 
		tab[i]=(char)(lettre);
  	}else{
		tab[i]=('\u0009');
    }
	}
   	vrai = false;

   	while (vrai!=true){
   	
		for (int i=0 ; i < dim ; i++){
			for (int j=0; j < dim ; j++){
				int val = (i+j)% dim;
				   	//int couleur = (int)(Math.random()*7+31);
   				String newcouleur =  ("\033["+32+"m");
				System.out.print(newcouleur + tab[val]+"\033[0m");
			}
			try{Thread.sleep(100);}catch(Exception e){}
			System.out.print("\n");
		}
   	}
   }
}


