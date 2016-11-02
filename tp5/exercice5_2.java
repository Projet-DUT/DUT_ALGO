import iut.algo.*;
public class exercice5_2{
	public static void main(String[] args){
		long n = Clavier.lire_long();	
		long temp, cle;
		String	sexe ;
		temp = (n / 1000000000000l);
		if (temp == 1){
			sexe = "homme";		
		}else{
			 sexe = "femme"; 
		}
		System.out.println("sexe:         "+sexe);
		cle =97-(n%97);
		System.out.println("cle:"+cle);
	
	}
		
}
