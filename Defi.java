package Classes;

import java.util.*;
import java.io.*;

public class Defi {
	
	public float duree = 10;
	public static String essai;
	
	public static void esquive() {
		
		//timer = 10
		String[] ennonceEsquive = {"YR2_n!Fc", "oZoxhAS9", "8UA48+v0", "afS%vY#K", "I%+KhL#o", "X053Fwj7", "9t9Rz!&E", "Tr=o7&N!", "=bI72Tr9", "xxM&BQ1="};
		
		Random random = new Random();

		int value = random.nextInt(ennonceEsquive.length + 0) + 0;
		System.out.println(value);
		System.out.println("Vous devez taper la chaine de 8 caractères suivante en moins de 10 secondes! ");
		
		Scanner rep = new Scanner(System.in);
		System.out.println("Etes vous prêt ? Go!!! \\n   Chaine : " + ennonceEsquive[value]);
		essai = rep.next();
		if( essai == ennonceEsquive[value]) {
			System.out.println("Bravo vous êtes vif! Vous gagnez donc un bon nombre de pièce. /n Vous pouvez vous déplacer dans une nouvelle salle." );	
			
		}
		else {
			System.out.println("Vous avez échoué vous perdez une vie.");
		}
	}
	
	
	
	
	
	
	

}

//  