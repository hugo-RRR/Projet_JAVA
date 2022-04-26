public class baton extends Objet {
	
	public baton() {
		super("Baton Miagique", 15);
	}
	
	public static void acheteBaton(Joueur j) {
		if(j.getNbPieces() >= 15) {
			j.perdrePieces(15);
			j.inventaire[3] = true;
		}
		else
			System.out.println("Vous n'avez pas assez de pièce pour acheter le baton");
	}
	
	public void utiliseBaton(Joueur j) {
		System.out.println("Vous utilisez le baton miagique pour changer d'énigme!");
		Enigme.charade();
	}
}
