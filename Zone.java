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
			Zone.DemandSortie(this);
			
		} 
		
		else if(this.posX-1<0 && this.posY!=1) {
		
			System.out.println("Il n'y a pas de sortie dans cette direction ! Vous vous prenez le mur. ");
			Zone.DemandSortie(this);
			
		} 
		
		else {
			
			this.ZoneActuelle = carte[this.posX-1][this.posY];
			super.Jouer();
		}
		
	}
	
	
	
	public void SortieSud() {
		
		if (this.posX+1>3 && this.posY==1) {
			
			System.out.println("Voulez-vous vraiment sortir du chateau ?, si vous n'avez pas toutes les clés vous serez piégé à jamais. ");
			//FinDuJeu();
			
		} 
		
		else if (this.posX+1>3 && this.posY!=1) {
			
			System.out.println("Il n'y a pas de sortie dans cette direction ! Vous vous prenez le mur.");
			Zone.DemandSortie(this);
			
		} 
		
		else {
			
			System.out.println(this.posX+1);
			System.out.println(this.posY);
			System.out.println(carte[this.posX+1][this.posY]);
			super.ZoneActuelle = super.carte[this.posX+1][this.posY];
			super.Jouer();
			
		}
		
	}
	
	public void SortieOuest() {
		
		if (this.posY-1<0) {
			
			System.out.println("Il n'y a pas de sortie dans cette direction ! Vous vous prenez le mur.");
			Zone.DemandSortie(this);
			
		} 
		
		else {
			
			this.ZoneActuelle = carte[this.posX][this.posY-1];
			super.Jouer();
			
		}
		
	}
	
	
	
	public void SortieEst() {
		
		if (this.posY+1>2) {
			
			System.out.println("Il n'y a pas de sortie dans cette direction ! Vous vous prenez le mur.");
			Zone.DemandSortie(this);
			
		} 
		
		else {
			
			this.ZoneActuelle = carte[this.posX][this.posY+1];
			super.Jouer();
			
		}
		
	}
	
	
	
	public static void DemandSortie(Zone z) {
		Scanner rep = new Scanner(System.in);
		System.out.println("Si vous voulez afficher votre position :  A ");
	    System.out.println("Choisissez une sortie : N = Nord, S = Sud, E = Est, O = Ouest");
	    String reponse = rep.nextLine();
	    if(reponse.equals("A")) {
	    	System.out.println(z);
	    	Zone.DemandSortie(z);
	    }
	    else if(reponse.equals("N")) {
	    	z.SortieNord();
	    }
	    else if(reponse.equals("S")) {
	    	z.SortieSud();
	    }
	    else if(reponse.equals("E")) {
	    	z.SortieEst();
	    }
	    else if(reponse.equals("O")) {
	    	z.SortieOuest();
	    }
	    else {
	    	System.out.println("Erreur de saisie, veuillez réessayer\n");
	    	Zone.DemandSortie(z);
	    }
    			
	}
	
	public Zone ZoneJoueur() {
		
		return this.ZoneActuelle;
		
	}
	

}
