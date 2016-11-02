 public class Etudiant
{
   private String nom;
   private int age;

   public Etudiant(String nom, int age)
   {
      this.nom = nom;
      this.age = age;
   }

   public String toString()
   {
      String s;

      s = "[" + nom + ", " + age + "]";

      return s;
   }

} 
