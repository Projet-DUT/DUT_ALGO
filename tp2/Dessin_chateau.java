import iut.algo.*;

public class Dessin_chateau {

	public static void main(String[] args){
		
		/*-----------------*/
		/* Variables       */
		/*-----------------*/
		
		ControleGraphique ct;
		
		/*-----------------*/
		/* Instructions    */
		/*-----------------*/

		/* initialisation de la zone de dessin */

		ct = new ControleGraphique();
		ct.setTaille( 600,550 );

		/* dessin */
		ct.couleur ( Couleur.NOIR  );
		ct.rectangle ( 50, 150, 100, 500);
		ct.rectangle ( 510, 150, 560, 500);
		ct.rectangle ( 260, 410, 345, 500);
		ct.ligne ( 100, 500, 510, 500 );	
		ct.ligne ( 30, 150, 120, 150 );
		ct.ligne ( 30, 150, 75, 120 );
		ct.ligne ( 120, 150, 75, 120 );
		ct.ligne ( 490, 150, 580, 150 );
		ct.ligne ( 490, 150, 535, 120 );
		ct.ligne ( 580, 150, 535, 120 );
		
		for(int i=0 ; i<21 ; i++){
			ct.ligne ( 100+20*i, 200, 110+20*i, 200 );
			if(i!=20) ct.ligne ( 110+20*i, 210, 120+20*i, 210 );
			if(i!=0) ct.ligne ( 100+20*i, 200, 100+20*i, 210 );
			if(i!=20) ct.ligne ( 110+20*i, 200, 110+20*i, 210 );
			if(i<7) ct.rectangle ( 145+53*i, 250, 150+53*i, 280);
			
		}
	}
}
