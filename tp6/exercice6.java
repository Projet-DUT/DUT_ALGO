import iut.algo.*;
public class exercice6 {
 public static void main(String args[]) {
  char grille[][] = new char[3][3];
  char joueur = 'X';
    for (int i = 0; i < 3; i++) {

   for (int j = 0; j < 3; j++) {
    grille[i][j]=' ';

   }

  }
  while (!findepartie(grille, joueur)) {
   //Affichage du tableau par appel à la méthode dédiée
   afficherGrille(grille);

   jouer(grille, joueur);
   if (joueur == 'X') joueur = 'O';
   else joueur = 'X';
  }
 }


 public static void afficherGrille(char gr[][]) {
  for (int i = 0; i < 3; i++) {

   for (int j = 0; j < 3; j++) {
    Console.print("|"+gr[i][j]);

   }	
   Console.print("|\n");

  }
 }
 public static boolean findepartie(char gr[][], char joueur) {
  int pionlig = 0, pioncol = 0;
  if(gr[0][0]==joueur && gr[1][1]==joueur && gr[2][2]==joueur)
   		{
			messageDeFin(gr, joueur);
			return true;
		} 
		if(gr[0][2]==joueur && gr[1][1]==joueur && gr[2][0]==joueur)
   		{
			messageDeFin(gr, joueur);
			return true;
		}
  for (int i = 0; i < 3; i++) {

   for (int j = 0; j < 3; j++) {

    if (gr[i][j] == joueur) {
     pionlig++;
    } else {
     pionlig = 0;
    }

    if (gr[j][i] == joueur) {
     pioncol++;
    } else {
     pioncol = 0;
    }

    if (pionlig == 3 || pioncol == 3) {
     Console.print("Le Joueur" + joueur + "a gagne!");
     return true;
    }

   }
    pionlig = 0;
    pioncol = 0;
  }
  return false;
 }

 public static void jouer(char gr[][], char joueur) {
  boolean coupValide = false;
  int lig, col;
  while (!coupValide) {
   Console.print("Ligne");
   lig = Clavier.lire_int();
   Console.print("col");
   col = Clavier.lire_int();
   lig--;
   col--;

   if (gr[lig][col] == ' ') {
    if (lig < 0 || col < 0 || lig > 2 || col > 2) break;
    coupValide = true;
    gr[lig][col] = joueur;
   }

  }

 }
}
