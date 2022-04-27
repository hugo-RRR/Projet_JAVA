public class armure extends Objet{
	
	public armure() {
		super("Armure", 25);
	}
	
	public static void acheteArmure(Joueur j) {
		if(j.getNbPieces() >= 25) {
			j.perdrePieces(25);
			j.inventaire[1] = true;
		}
		else
			System.out.println("Vous n'avez pas assez de pièce pour acheter l'armure");
	}
	
	public static void utiliseArmure(Joueur j) {
			
		System.out.println("Vous possedez cependant une armure sur vous, vous ne prenez pas de dégats!");
		j.gagnerVie();
		j.inventaire[1] = false;
	}
}
