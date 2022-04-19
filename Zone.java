import java.util.Scanner;

public class Zone extends Jeu {
	
    public String typeSalle;
    public int posX;
    public int posY;
    public String reponse;
    
	public String toString() {
		return "Zone [typeSalle=" + typeSalle + ", posX=" + posX + ", posY=" + posY + "]";
	}


	public Zone(String typeSalle, int posX, int posY) {
		super();
		this.typeSalle = typeSalle;
		this.posX = posX;
		this.posY = posY;
		
	}
	
	
	public void SortieNord() {
		
		if (this.posX-1<0 && this.posY==1) {
			
			System.out.println("Vous ne pouvez plus vous échapper maintenant, la porte est fermée, il faut trouver une sortie : ");
			DemandSortie();
			
		} 
		
		else if(this.posX-1<0 && this.posY!=1) {
		
			System.out.println("Il n'y a pas de sortie dans cette direction ! Vous vous prenez le mur. ");
			DemandSortie();
			
		} 
		
		else {
			
			this.ZoneActuelle = carte[this.posX-1][this.posY];
		}
		
	}
	
	
	
	public void SortieSud() {
		
		if (this.posX+1>3 && this.posY==1) {
			
			System.out.println("Voulez-vous vraiment sortir du chateau ?, si vous n'avez pas toutes les clés vous serez piégé à jamais. ");
			//FinDuJeu();
			
		} 
		
		else if (this.posX+1>3 && this.posY!=1) {
			
			System.out.println("Il n'y a pas de sortie dans cette direction ! Vous vous prenez le mur.");
			DemandSortie();
			
		} 
		
		else {
			
			this.ZoneActuelle = carte[this.posX+1][this.posY];
			
		}
		
	}
	
	public void SortieOuest() {
		
		if (this.posY-1<0) {
			
			System.out.println("Il n'y a pas de sortie dans cette direction ! Vous vous prenez le mur.");
			DemandSortie();
			
		} 
		
		else {
			
			this.ZoneActuelle = carte[this.posX][this.posY-1];
			
		}
		
	}
	
	
	
	public void SortieEst() {
		
		if (this.posY+1>2) {
			
			System.out.println("Il n'y a pas de sortie dans cette direction ! Vous vous prenez le mur.");
			DemandSortie();
			
		} 
		
		else {
			
			this.ZoneActuelle = carte[this.posX][this.posY+1];
			
		}
		
	}
	
	
	
	public void DemandSortie() {
		Scanner rep = new Scanner(System.in);
	    System.out.println("Choisissez une sortie : N = Nord, S = Sud, E = Est, O = Ouest");
	    reponse = rep.next();
	    rep.close();
	    if(reponse == "N") {
	    	SortieNord();
	    }
	    else if(reponse == "S") {
	    	SortieSud();
	    }
	    else if(reponse == "E") {
	    	SortieEst();
	    }
	    else if(reponse == "O") {
	    	SortieOuest();
	    }
	    else {
	    	System.out.println("Erreur de saisie, veuillez réessayer\n");
	    	DemandSortie();
	    }
    			
	}
	

}
