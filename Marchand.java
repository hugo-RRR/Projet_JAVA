import java.util.Scanner;

public class Marchand {
	
	private static boolean t = true;
	private static boolean b = true;			//objets proposés par le marchand => true pour "en stock"
	private static boolean p = true;
	private static boolean a = true;
	
	public static void marchand(Joueur j) {
		
		String decision;
		System.out.println("Bonjour et bienvenue dans la salle marchande, c'est une 'safe' zone dans laquelle vous pouvez acheter des objets qui pourront vous aider dans votre fuite !");
		
		
		System.out.println("Voici les objets proposés et leurs prix : \n"
				+ "Torche : 5 pièces"
				+ "Baton Miagique : 15 pièces"
				+ "Potion : 10 pièces"
				+ "Armure : 15 pièces");
		
		System.out.println("Souhaitez vous acheter quelque chose ? : oui = O / non = N");
		Scanner rep = new Scanner(System.in);
        decision = rep.nextLine();
        rep.close();
        
        if (decision.equals("O")) {
        	acheterObjet(j);  		//appelle la fonction pour choisir d'acheter
        	
        }
        
        else {
        	
        	System.out.println("Vous decidez de ne rien acheter, vous dites au revoir au marchand et vous repartez"); //fin de la salle marchand, le joueur repars
        }
			
	}
	
	public static void acheterObjet(Joueur j) {
		String choix;
		
		do {
			Scanner rep = new Scanner(System.in);
	        System.out.println("Choisissez un objet : T = Torche, B = Baton Miagique, P = Potion, A = Armure\n"
	        		+ "Q pour quitter");
	        choix = rep.nextLine();   //choix du joueur
	        rep.close();
	        
	        
	        if(choix.equals("T") && Marchand.t==true) {
	        	torche.acheteTorche(j);							//Si le choix est la torche et que l'objet n'a pas encore été acheté alors on peut l'acheter
	        	Marchand.t = false;							//on ne peut pas acheter 2 fois un item au marchand donc plus en stock ==> false
	        }
	        else if(choix.equals("B") && Marchand.b==true) {
	        	baton.acheteBaton(j);
	        	Marchand.b = false;
	        }
	        else if(choix.equals("P") && Marchand.p==true) {			//même chose pour les autres objets
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
