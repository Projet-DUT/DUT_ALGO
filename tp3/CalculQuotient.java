/** Un premier programme
  * date : le 07/09/2016
  * @author: Erwan Leboucher <erwanleboucher@gmail.com>
  */
import iut.algo.*;

public class CalculQuotient {
	public static void main(String[] arg){
	/*-------------*/
	/*Données      */
	/*-------------*/
	float val1, val2;
	String  type;
	/*-------------*/
	/* Instruction */
	/*-------------*/
	System.out.println ("ecrire le premier nombre");
	val1 = Clavier.lire_int();
	System.out.println ("ecrire le second nombre");
	val2 = Clavier.lire_int();
	type = "quotient";
	if (val2 != 0){
		float resultat = val1 / val2;
		System.out.println ("le resulats de la " + type + " entre " +  val1 + " et " + val2 + " est egale a " + resultat );
	}else{
		System.out.println ("error");
	}

	}
} 

