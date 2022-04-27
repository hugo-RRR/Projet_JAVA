import java.util.Random;

public class torche extends Objet{
	
	public torche() {
		super("Torche", 5);
	}
	
	public static void acheteTorche(Joueur j) {
		if(j.getNbPieces() >= 5) {
			j.perdrePieces(5);
			j.inventaire[0] = true;
		}
		else
			System.out.println("Vous n'avez pas assez de pièce pour acheter la torche");
		
	}
	
	public static void utiliseTorche(Joueur j) {
		System.out.println("Vous utilisez la torche pour voir plus clair dans les recoins de la salle");
		Random random = new Random();
    	int value = random.nextInt((3)- 0 + 1) + 0;
    	
    	if (value ==0 || value ==2) {
    		System.out.println("Vous fouillez tous les recoins sans rien trouver");
    	}
    	
    	else if (value == 1 ) {
    		System.out.println("Vous fouillez la salle et trouvez dans un coin quelques pièces recouvertes de poussière");
    		j.gagnerPieces(5);
    	}
    	
    	else {
    		
    		System.out.println("En fouillant un coin de la salle vous trouvez une cachette derrière une pierre d'un mur et vous y trouvez un sac de pièces");
    		j.gagnerPieces(15);
    		
    	}
    	j.inventaire[0] = false;
	}
}
 