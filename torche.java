public class torche extends Objet{
	
	public torche() {
		super("Torche", 5);
	}
	
	public static void acheteTorche(Joueur j) {
		if(j.nbPieces >= 5) {
			j.perdrePieces(5);
			Joueur.inventaire[0] = true;
		}
		else
			System.out.println("Vous n'avez pas assez de pièce pour acheter la torche");
		
	}
	
	public void utiliseTorche() {
		System.out.println("Vous utilisez la torche pour débloquer la salle!");
	}
}
