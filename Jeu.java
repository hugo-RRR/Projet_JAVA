import java.util.ArrayList;

public class Jeu {
	
	public Zone ZoneActuelle;
	
	Zone[][] carte=new Zone[4][3];
	
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
		carte[0][1] = new Zone("vide", 3, 1);
		carte[3][1] = new Zone("finale", 3, 1);
		System.out.println("La salle crée en est : carte " + carte[3][1] );
				
		System.out.println("La salle crée en est : carte " + carte[2][1] );	
		
		this.ZoneActuelle = carte[0][1];
		
		//carte[0][0] = new Zone("Enigme");
	}
	
	public Zone ZoneJoueur() {
		
		return this.ZoneActuelle;
		SortieNord();
	}
	
	
	

}
