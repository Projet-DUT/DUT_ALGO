import iut.algo.*;
public class Cible {

	public static void main(String[] a){
		ControleGraphique ct;
		int ecart;

	ct = new ControleGraphique();
	ct.setTaille ( 200,200 );
	ct.couleur ( Couleur.BLEU_CLAIR );
	ct.ligne ( 20, 20, 180, 180);
	ct.couleur ( Couleur.BLEU_CLAIR );
	ct.ligne ( 180 , 20 , 20 , 180 );
	ct.couleur ( Couleur.BLEU_FONCE );
	ct.rectangle ( 60 , 60 , 140 , 140);
	ct.couleur ( Couleur.BLEU_FONCE );
	ct.cercle ( 100 , 100, 20 );
	}
}
