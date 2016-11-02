import iut.algo.*;

public class exercice5
{

   public static void main(String [] args)
   {
    int ligne, col;

    ligne = Clavier.lire_int();
   	col = Clavier.lire_int();

   	char tab[][] = new char [ligne][col];

   	for( int i=0 ; i < ligne; i++ ){
   		for (int j= 0; j <col; j++){
   		tab[i][j]=(char)((int)(Math.random()*26) + 65);
   		}
   	 }
	for(int i=0 ; i<ligne ; i++)
		{
			for(int j=0 ; j<col ; j++)
				Console.print (tab[i][j]);
		
			Console.print ("\n");
		}
   }
}


