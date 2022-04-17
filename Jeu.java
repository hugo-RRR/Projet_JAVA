package Main;

import java.util.ArrayList;

import Classes.Zone;

public class Jeu {
	
	
	public void createMap() {
		Zone[][] carte=new Zone[4][3];
		
		
		ArrayList<String> typeSalleT = new ArrayList<String>();

		for(int i=0; i<4; i++) {
			typeSalleT.add("enigme");
			typeSalleT.add("vide");
		}
		for(int i=0; i<3; i++) {
			typeSalleT.add("defi");
			
		}
		typeSalleT.add("marchand");
		
		for(int i=0; i<4; i++) {
			
			for(int j=0; j<3; j++) {
				
		           // generating the index using Math.random()
		            int index = (int)(Math.random() * typeSalleT.size());
		            carte[0][0] = new Zone(typeSalleT.get(index));
		            System.out.println("La salle crée en est : carte " + i + ";" + j + " : "
                               + typeSalleT.get(index));
		            typeSalleT.remove(typeSalleT.get(index));
		            
		          
				
			}
			
		}
		
		carte[3][1] = new Zone("finale");
		System.out.println("La salle crée en est : carte " + carte[3][1] );
				
		
		
		
		//carte[0][0] = new Zone("Enigme");
	}

}
