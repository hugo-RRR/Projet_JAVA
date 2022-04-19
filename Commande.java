package Classes;

import java.util.Scanner;

public class Commande {
	
	public static String reponse;
	

	public static void DemandSortie() {
		Scanner rep = new Scanner(System.in);
	    System.out.println("Choisissez une sortie : N = Nord, S = Sud, E = Est, O = Ouest");
	    reponse = rep.next();
	    rep.close();
	    if(reponse == "N") {
	    	SortieNord();
	    }
	    else if(reponse == "S") {
	    	SortieSud();
	    }
	    else if(reponse == "E") {
	    	SortieEst();
	    }
	    else if(reponse == "O") {
	    	SortieOuest();
	    }
	    else {
	    	System.out.println("Erreur de saisie, veuillez réessayer\n");
	    	DemandSortie();
	    }
    			
	}
}
