import iut.algo.*;
public class Illusion2 {
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
        ct.couleur ( Couleur.BLEU_CLAIR);
        ct.cercleCouleur (150,150,20, Couleur.BLEU_CLAIR);
        ct.cercleCouleur (200,200,20, Couleur.BLEU_CLAIR);
        ct.cercleCouleur (150,200,20, Couleur.BLEU_CLAIR);
        ct.cercleCouleur (200,150,20, Couleur.BLEU_CLAIR);
	ct.rectangleCouleur (140,140,210,210, Couleur.BLEU_CLAIR);
	ct.rectangleCouleur (130,150,160,200, Couleur.BLEU_CLAIR);
	ct.rectangleCouleur (130,150,160,200, Couleur.BLEU_CLAIR);
	ct.rectangleCouleur (150,130,200,160, Couleur.BLEU_CLAIR);
	ct.rectangleCouleur (200,150,220,200, Couleur.BLEU_CLAIR);
	ct.rectangleCouleur (150,200,200,220, Couleur.BLEU_CLAIR);
	ct.couleur (Couleur.VERT_FONCE);
	ct.ligne (150,130,200,130);
	ct.ligne (220,150,220,200);
	ct.ligne (130,150,130,200);
	ct.ligne (150,220,200,220);
}
}




