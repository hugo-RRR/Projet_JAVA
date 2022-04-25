public class baton extends Objet {
	
	public baton() {
		super("Baton Miagique", 15);
	}
	
	public static void acheteBaton() {
		 Joueur.perdrePieces(15);
	}
	
	public void utiliseBaton() {
		System.out.println("Vous utilisez le baton miagique pour changer d'énigme!");
		Enigme.charade();
	}
}
