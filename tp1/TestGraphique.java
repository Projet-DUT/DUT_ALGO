import iut.algo.*;

public class TestGraphique
{

	public static void main(String[] a)
	{
		/*-----------------*/
		/* Variables       */
		/*-----------------*/
		ControleGraphique ct;

		int ecart;


		/*-----------------*/
		/* Instructions    */
		/*-----------------*/

		/* initialisation de la zone de dessin */

		ct = new ControleGraphique();
		ct.setTaille( 600,500 );


		/* dessin */

		// Deux traits Bleu
		ct.couleur ( Couleur.BLEU_FONCE );
		ct.ligne ( 50, 10, 100, 50 );

		ct.couleur ( Couleur.BLEU_CLAIR );
		ct.ligne ( 160, 50, 110, 10 );


		// 4 Rectangles

		ct.couleur ( Couleur.NOIR );
		ct.rectangle ( 50, 80, 120, 120);
		ct.rectangleCouleur ( 50, 130, 120, 160, Couleur.BLEU_ROYAL );

		ct.couleur ( Couleur.ROUGE );
		ct.rectangle ( 140, 120, 180,  80 );
		ct.rectangleCouleur ( 180, 160, 140, 130, Couleur.CORAIL_CLAIR );


		// 2 Cercles

		ct.couleur ( Couleur.JAUNE_DORE );
		ct.cercle  ( 100, 450, 20 );
		ct.cercleCouleur ( 550, 50, 20, Couleur.JAUNE_DORE_PALE );


		// Trois carres en degrade de gris

		ct.couleur ( Couleur.GRIS_MAT );

		ecart = 0;
		ct.rectangleCouleur ( 100+ecart, 200, 120+ecart, 220, Couleur.GRIS_GAINSBORO );

		ecart = 30;
		ct.rectangleCouleur ( 100+ecart, 200, 120+ecart, 220, Couleur.GRIS_ARGENT    );

		ecart = ecart + 30;
		ct.rectangleCouleur ( 100+ecart, 200, 120+ecart, 220, Couleur.GRIS           );

	}
}
