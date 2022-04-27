import java.util.*;

public class Defi {
	
	public static String essai;
	
	public static void esquive(Joueur j) {
		
		//timer = 10
		String[] ennonceEsquive = {"YR2_n!Fc", "oZoxhAS9", "8UA48+v0", "afS%vY#K", "I%+KhL#o", "X053Fwj7", "9t9Rz!&E", "Tr=o7&N!", "=bI72Tr9", "xxM&BQ1="};
		
		Random random = new Random();
		
		int value = random.nextInt((ennonceEsquive.length-1)- 0 + 1) + 0;
		System.out.println(value);
		System.out.println("Vous devez taper la chaine de 8 caractères suivante en moins de 10 secondes! ");
		Date startDate = new Date();
		Scanner rep = new Scanner(System.in);
		System.out.println("Etes vous prêt ? Go!!! \\n   Chaine : " + ennonceEsquive[value]);
		essai = rep.nextLine();
		rep.close();
		Date endDate = new Date();
		int numSeconds = (int)((endDate.getTime() - startDate.getTime()) / 1000);
		if(numSeconds>11) {
			System.out.println("Vous avez pris trop de temps, vous avez échoué!");
		}
		
		else {
			
		
			if( essai.equals(ennonceEsquive[value])) {	
				Random random1 = new Random();
				int pieceNB = random1.nextInt((10)- 3 + 1) + 3;
				j.gagnerPieces(pieceNB);
				System.out.println("Bravo vous êtes vif! Vous gagnez donc un bon nombre de pièce : " + pieceNB + " . /n Vous pouvez vous déplacer dans une nouvelle salle.");
			}
			else {
				System.out.println("Vous avez échoué vous perdez une vie.");
				j.degat();
				if (j.inventaire[1] == true) {
					armure.utiliseArmure(j);
				}
				
			}
			
		}
	}
	
	
	
	
	
	
	

}