import java.util.*;

public class Defi {
	
	public static String essai;
	
	public static void esquive(Joueur j) {
		
		Random random = new Random();
		String[] ennonceEsquive = {"YR2_n!Fc", "oZoxhAS9", "8UA48+v0", "afS%vY#K", "I%+KhL#o", "X053Fwj7", "9t9Rz!&E", "Tr=o7&N!", "=bI72Tr9", "xxM&BQ1="};
		int value = random.nextInt((ennonceEsquive.length-1)- 0 + 1) + 0;  // On appelle de manière aléatoire la chaine à taper
		
		
		System.out.println("Vous devez taper la chaine de 8 caractères suivante en moins de 10 secondes! ");
		Date startDate = new Date();    // On définit la date de début dans la variable startDate
		
		
		Scanner rep = new Scanner(System.in);
		System.out.println("Etes vous prêt ? Go!!! \\n   Chaine : " + ennonceEsquive[value]); // on récupère la réponse du joueur dans essai
		essai = rep.nextLine();
		rep.close();
		
		
		
		Date endDate = new Date();    //ici on stocke la date de fin du défi
		int numSeconds = (int)((endDate.getTime() - startDate.getTime()) / 1000);   //On calcule le temps passé entre la date de début et la date de fin, il renvoie un nombre de secondes
		
		if(numSeconds>11) 
		{     //Si le temps est dépassé ==> perdu
			
			System.out.println("Vous avez pris trop de temps, vous avez échoué!");
			j.degat();            //le joueur perd une vie
			
			if (j.inventaire[1] == true) 
			{				//si il possède l'objet armure, l'utilise
				
				armure.utiliseArmure(j);            
			}
			
		}
		
		else 
		{       //Si le temps est inférieur à 10 sec :
			
		
			if( essai.equals(ennonceEsquive[value])) 
			{	   // Si bonne réponse ==>
				
				Random random1 = new Random();
				int pieceNB = random1.nextInt((10)- 3 + 1) + 3;           //Système aléatoire de pièces gagnées (entre 3 et 10 pièces)
				j.gagnerPieces(pieceNB);						//Donne le nbPièces gagnées au joueur 
				System.out.println("Bravo vous êtes vif! Vous gagnez donc un bon nombre de pièce : " + pieceNB + " . /n Vous pouvez vous déplacer dans une nouvelle salle.");
			}
			
			else 
			{     // si temps OK mais réponse KO  ==>
				
				System.out.println("Vous avez échoué vous perdez une vie.");
				j.degat();            //le joueur perd une vie
				if (j.inventaire[1] == true) 
				{ 			//si il possède l'objet armure, l'utilise
					
					armure.utiliseArmure(j);
				}
				
				
			}
			
			
		}
		
		
	}
		
	

}