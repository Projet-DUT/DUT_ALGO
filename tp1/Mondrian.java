import iut.algo.*;
public class  Mondrian {
	public static void main(String[] a){
	ControleGraphique ct;

	ct = new ControleGraphique ();
	ct.setTaille (400,400);

	ct.rectangleCouleur ( 100, 0, 400, 350, Couleur.ROUGE );
	ct.rectangleCouleur (0 , 0 , 100, 100, Couleur.JAUNE );
 	ct.couleur (Couleur.NOIR);
	ct.rectangle ( 0, 100 , 100 , 350);
	ct.rectangle ( 100 , 350 ,350 ,400);
	ct.rectangle (350 , 350 ,400 ,400);
	ct.rectangleCouleur (0 , 350 ,100, 400, Couleur.BLEU );
}
}
