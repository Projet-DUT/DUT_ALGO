import iut.algo.*;
public class exercice5{
	public static void main(String[] args){
		int n= Clavier.lire_int();	
		String	site, type, departement;
		
		if (n / 1000000 == 1){
			site = "caucriauville";		
		}else{
			 site = "frissard "; 
		}
		System.out.println("site:         "+site);
		switch((n/100000)%10){
		
			case 1 : type="amphi";
			break;
			case 2 : type="Salle TD";
			break;
			case 3 : type="Salle informatique";
			break;
			case 4 : type="labo de langue";
			break;
			case 9 : type="spécifique ";
			break;
			default: type="incorrect";
				
		}
		System.out.println("type:         "+type);
		switch(n / 1000 % 100){
			case 1 : departement="Carrières Sociales ";
			break;
			case 2 : departement="Génie Civil ";
			break;
			case 3 : departement="Gestion des Entreprises et des Administrations ";
			break;
			case 4 : departement="Génie Electrique et Informatique Industrielle ";
			break;
			case 5 : departement="Gestion Logistique et Transport ";
			break;
			case 6 : departement="Génie Mécanique et Productique ";
			break;
			case 7 : departement="Hygiène Sécurité ";
			break;
			case 8 : departement="Information et Communication ";
			break;
			case 9 : departement="Informatique";
			break;
			case 0 : departement="Technique de Commercialisation ";
			break;
			case 99 : departement="Non Affectée";
			break;
			default: departement="incorrect";
		 }
		 System.out.println("departement:         "+departement);
		switch(n % 1000 / 100)
		{
			case  1 : System.out.println ("type       : 1");
			break;
			case  2 : System.out.println ("type       : 2");
			break;
			case  3 : System.out.println ("type       : 3");
			break;
			case  4 : System.out.println ("type       : 4");
			break;
			case  5 : System.out.println ("type       : 5");
			break;
			case  6 : System.out.println ("type       : 6");
			break;
			case  7 : System.out.println ("type       : 7");
			break;
			default : System.out.println ("type       : inconnu");
			break;
		}
	
	
	
	}
		
}
