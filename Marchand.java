import java.util.Scanner;

public class Marchand {
	
	private static boolean t = true;
	private static boolean b = true;
	private static boolean p = true;
	private static boolean a = true;
	
	public static void marchand(Joueur j) {
		
		String decision;
		System.out.println("Bonjour et bienvenue dans la salle marchande, c'est une 'safe' zone dans laquelle vous pouvez acheter des objets qui pourront vous aider dans votre fuite !");
		
		
		System.out.println("Voici les objets proposés et leurs prix : \n"
				+ "Torche : 5 pièces"
				+ "Baton Miagique : 15 pièces"
				+ "Potion : 20 pièces"
				+ "Armure : 25 pièces");
		
		System.out.println("Souhaitez vous acheter quelque chose ? : oui = O / non = N");
		Scanner rep = new Scanner(System.in);
        decision = rep.nextLine();
        rep.close();
        if (decision.equals("O")) {
        	acheterObjet(j);
        	
        }
        
        else {
        	
        	System.out.println("Vous decidez de ne rien acheter, vous dites au revoir au marchand et vous repartez");
        }
			
	}
	
	public static void acheterObjet(Joueur j) {
		String choix;
		
		do {
			Scanner rep = new Scanner(System.in);
	        System.out.println("Choisissez un objet : T = Torche, B = Baton Miagique, P = Potion, A = Armure\n"
	        		+ "Q pour quitter");
	        choix = rep.nextLine();
	        rep.close();
	        
	        
	        if(choix.equals("T") && Marchand.t==true) {
	        	torche.acheteTorche(j);
	        	Marchand.t = false;
	        }
	        else if(choix.equals("B") && Marchand.b==true) {
	        	baton.acheteBaton(j);
	        	Marchand.b = false;
	        }
	        else if(choix.equals("P") && Marchand.p==true) {
	        	potion.achetePotion(j);
	        	Marchand.p = false;
	        }
	        else if(choix.equals("A") && Marchand.a==true) {
	        	armure.acheteArmure(j);
	        	Marchand.a = false;
	        }
	        else {
	        	System.out.println("Objet indisponible\n");
	        }
			
		} while(choix != "Q");
	
	}
	
}
