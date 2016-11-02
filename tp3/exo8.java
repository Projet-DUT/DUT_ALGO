import iut.algo.*;

public class exo8 {


	public static void main(String[] arg){
		int h1,h2,m1,m2,s1,s2;
 		System.out.println ("premiere heure");
 		System.out.println ("ecrire le nombre des secondes");
		s1 = Clavier.lire_int();
		System.out.println ("ecrire le nombre des minutes");
		m1 = Clavier.lire_int();
		System.out.println ("ecrire le nombre des heures");
		h1 = Clavier.lire_int();
		
		System.out.println ("seconde heure");
 		System.out.println ("ecrire le nombre des secondes");
		s2 = Clavier.lire_int();
		System.out.println ("ecrire le nombre des minutes");
		m2 = Clavier.lire_int();
		System.out.println ("ecrire le nombre des heures");
		h2 = Clavier.lire_int();
		
		s1 = s1 + s2;
		m1 = m1 + m2;
		h1 = h1 + h2;
		if (s1 >= 60){
			m1 = m1+1;
			s1 = 0;
		}
		if  (m1 >= 60){
			h1 = h1+1;
			m1 = 0;

		}
		if (h1 >= 24) {
			h1 = 0;
		}
		System.out.println ( h1 + ":" + m1 + ":" + s1 );
	}
}
