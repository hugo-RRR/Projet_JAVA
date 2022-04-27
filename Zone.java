import java.util.Scanner;

public class Zone extends Jeu {
	
    public String typeSalle;
    public int posX;
    public int posY;
    public String reponse;
    
	public String toString() {
		return "Zone : Il s'agit d'une salle de type " + typeSalle + ". Elle se situe en posX = " + posX + " et en posY = " + posY + ".\n";
	}


	public Zone(String typeSalle, int posX, int posY) {
		super();
		this.typeSalle = typeSalle;
		this.posX = posX;
		this.posY = posY;
		
	}
	
	
	public void SortieNord() {
		
		if (this.posX-1<0 && this.posY==1) {
			
			System.out.println("La fenêtre par laquelle vous êtes passé est trop haute pour l'atteindre, il faut trouver une autre sortie : ");
			Zone.DemandSortie(this);
			
		} 
		
		else if(this.posX-1<0 && this.posY!=1) {
		
			System.out.println("Il n'y a pas de sortie dans cette direction ! Vous vous prenez le mur. ");
			Zone.DemandSortie(this);
			
		} 
		
		else {
			
			this.ZoneActuelle = carte[this.posX-1][this.posY];
			super.Jouer(j);
		}
		
	}
	
	
	
	public void SortieSud() {
		
		if (this.posX+1>3 && this.posY==1) {
			
			System.out.println("Voulez-vous vraiment sortir du chateau ?? Si vous n'avez pas toutes les clés vous serez piégé à jamais.");
			Scanner rep = new Scanner(System.in);
		    System.out.println("Voulez-vous vraiment rentrer dans la pièce finale ? O = oui / N = non");
		    String reponse = rep.nextLine();
		    
		    if (reponse.equals("O")) {
		    	FinDuJeu(j);
		    }
		    
		    else {
		    	
		    	System.out.println("Vous rebroussez chemin pour poursuivre votre aventure.");
		    	Zone.DemandSortie(this);
		    	
		    }
			
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
			super.Jouer(j);
			
		}
		
	}
	
	public void SortieOuest() {
		
		if (this.posY-1<0) {
			
			System.out.println("Il n'y a pas de sortie dans cette direction ! Vous vous prenez le mur.");
			Zone.DemandSortie(this);
			
		} 
		
		else {
			
			this.ZoneActuelle = carte[this.posX][this.posY-1];
			super.Jouer(j);
			
		}
		
	}
	
	
	
	public void SortieEst() {
		
		if (this.posY+1>2) {
			
			System.out.println("Il n'y a pas de sortie dans cette direction ! Vous vous prenez le mur.");
			Zone.DemandSortie(this);
			
		} 
		
		else {
			
			this.ZoneActuelle = carte[this.posX][this.posY+1];
			super.Jouer(j);
			
		}
		
	}
	
	
	public static void afficheCommande(Joueur j, Zone z) {
		
		Scanner rep = new Scanner(System.in);
		System.out.println("Si vous voulez afficher votre position :  A = Afficher ");
	    System.out.println("Si vous voulez afficher votre inventaire : I = Inventaire");
	    System.out.println("Si vous voulez utiliser un objet : O = Objet");
	    System.out.println("Si vous vous voulez poursuivre votre chemin : S = Suite");
	    
	    String reponse = rep.nextLine();
	    
	    if(reponse.equals("A")) {
	    	System.out.println(z);
	    	Zone.afficheCommande(j, z);
	    }
	    
	    else if(reponse.equals("I")) {
	    	for (int i = 0; i<4; i++) {
	    		
	    		boolean value = j.inventaire[i];
	    		if (value == true) {
	    			
	    			if (i == 0) {
	    				System.out.println("Vous possedez une torche dans votre inventaire.\n");
	    			}
	    			else if (i==1) {
	    				System.out.println("Vous possedez une armure dans votre inventaire.\n");
	    			}
	    			else if (i==2) {
	    				System.out.println("Vous possedez une potion de vie dans votre inventaire.\n");
	    			}
	    			else if (i==3) {
	    				System.out.println("Vous possedez un baton miagique dans votre inventaire.\n");
	    			}
	    			
	    		} else {
	    			
	    			if (i == 0) {
	    				System.out.println("Vous ne possedez pas la torche dans votre inventaire. \n");
	    			}
	    			else if (i==1) {
	    				System.out.println("Vous ne possedez pas l'armure dans votre inventaire. \n");
	    			}
	    			else if (i==2) {
	    				System.out.println("Vous ne possedez pas la potion de vie dans votre inventaire. \n");
	    			}
	    			else if (i==3) {
	    				System.out.println("Vous ne possedez pas le baton miagique dans votre inventaire. \n");
	    			}
	    		}
	    		
	    	}
	    	System.out.println("Il vous reste également : " + j.getNbVies() + " vies et " + j.getNbPieces() + " pièces.\n");
	    	Zone.afficheCommande(j, z);
	    }
	    
	    if (reponse.equals("O")) {
	    	
	    		
	    		if (j.inventaire[0] == true) {

	    				Scanner rep1 = new Scanner(System.in);
	    			    System.out.println("Voulez-vous utiliser votre torche ? O = oui / N = non");
	    			    String reponse1 = rep1.nextLine();
	    			    
	    			    if (reponse1.equals("O")) {
	    			    	torche.utiliseTorche(j);
	    			    	
	    			    }
	    			}
	    			
	    			else if (j.inventaire[2] == true) {
	    				
	    				Scanner rep2 = new Scanner(System.in);
	    			    System.out.println("Voulez-vous utiliser votre potion de vie ? O = oui / N = non");
	    			    String reponse2 = rep2.nextLine();
	    			    
	    			    if (reponse2.equals("O")) {
	    			    	potion.utilisePotion(j);
	    			    }
	    			}
	    		
	    			else {
	    				
	    				System.out.println("Vous ne possedez aucun objet que vous pouvez utiliser maintenant !\n");
	    			}
	    		
	    		
	    	Zone.afficheCommande(j, z);
	    }
	    
	    if(reponse.equals("S")) {
	    	Zone.DemandSortie(z);
	    }
	    
		
	}
	
	public static void DemandSortie(Zone z) {
		
	    Scanner rep1 = new Scanner(System.in);
	    System.out.println("Choisissez une sortie : N = Nord, S = Sud, E = Est, O = Ouest");
	    String reponse1 = rep1.nextLine();
	    
	    if(reponse1.equals("N")) {
	    	z.SortieNord();
	    }
	    else if(reponse1.equals("S")) {
	    	z.SortieSud();
	    }
	    else if(reponse1.equals("E")) {
	    	z.SortieEst();
	    }
	    else if(reponse1.equals("O")) {
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
	
	public static void FinDuJeu(Joueur j) {
		
		System.out.println("Vous rentrez dans la pièce finale, vous voyez une porte majestueuse en face de vous ! Vous ressentez derrière cette porte une brise d'air, c'est l'air exterieur ! Vous êtes tout proche de la liberté !!");
		System.out.println("Cependant en refermant la porte par laquelle vous êtes entré vous déclenchez un piège, la porte d'entrée se verrouille et vous observez des murs qui petit à petit se referme vers vous.");
		System.out.println("Si vous ne vous dêpechez pas vous allez finir écrasé entre ces 2 murs. Vous vous ruez vers la porte de sortie et sortez votre trousseau de clés.");
		System.out.println("Vous observez la porte et remarquez qu'il y a 3 emplacements pour mettre les fragments de clés et l'ouvrir.");
		
		if (j.getNbFragmentsCle() >= 3) {
			
			System.out.println("Vous comptez le nombre de fragments de clés, il y en a : " + j.getNbFragmentsCle() + ". Vous vous empressez de les faire coullisser dans la porte.");
			System.out.println("La porte s'ouvre enfin, vous êtes libre, vous déguerpissez à vive allure sans vous retourner en direction de votre repère.");
			
			
			System.out.println("Merci d'avoir joué à la fuite du Miagiste !!!! ");
		}
		
		else {
			
			System.out.println("Vous comptez le nombre de fragments de clés, il y en a : " + j.getNbFragmentsCle() + ". Vous vous rendez compte que vous n'en avez pas assez, mais c'est déjà trop tard.");
			System.out.println("Votre sort est scellé, votre corps s'écroule de desespoir et vous attendez votre mort en regardant les murs se refermer sur vous...");
			
			System.out.println("Merci d'avoir joué à la fuite du Miagiste !!!! ");
		}
		
	}
	

}
