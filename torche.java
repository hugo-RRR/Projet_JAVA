public class torche extends Objet{
	
	public torche() {
		super("Torche", 5);
	}
	
	public static void acheteTorche() {
		Joueur.perdrePieces(5);
	}
	
	public void utiliseTorche() {
		System.out.println("Vous utilisez la torche pour débloquer la salle!");	
	}
}
