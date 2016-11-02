import iut.algo.*;

public class exo12 {

        public static void main(String[] arg){
            int age;
            char sante, accident;
            String type;


            System.out.println("quel est votre age ?");
            age = Clavier.lire_int();
            
            System.out.println("Etes vous en bonne santé");
            sante = Clavier.lire_char();

            System.out.println("Avez vous deja eu un accident");
            accident = Clavier.lire_char();

            if (age>30) {
                type = "contrat A"
            }else{
                type = "contrat b"
            }
            if (accident=='n' && sante=='o'){
                System.out.println("accepté pour " + type);
                else if (accident=='o' )
            }
        }
}
