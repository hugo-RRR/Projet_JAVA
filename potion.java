public class potion extends Objet{
	public potion() {
		super("Potion de vie", 20);
	}
	
	public static void achetePotion() {
		Joueur.perdrePieces(10);
	}
	
	public void utilisePotion() {
		System.out.println("Vous utilisez la potion pour gagner une vie!");
		Joueur.gagnerVie();
	}
}
