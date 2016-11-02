/** Un premier programme
  * date : le 07/09/2016
  * @author: Erwan Leboucher <erwanleboucher@gmail.com>
  */
import iut.algo.*;

public class seconde {
	public static void main(String[] arg){
	/*-------------*/
	/*Données      */
	/*-------------*/
	int h, m , s;
	int f;
	/*-------------*/
	/* Instruction */
	/*-------------*/
	System.out.println ("donnez l'Heure");
	h = Clavier.lire_int();
        System.out.println ("donnez les minutes ");
	m = Clavier.lire_int();
        System.out.println ("donner les secondes");
	s = Clavier.lire_int();

	f = h*3600 + m *60 + s;
        System.out.println (f + "seconde");


	}
} 

