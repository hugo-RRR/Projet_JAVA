public class baton extends Objet {
	
	public baton() {					//fonctionnement pareil que la classe armure
		super("Baton Miagique", 15);
	}
	
	public static void acheteBaton(Joueur j) {
		
		if(j.getNbPieces() >= 15) 
		{
			
			j.perdrePieces(15);
			j.inventaire[3] = true;
			
		}
		
		else
		{
			
			System.out.println("Vous n'avez pas assez de pièce pour acheter le baton");
			
		}
		
	}
	
	
	public static void utiliseBaton(Joueur j) {
		
		System.out.println("Vous utilisez le baton miagique pour changer d'énigme!");
		j.inventaire[3] = false;
		Enigme.charade(j);     //Ici cela permet d'appeler une nouvelle charade, on définit avant que l'on a plus l'objet pour ne plus pouvoir l'utiliser dans le nouvel appel de la méthode charade
		
	}
	
	
}
