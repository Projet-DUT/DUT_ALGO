/** Exo11 
  * date : le 07/09/2016
  * @author: Erwan Leboucher <erwanleboucher@gmail.com>
  */
import iut.algo.*;

public class exo11 {


  public static void main(String[] arg){

    /*-------------*/
    /*Données      */
    /*-------------*/
    int dist_agglo, dist_route , dist_autoroute , dist_total;
    double temps_total , v_moyenne , v_agglo , v_route , v_autoroute ;

    /*-------------*/
    /* Instruction */
    /*-------------*/
    v_agglo = 29;
    v_route = 75;
    v_autoroute = 110;

    System.out.println ("donnez distance agglo");
    dist_agglo = Clavier.lire_int();

    System.out.println ("donnez distance route ");
    dist_route = Clavier.lire_int();

    System.out.println ("donnez distance autoroute");
    dist_autoroute = Clavier.lire_int();



    dist_total =  dist_agglo + dist_route + dist_autoroute;
    System.out.println ("distance total: " + dist_total + " km " );


    temps_total = dist_agglo / v_agglo + dist_route / v_route + dist_autoroute / v_autoroute;
    System.out.println ("temps total: " + (int)(temps_total %24)   + " h "  );
    
    java.text.DecimalFormat df = new java.text.DecimalFormat("0.##");
    v_moyenne  = dist_total / temps_total;
    System.out.println ("vitesse moyenne: " + df.format (v_moyenne) + " km/h ");

  }

}
