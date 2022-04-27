public class potion extends Objet{
	public potion() {
		super("Potion de vie", 10);
	}
	
	public static void achetePotion(Joueur j) {
		
		if(j.getNbPieces() >= 10) 
		{
			//vérfication que le joueur possède bien assez de pièce
			j.perdrePieces(10);
			j.inventaire[2] = true;                  //true ==> le joueur possède l'objet
			
		}
		
		else
		{
			
			System.out.println("Vous n'avez pas assez de pièce pour acheter la potion de vie");
			
		}
		
	}
	
	public static void utilisePotion(Joueur j) {
		
		System.out.println("Vous utilisez la potion pour gagner une vie!");
		j.gagnerVie();									//utilisation de la potion ==> +1 vie
		j.inventaire[2] = false;	
		//Remet à false car objet utilisé
	}
	
}
