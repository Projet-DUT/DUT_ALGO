import iut.algo.*;

/** Utilisation de la conditionnell
  * TP3
  * @author Leboucher
  * @version 1 du 14/09/2016
  */

public class Facture {
	public static void main(String[] arg){
		/*---------------*/
		/* Données 		 */
		/*---------------*/
		
		/* Constantes 	 */
		/*---------------*/
		final double PRIX_UNITAIRE = 0.75; 
		/* variable 	 */
		/*---------------*/
		int nbBouteilles ;
		double prixSansPort, port;
		
		/*---------------*/
		/* Instruction	 */
		/*---------------*/
		// Saisie du nombre de bouteilles désirées:
		System.out.print (" Combien de bouteiles commandez-vous ?");
		nbBouteilles = Clavier.lire_int(); //lire un entier
		
		//calcul du prix et du port
		prixSansPort = nbBouteilles  * PRIX_UNITAIRE;
		
		if (prixSansPort >= 150){
			
			port = 0; //port gratuit si le montant est d'au moins 150
		
		}else{ 
			port = 10.0/100.0 * prixSansPort; // port = 10% du montant
			if (port < 10){
				port = 10;
			}
		}
		
				
		double prixAvecPort = prixSansPort + port ;
		
		//edition de la facture 
		
		System.out.println ("Quantité commandée \t" + nbBouteilles );
		System.out.println ("Prix Unitaire \t" + PRIX_UNITAIRE );
		System.out.println ("Montant sans frais de port :\t" + prixSansPort );
		System.out.println ("Port :\t" + port );
		System.out.println ("Montant total :\t" + prixAvecPort);
		System.out.println ("Valeur en votre aimable règlement.");
		}
		
}
