import java.util.ArrayList;

public class Jeu {
	
	public Zone ZoneActuelle;   //Zone où le joueur est
	
	public Zone[][] carte=new Zone[4][3];	//constructeur de la map du jeu
	public Joueur j = new Joueur("j1");		//constructeur du joueur
	
	public void createMap() {      //  ==>>>> Initialisation du jeu + début
		
		
		ArrayList<String> typeSalleT = new ArrayList<String>();   //creation d'une liste de String contenant le type des salles
		
		for(int i=0; i<5; i++) {
			typeSalleT.add("enigme");     //  ==> ajout de 5 salles énigmes
			
		}
		
		for(int i=0; i<4; i++) {
			typeSalleT.add("defi");         //  ==> ajout de 4 salles défis
			
		}
		
		for(int i=0; i<2; i++) {			//   ==> ajout de 2 salles vides
			typeSalleT.add("vide");
			
		}
		
		typeSalleT.add("marchand");		//   ==> ajout d'une salle marchand
		
		
		
		
		for(int i=0; i<4; i++) {			
			
			for(int j=0; j<3; j++) {			// pour chaque case de la map, assigne une salle aléatoire à cette position
				
		           // genere l'index de la liste en utilisant Math.random()
		            int index = (int)(Math.random() * typeSalleT.size());
		            carte[i][j] = new Zone(typeSalleT.get(index), i, j);   		//POur cette salle la positionne dans la carte avec l'index donné au dessus
		            typeSalleT.remove(typeSalleT.get(index));      //Quand la salle a été assignée, l'enlève de la liste de type salle pour garder le bon nombre de chaque salle.
		            
		          
				
			}
			
		}
		
		
		carte[0][1] = new Zone("vide", 0, 1);   //Les salles de début et de fin doivent être vide, on remplace donc à ces 2 endroits les salles actuelles par des salles de types vides
		carte[3][1] = new Zone("vide", 3, 1);		// Il est donc possible de ne pas avoir de salle marchand lors d'une partie si lors de son assingement elle était sur une des ces 2 salles
		
		this.ZoneActuelle = carte[0][1];  // assigne la zone de départ du joueur.
		
		
		
		// Début jeu
		
		System.out.println("Après un combat acharné contre le terrible sorcier « Wizard », vous vous retrouvez enfermé dans son chateau avec pour seul but de s'enfuir.");
		System.out.println("Au moment de vous mettre le coup de grâce, vous arrivez à rouler et esquiver son attaque. \nVous sottez par la fenêtre et retombez un peu plus bas dans une salle vide et sombre.");
		 System.out.println("C'est le début de votre fuite ! Où souhaitez vous aller ? \n");
		
		Zone.afficheCommande(j, this.ZoneActuelle);   //appelle la fonction AfficheCommande qui permet de choisir son action
	}
	
	
	public void Jouer(Joueur j) {			//fonction qui est appelée après la selection de la sortie
		
		while (j.isVivre() == true) {				//Tant que le joueur est en vie, il peut jouer		
			
			
			if (this.ZoneActuelle.typeSalle.equals("vide")) {     //Si la salle dans laquelle il est rentré est une salle vide alors appelle la fonction AppelleSalleVide
				
				SalleVide.AppelleSalleVide(this.j);
			}
			
			else if (this.ZoneActuelle.typeSalle.equals("enigme")) { //Si la salle dans laquelle il est rentré est une salle enigme alors appelle la fonction charade
				
				Enigme.charade(this.j);
			}
			
			else if (this.ZoneActuelle.typeSalle.equals("defi")) {  //Si la salle dans laquelle il est rentré est une salle défi alors appelle la fonction esquive
				
				Defi.esquive(this.j);
			}
			
			else {
				
				Marchand.marchand(this.j);  //appelle la salle marchand si le typedeSalle est marchand
			}
			
			if (this.ZoneActuelle.typeSalle == "marchand") {
				Zone.afficheCommande(j, this.ZoneActuelle);		// on veut garder la salle marchand meme après y etre passé.
			}
			
			else {
				
			
			this.ZoneActuelle = new Zone("vide", ZoneActuelle.posX, ZoneActuelle.posY); //A chaque fin de salle, on enleve le défi ou l'enigme au cas où besoin d'y repasser.
			Zone.afficheCommande(j, this.ZoneActuelle);    //A la fin de l'action réalisé dans la salle, appelle automatiqument la fonction commande
			
			}
			
		}
		
		System.out.println("Après une longue tentative de fuite, vous finissez par perdre votre dernière vie... Tout s'écroule devant vous, vous fermez les yeux à jamais...");
	
		System.out.println("Merci d'avoir joué à la fuite du Miagiste !!!! ");   // CONDITION D'ECHEC SI LE JOUEUR EST MORT ====> FIN PARTIE
	}
	
	

}
