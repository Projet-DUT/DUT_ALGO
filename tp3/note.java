import iut.algo.*;

public class note {


  public static void main(String[] arg){
  	double moyenne,note1,note2,note3,note4; 
  	
  	System.out.println ("donnez note1");
    note1 = Clavier.lire_int();
    System.out.println ("donnez note2");
    note2 = Clavier.lire_int();
    System.out.println ("donnez note3");
    note3 = Clavier.lire_int();
    System.out.println ("donnez note3");
    note4 = Clavier.lire_int();
    
    moyenne = (note1 + note2 +note3 +note4)/4;
    if (moyenne <8){	
    	System.out.println ("refusé");
    	}else{
    		if (moyenne >= 8 && moyenne < 10){
    			System.out.println ("oral");
    			}else{
    				if (moyenne >= 10 && note1 >= 10 || note2 >10 || note3 > 10 || note4 > 10){
    					System.out.println ("accepté");
    				}
    			}
    		}
    	}
    }
    
