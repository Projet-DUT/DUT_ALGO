import iut.algo.*;
import java.util.Scanner;
public class exercice7_1 {

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		boolean pursue=true;
		char pos ='N';
		int posX=100, posY=100, move,oldX,oldY ;
		ControleGraphique ct;
		ct = new ControleGraphique();
		ct.setTaille( 600,500 ); 

		while (pursue){
		oldX=posX;
		oldY=posY;
         System.out.print("["+ pos+"   " +posX+":"+posY+" ] "+ "       " + "action:");
		  String str = sc.next();
		if (str.charAt(0)=='-') pursue=false;
    		  
		if (Outil.estUnEntier(str)){
	      	move = Integer.parseInt(str);
			System.out.println(move);
     if move > 0 {
			switch(pos){
				case 'N' : posY -= move;
				break;
				case 'E' : posX += move;
				break;
				case 'W' : posX -= move;
				break;
				case 'S' : posY += move;
				break;
			  }
			}
		}else{
				char tmp = str.charAt(0);
				if (tmp == 'D'){
				 switch (pos){
				 	case 'N' : pos = 'E';
				 	break;
				 	case 'E' : pos = 'S';
				 	break;
				 	case 'S' : pos = 'W';
				 	break;
				 	case 'W' : pos = 'N';
				 	break;
				 	
				 }
				}else if (tmp == 'G') {
				switch (pos){
					case 'N' : pos = 'W';
				 	break;
				 	case 'W' : pos = 'S';
				 	break;
				 	case 'S' : pos = 'E';
				 	break;
				 	case 'E' : pos = 'N';
				 	break;
				 	}
				
				}
	
		}
		ct.ligne ( posX, posY, oldX, oldY );
		ct.majDessin();
		}
		
	}
}
