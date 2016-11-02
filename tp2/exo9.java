import iut.algo.*;
public class exo9 {
	public static void main(String[] arg) {
		int a, b, c;
		System.out.println ("donnez a");
		a = Clavier.lire_int();
        System.out.println ("donnez b"); 
		b = Clavier.lire_int(); 
		c = a;
		a = b;
		b = c;
		System.out.println ("a: " + a +" b: " + b); 
	}
}
