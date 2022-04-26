import java.util.*;

public class SalleVide {
	
	public static String rep1;
	
	
	
	
	public static void AppelleSalleVide(Joueur j) {
		
		System.out.println("Vous arrivez dans une salle vide ! Il y a un gros tonneau dans le coin de la salle. ");
		Scanner rep = new Scanner(System.in);
		System.out.println("Souhaitez vous l'ouvrir ? [OUI]/[NON]");
	    rep1 = rep.next();
	    rep.close();
	    if (rep1 == "NON") {
	    	System.out.println("Vous continuez votre aventure en passant à coté de ce tonneau!");
	    }
	    
	    else {
	    	
	    	Random random = new Random();
	    	int value = random.nextInt((3)- 0 + 1) + 0;
	    	
	    	if (value ==0) {
	    		System.out.println("Vous ouvrez le coffre, vous y trouvez un fragment de clé");
	    		j.gagnerFragmentsCle();
	    	}
	    	
	    	else {
	    		
	    		System.out.println("Vous ouvrez le coffre, un nain y surgit muni d'un poignard et vous dépouille de 5 pièces");
	    		j.perdrePieces(5);
	    		
	    	}
	    	
	    }
	}

}
