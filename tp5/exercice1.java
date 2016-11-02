/** Les types de base
 *  TP 5
 *  @author Votre nom
 *  @version 1 du jj/mm/aaaa
 */

public class exercice1
{

   public static void main(String [] args)
   {
      /*-----------------------------*/
      /* Déclaration des variables   */
      /*-----------------------------*/
      int         unEntier;
      short       unShort;
      float       unFloat;
      double      unDouble;


      /*-----------------------------*/
      /* Instructions                */
      /*-----------------------------*/


      // Affectations simples
      // --------------------

      unShort = 3;
      unShort = -32768;
      unShort = (short)32768;

      unEntier = 5;
      unFloat  = unEntier;
      unDouble = unEntier;

      unFloat  = 3.14f;
      unDouble = 3.14;

      unEntier = (int)unDouble;
      unEntier = (int)unFloat;


      // Conversion dans expresions numériques
      // -------------------------------------

      unEntier = 10;
      unDouble = unEntier / 3;
      System.out.println ( "unDouble = unEntier / 2 ==> unDouble = " + unDouble );

      unEntier = 10;
      unDouble = unEntier / 3.0;
      System.out.println ( "unDouble = unEntier / 2 ==> unDouble = " + unDouble );

      unEntier = 10;
      unEntier = unEntier / 3;
      System.out.println ( "unEntier = unEntier / 2 ==> unEntier = " + unEntier );

      unEntier = 10;
      unEntier = (int)(unEntier / 3.0);
      System.out.println ( "unEntier = unEntier / 2.0 ==> unEntier = " + unEntier );

   }
}
