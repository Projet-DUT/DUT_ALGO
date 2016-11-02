/** Les types de base
 *  TP 5
 *  @author Votre nom
 *  @version 1 du jj/mm/aaaa
 */

public class exercice2
{

   public static void main(String [] args)
   {
      /*-----------------------------*/
      /* Déclaration des variables   */
      /*-----------------------------*/

      int     unEntier;
      boolean b1, b2, b3, b4;


      /*-----------------------------*/
      /* Instructions                */
      /*-----------------------------*/

      b1 = 5 < 9;
      b2 = 5 == 9;
      b3 = true;

      b4 = !((b1 && b2) || b3);

      System.out.println( "b1 : " + b1 + "\n" +
                          "b2 : " + b2 + "\n" +
                          "b3 : " + b3 + "\n" +
                          "b4 : " + b4 );

      unEntier = 0;
      b1       =  unEntier==0;
      unEntier = b1 ? 0 : 1 ;

   }
}
