import iut.algo.*;

public class exercice9 {
    public static void main(String[] a) {
    	int n;
        n = new Integer ( a[0] );;
        n= n/2;
        ControleGraphique ct;
        ct = new ControleGraphique();
        ct.setTaille (300,300);
        ct.couleur (Couleur.NOIR);

        for (int j=0;j<n; j++)
        {
       		for(int i=0; i<n ; i++)
        	{
        		ct.rectangleCouleur (50+40*i,50+40*j,70+40*i,70+40*j,Couleur.BLEU);
        		ct.rectangleCouleur (70+40*i,70+40*j,90+40*i,90+40*j,Couleur.BLEU);
        		ct.rectangle (70+40*i,50+40*j,90+40*i,70+40*j);
        		ct.rectangle (50+40*i,70+40*j,70+40*i,90+40*j);
        		
        	}
        }
       
    }    
}        

