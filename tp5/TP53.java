/** Les types de base
 *  TP 5
 *  @author Votre nom
 *  @version 1 du jj/mm/aaaa
 */

public class TP53
{

   public static void main(String [] args)
   {
      /*-----------------------------*/
      /* Déclaration des variables   */
      /*-----------------------------*/

      char unCaractere;
      int  unEntier;

      /*-----------------------------*/
      /* Instructions                */
      /*-----------------------------*/

      unCaractere = 'A';
      System.out.println ( "\nEtape 1 :");
      System.out.println ( unCaractere );


      unEntier = unCaractere;
      System.out.println ( "\nEtape 2 :");
      System.out.println ( unEntier );


      System.out.println ( "\nEtape 3 :" );
      System.out.println ( (char)(unCaractere + 1) );


      System.out.println ( "\nEtape 4 :\n" + (char)(unCaractere + 1) );

   }
}
