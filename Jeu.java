import java.util.ArrayList;

public class Jeu {
	
	public Zone ZoneActuelle;
	
	public Zone[][] carte=new Zone[4][3];
	public Joueur j = new Joueur("j1");
	
	public void createMap() {
		
		
		ArrayList<String> typeSalleT = new ArrayList<String>();
		
		for(int i=0; i<4; i++) {
			typeSalleT.add("enigme");
			typeSalleT.add("defi");
		}
		for(int i=0; i<3; i++) {
			typeSalleT.add("vide");
			
		}
		typeSalleT.add("marchand");
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<3; j++) {
				
		           // generating the index using Math.random()
		            int index = (int)(Math.random() * typeSalleT.size());
		            carte[i][j] = new Zone(typeSalleT.get(index), i, j);
		            System.out.println("La salle crée en est : carte " + i + ";" + j + " : "
                               + typeSalleT.get(index));
		            typeSalleT.remove(typeSalleT.get(index));
		            
		          
				
			}
			
		}
		
		
		carte[0][1] = new Zone("vide", 0, 1);
		carte[3][1] = new Zone("finale", 3, 1);
		
		this.ZoneActuelle = carte[0][1];
		System.out.println(carte[1][1]);
		
		//carte[0][0] = new Zone("Enigme");
		
		
		
		// Début jeu
		
		System.out.println("Vous êtes enfin parvenu dans le chateau, la grille se referme cependant derrière vous");
		System.out.println("Vous êtes dans une salle vide. Où souhaitez vous aller ?");
		System.out.println("fsfsf +" + this.ZoneActuelle);
		Zone.DemandSortie(this.ZoneActuelle);
	}
	
	
	public void Jouer() {
		
		if (this.ZoneActuelle.typeSalle.equals("vide")) {
			
			SalleVide.AppelleSalleVide(this.j);
		}
		
		else if (this.ZoneActuelle.typeSalle.equals("enigme")) {
			
			Enigme.charade();
		}
		
		else if (this.ZoneActuelle.typeSalle.equals("defi")) {
			
			Defi.esquive();
		}
		
		else {
			
			Marchand.marchand();
		}
		
		Zone.DemandSortie(this.ZoneActuelle);
		
		
	}
	
	

}
