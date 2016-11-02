import iut.algo.*;

public class aire {
	public static void main(String[] arg){

	float rayon , aire;
	float pi =  3.1415f;

	System.out.println ("ecrire rayon");
	rayon = Clavier.lire_int();
	aire =  rayon*rayon*pi;
	System.out.println (" l'aire est egale " + aire);
	}
}
