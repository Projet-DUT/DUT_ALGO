import iut.algo.*;
import java.util.Scanner;
public class exercice6 {

	public static void main(String[] args){
	 String type, lettre;
	 Scanner sc = new Scanner(System.in);
	 String c = sc.nextLine();
	
		System.out.println(estVoyelle(c.charAt(0)));
    System.out.println(estConsonne(c.charAt(0)));
    System.out.println(estLettre(c.charAt(0)));


	}
	public static boolean estVoyelle  (char c){
		return   (c== 'a' || c=='y' || c== 'e' || c== 'o' || c=='u') ;


}
public static boolean estConsonne (char c){
	//if () estConsonne=true;
		return (!estVoyelle(c) );
}
	public static boolean estLettre   (char c){

		//if ( ) estLettre=true;
		 return (estConsonne(c)==true || estVoyelle(c)==true);
}
	
}

