/** Un premier programme
  * date : le 07/09/2016
  * @author: Erwan Leboucher <erwanleboucher@gmail.com>
  */
import iut.algo.*;

public class mystere {
	public static void main(String[] arg){
	int  a, b;

	System.out.println ("donnez a");
	a = Clavier.lire_int();
        System.out.println ("donnez b"); 
	b = Clavier.lire_int();
	a = a+b;
	b = a-b;
	a = a - b;
	System.out.println ("a: " + a +" b: " + b); 
	}
} 

