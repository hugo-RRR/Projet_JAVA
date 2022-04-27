import java.util.ArrayList;

public class Jeu {
	
	public Zone ZoneActuelle;
	
	public Zone[][] carte=new Zone[4][3];
	public Joueur j = new Joueur("j1");
	
	public void createMap() {
		
		
		ArrayList<String> typeSalleT = new ArrayList<String>();
		
		for(int i=0; i<5; i++) {
			typeSalleT.add("enigme");
			
		}
		
		for(int i=0; i<4; i++) {
			typeSalleT.add("defi");
			
		}
		
		for(int i=0; i<2; i++) {
			typeSalleT.add("vide");
			
		}
		typeSalleT.add("marchand");
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<3; j++) {
				
		           // generating the index using Math.random()
		            int index = (int)(Math.random() * typeSalleT.size());
		            carte[i][j] = new Zone(typeSalleT.get(index), i, j);
		            //System.out.println("La salle crée en est : carte " + i + ";" + j + " : "
                               //+ typeSalleT.get(index));
		            typeSalleT.remove(typeSalleT.get(index));
		            
		          
				
			}
			
		}
		
		
		carte[0][1] = new Zone("vide", 0, 1);
		carte[3][1] = new Zone("vide", 3, 1);
		
		this.ZoneActuelle = carte[0][1];
		
		
		
		// Début jeu
		
		System.out.println("Après un combat acharné contre le terrible sorcier « Wizard », vous vous retrouvez enfermé dans son chateau avec pour seul but de s'enfuir.");
		System.out.println("Au moment de vous mettre le coup de grâce, vous arrivez à rouler et esquiver son attaque. \nVous sottez par la fenêtre et retombez un peu plus bas dans une salle vide et sombre.");
		 System.out.println("C'est le début de votre fuite ! Où souhaitez vous aller ? \n");
		
		Zone.afficheCommande(j, this.ZoneActuelle);
	}
	
	
	public void Jouer(Joueur j) {
		
		while (j.isVivre() == true) {
			
			
			if (this.ZoneActuelle.typeSalle.equals("vide")) {
				
				SalleVide.AppelleSalleVide(this.j);
			}
			
			else if (this.ZoneActuelle.typeSalle.equals("enigme")) {
				
				Enigme.charade(this.j);
			}
			
			else if (this.ZoneActuelle.typeSalle.equals("defi")) {
				
				Defi.esquive(this.j);
			}
			
			else {
				
				Marchand.marchand(this.j);
			}
			
			Zone.DemandSortie(this.ZoneActuelle);
			
		}
		
		System.out.println("Après une longue tentative de fuite, vous finissez par perdre votre dernière vie... Tout s'écroule devant vous, vous fermez les yeux à jamais...");
	
		System.out.println("Merci d'avoir joué à la fuite du Miagiste !!!! ");
	}
	
	

}
