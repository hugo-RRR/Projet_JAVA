public class armure extends Objet{
	
	public armure() {
		super("Armure", 25);
	}
	
	public static void acheteArmure(Joueur j) {
		if(j.nbPieces >= 25) {
			j.perdrePieces(25);
			j.inventaire[1] = true;
		}
		else
			System.out.println("Vous n'avez pas assez de pièce pour acheter l'armure");
	}
	
	public int utiliseArmure(Joueur j) {
		System.out.println("Vous utilisez l'armure pour ne pas perdre de vie!");
		return j.getNbVies();
	}
}
