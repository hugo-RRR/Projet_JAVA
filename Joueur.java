public class Joueur {
	private String nom;
	private static int nbVies;
	private static int nbPieces;
	private int posY;
	private int posX;
	private int nbFragmentsCle;
	private boolean[] inventaire;
	private boolean vivre;
	public static boolean possedeArmure;

	// Constructeur Joueur
    public Joueur(String nom, int y, int x){
    	this.nom = nom;
    	this.nbVies = 3;
    	nbPieces = 0;
    	this.posY = y;
    	this.posX = x;
    	this.nbFragmentsCle = 0;
    	this.inventaire = new boolean[5];
    	this.vivre = true;
    	this.possedeArmure = false;
    	
    	
    	for(int i = 0; i < inventaire.length; i++) {
    		inventaire[i] = false;
    	}
    }
    
    
    public void gagnerPieces(int pieces) {
    	Joueur.nbPieces = Joueur.nbPieces + pieces;
    }
    
    public static void perdrePieces(int prix) {
    	if(Joueur.nbPieces < prix)
    		System.out.println("Nombre de pièces insuffisant");
    	else 
    		Joueur.nbPieces = Joueur.nbPieces - prix;
    }
    
    public void gagnerFragmentsCle() {
    	this.nbFragmentsCle = this.nbFragmentsCle + 1;
    }
    
    public void mourir() {
    	this.vivre = false;
    }
    
    public void degat() {
    	if (Joueur.nbVies >= 1)
    		Joueur.nbVies = Joueur.nbVies - 1;
    	else
    		this.mourir();
    }
    
    public static void gagnerVie() {
    	Joueur.nbVies = Joueur.nbVies + 1;
    }
    
    public boolean possederArmure() {
    	if(armure.acheteArmure())
    		return Joueur.possedeArmure == true;
    	else
    		return Joueur.possedeArmure == false;
    }
    
    public int getPosY() {
    	return posY;
    }
    
	public void setPosY(int posY) {
		this.posY = posY;
	}
    
    public int getPosX() {
    	return posX;
    }

	public void setPosX(int posX) {
		this.posX = posX;
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getNbPieces() {
		return nbPieces;
	}

	public int getNbFragmentsCle() {
		return nbFragmentsCle;
	}
	
	public boolean[] getInventaire() {
		return inventaire;
	}


	public static void setNbVies(int nbVies) {
		Joueur.nbVies = nbVies;
	}
	
	public static int getNbVies() {
		return nbVies;
	}
}
