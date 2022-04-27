import java.util.*;

public class SalleVide {
	
	
	public static void AppelleSalleVide(Joueur j) {
		
		System.out.println("Vous arrivez dans une salle vide ! Il y a un gros tonneau dans le coin de la salle. ");
		
		Scanner rep = new Scanner(System.in);
		System.out.println("Souhaitez vous l'ouvrir ? [OUI]/[NON]");		//choix du joueur sur action suivante
	    String rep1 = rep.next();
	    rep.close();
	    
	    if (rep1 == "NON") 
	    {
	    	
	    	System.out.println("Vous continuez votre aventure en passant à coté de ce tonneau!"); 		//fin salle vide  => retour à Choix Commande
	    	
	    }
	    
	    else 
	    {
	    	
	    	Random random = new Random();
	    	int value = random.nextInt((3)- 0 + 1) + 0;				//aléatoire pour savoir si chance ou malchance
	    	
	    	if (value ==0) 
	    	{   //   1/4 chance d'obtenir un fragment de clé car rare 
	    		
	    		System.out.println("Vous ouvrez le coffre, vous y trouvez un fragment de clé");     
	    		j.gagnerFragmentsCle();										//gain fragment de clé
	    		
	    	}
	    	
	    	else 
	    	{
	    		
	    		System.out.println("Vous ouvrez le coffre, un nain y surgit muni d'un poignard et vous dépouille de 5 pièces");
	    		j.perdrePieces(3);			//   3/4 chance de malchance 
	    		
	    	}
	    	
	    }
	}

}
