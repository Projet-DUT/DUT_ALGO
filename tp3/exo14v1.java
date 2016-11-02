import iut.algo.*;

public class exo14v1 {


	public static void main(String[] arg){
	
		System.out.println ("année?");
		
		int annee;
		annee = Clavier.lire_int();
		
		if ((annee%4)==0 && (annee%100)!=0 || (annee%400)==0 ){
			System.out.println ("bissextile");
		}else{
			System.out.println ("non");
		}
	}
}
