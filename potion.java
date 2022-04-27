public class potion extends Objet{
	public potion() {
		super("Potion de vie", 10);
	}
	
	public static void achetePotion(Joueur j) {
		if(j.getNbPieces() >= 10) {
			j.perdrePieces(10);
			j.inventaire[2] = true;
		}
		else
			System.out.println("Vous n'avez pas assez de pièce pour acheter la potion de vie");
	}
	
	public static void utilisePotion(Joueur j) {
		System.out.println("Vous utilisez la potion pour gagner une vie!");
		j.gagnerVie();
		j.inventaire[2] = false;
	}
}
