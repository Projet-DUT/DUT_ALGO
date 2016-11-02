import iut.algo.*;

public class secondeplusun {
	public static void main(String[] arg){
		int h, m, s; 
		
		System.out.println ("ecrire le nombre des secondes");
		s = Clavier.lire_int();
		System.out.println ("ecrire le nombre des minutes");
		m = Clavier.lire_int();
		System.out.println ("ecrire le nombre des heures");
		h = Clavier.lire_int();
		
		s = s+1;
		
		
		if (s >= 60){
			m = m+1;
			s = 0;
		}
		if  (m >= 60){
			h = h+1;
			m = 0;

		}
		if (h >= 24) {
			h = 0;
		}
		System.out.println ( h + ":" + m + ":" + s );
	}
}
