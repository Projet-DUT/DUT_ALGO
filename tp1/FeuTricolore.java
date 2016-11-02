import iut.algo.*;

public class FeuTricolore {
	public static void main(String[] a){
	ControleGraphique ct;
	int ecart;
	ct = new ControleGraphique();
	ct.setTaille ( 400,400);

	ct.couleur ( Couleur.NOIR );
	ct.rectangle ( 170, 100, 230, 300);

	ct.rectangleCouleur (170 , 100, 230, 300, Couleur.GRIS_MAT);

	ct.cercleCouleur ( 200 , 150 , 20, Couleur.ROUGE_FONCE);
	ct.cercleCouleur ( 200 , 200 , 20 , Couleur.ORANGE_FONCE);
	ct.cercleCouleur ( 200 , 250 , 20 , Couleur.VERT_FONCE );
	}
}
