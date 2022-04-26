import java.util.Scanner;

public class Marchand {
	
	private static boolean t = true;
	private static boolean b = true;
	private static boolean p = true;
	private static boolean a = true;
	
	public static void marchand(Joueur j) {
		
		System.out.println("Bonjour et bienvenue dans la salle marchande, c'est une 'safe' zone dans laquelle vous pouvez acheter des objets qui pourront vous aider dans votre fuite !");
		
		
		System.out.println("Voici les objets proposés et leurs prix : \n"
				+ "Torche : 5 pièces"
				+ "Baton Miagique : 15 pièces"
				+ "Potion : 20 pièces"
				+ "Armure : 25 pièces");
			
	}
	
	public static void acheterObjet(Joueur j) {
		String choix;
		
		do {
			Scanner rep = new Scanner(System.in);
	        System.out.println("Choisissez un objet : T = Torche, B = Baton Miagique, P = Potion, A = Armure\n"
	        		+ "Q pour quitter");
	        choix = rep.next();
	        rep.close();
	        if(choix == "T" && Marchand.t) {
<<<<<<< Updated upstream
	        	j.acheteTorche();
=======
	        	torche.acheteTorche(j);
>>>>>>> Stashed changes
	        	Marchand.t = false;
	        }
	        else if(choix == "B" && Marchand.b) {
	        	baton.acheteBaton(j);
	        	Marchand.b = false;
	        }
	        else if(choix == "P" && Marchand.p) {
	        	potion.achetePotion(j);
	        	Marchand.p = false;
	        }
	        else if(choix == "A" && Marchand.a) {
	        	armure.acheteArmure(j);
	        	Marchand.a = false;
	        }
	        else {
	        	System.out.println("Objet indisponible\n");
	        }
			
		} while(choix != "Q");
	
	}
	
}
