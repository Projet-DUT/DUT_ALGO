import iut.algo.*;
public class Illusion1 {
public static void main(String[] a){
	ControleGraphique ct;
	ct = new ControleGraphique();
	ct.setTaille (350,350);
	ct.rectangleCouleur ( 100,100,150,150, Couleur.VERT_PALE);
	ct.rectangleCouleur (200,100,250,150,Couleur.VERT_PALE);
	ct.rectangleCouleur (100,200,150,250,Couleur.VERT_PALE);
	ct.rectangleCouleur (200,200,250,250,Couleur.VERT_PALE);
	ct.couleur ( Couleur.VERT_FONCE);
	ct.rectangle (100,100,150,150);
	ct.rectangle (200,100,250,150);
	ct.rectangle (100,200,150,250);
	ct.rectangle (200,200,250,250);
	//machin blanc au milieu
	ct.couleur ( Couleur.BLANC_FLORAL);
	ct.cercleCouleur (150,150,20, Couleur.BLANC_FLORAL);
	ct.cercleCouleur (200,200,20, Couleur.BLANC_FLORAL);
	ct.cercleCouleur (150,200,20, Couleur.BLANC_FLORAL);
	ct.cercleCouleur (200,150,20, Couleur.BLANC_FLORAL);

}
}
