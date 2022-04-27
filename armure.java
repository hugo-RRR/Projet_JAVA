public class armure extends Objet{
	
	public armure() {   			//Objet armure est une classe fille de objet 
		super("Armure", 15);       	//On lui attribut un nom et un prix
	} 
	
	public static void acheteArmure(Joueur j) {  
											//fonction qui permet d'acheter l'armure
		if(j.getNbPieces() >= 15) 
		{				// Si on a assez de pièce, on peut acheter l'objet et donc être débité
			
			j.perdrePieces(15);
			j.inventaire[1] = true;		
			// POur savoir si on possède un objet on utilise un tableau de boolean : true = possédé / false = non possédé
		}
		
		else
		{
			
			System.out.println("Vous n'avez pas assez de pièce pour acheter l'armure");
			
		}
			
	}
	
	public static void utiliseArmure(Joueur j) {
			
		System.out.println("Vous possedez cependant une armure sur vous, vous ne prenez pas de dégats!");
		j.gagnerVie();                   // l'armure permet de ne pas perdre de vie, ici on appelle la fonction gagnerVie juste après avoir perdu la vie, cela revient à la même chose que ne pas perdre de vie.
		j.inventaire[1] = false;    // on dit que notre joueur ne possède plus l'objet dans son inventaire
		
	}
	
}
