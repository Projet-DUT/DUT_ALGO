import iut.algo.*;

public class rayon {
	public static void main(String[] arg){

	float rayon , circo;
	float pi =  3.1415f;

	System.out.println ("ecrire circonference ");
	circo = Clavier.lire_int();
	rayon = circo/ (2 * pi) ;
	System.out.println (" le rayon est egale " + rayon);
	}
}
