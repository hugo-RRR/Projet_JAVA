public class armure extends Objet{
	
	public armure() {
		super("Armure", 25);
	}
	
	public static boolean acheteArmure() {
		Joueur.perdrePieces(25);
		return true;
	}
	
	public int utiliseArmure() {
		System.out.println("Vous utilisez l'armure pour ne pas perdre de vie!");
		return Joueur.getNbVies();
	}
}
