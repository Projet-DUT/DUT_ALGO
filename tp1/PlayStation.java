import iut.algo.*;
public class PlayStation {
	public static void main(String[] a){
		ControleGraphique ct;
	        ct = new ControleGraphique();
        	ct.setTaille (400,400);
		ct.couleur (Couleur.NOIR);
		ct.ligne (150,50,250,50);
		ct.ligne (250,50,250,150);
		ct.ligne (250,150,350,150);
		ct.ligne (350,150,350,250);
		ct.ligne (250,250,350,250);
		ct.ligne (250,250,250,350);
		ct.ligne (250,350,150,350);
		ct.ligne (150,250,150,350);
		ct.ligne (50,250,150,250);
		ct.ligne (50,150,50,250);
		ct.ligne (50,150,150,150);
		ct.ligne (150,150,150,50);
		ct.couleur (Couleur.BLEU_ROYAL);
		ct.ligne (170,270,230,330);
		ct.ligne (170,330,230,270);
		ct.couleur (Couleur.VERT);
		ct.ligne (170,130,230,130);
		ct.ligne (200,70,170,130);
		ct.ligne (200,70,230,130);
		ct.couleur (Couleur.VIOLET);
		ct.rectangle (70,170,130,230);
		ct.couleur (Couleur.ROUGE);
		ct.cercle (300,200 ,30);
	}
}
