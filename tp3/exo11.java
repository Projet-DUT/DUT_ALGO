import iut.algo.*;

public class exo11 {


	public static void main(String[] arg){
		char nom;
		int temp;
		 	
	  	System.out.println ("premier lettre du nom");
	    nom = Clavier.lire_char();
	    System.out.println ("donnez temp");
	    temp = Clavier.lire_int();
	    if (nom == 'e' || nom == 'E'){
	    	if (temp < 0){ 
	    	 System.out.println ("solide");
	    	}else{ 
	    		if (temp >= 0 && temp <= 100 ){
	    			System.out.println ("liquide");
	    			}else{
	    				if (temp > 100){
	    					System.out.println ("gazeux");
	    					}
	    				}
	    		
	    		}
	    	}
	    if (nom == 'a' || nom == 'A'){
	    	if (temp < -209.9){ 
	    	 System.out.println ("solide");
	    	}else{ 
	    		if (temp >= -209.9 && temp <= -196 ){
	    			System.out.println ("liquide");
	    			}else{
	    				if (temp > -196){
	    					System.out.println ("gazeux");
	    					}
	    				}
	    		
	    		}
	    	}
	    if (nom == 'o' || nom == 'O'){
	    	if (temp < 1063){ 
	    	 System.out.println ("solide");
	    	}else{ 
	    		if (temp >= 1063 && temp <= 2660 ){
	    			System.out.println ("liquide");
	    			}else{
	    				if (temp > 2660){
	    					System.out.println ("gazeux");
	    					}
	    				}
	    		
	    		}
	    	}
	    	if ( nom == 'o' || nom == 'O' || nom == 'A' || nom == 'a' || nom == 'e' || nom == 'E'){
			}else{	    	
				System.out.println ("error");
	    	}
	}
}
	    
