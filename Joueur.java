public class Joueur {

    	private String nom;
	private int nbVies;
	private int nbPieces;
	private int posY;
	private int posX;
	private int nbFragmentsCle;
	private boolean[] inventaire;
	private boolean vivre;

	// Constructeur Joueur
    public Joueur(String nom, int y, int x){
    	this.nom = nom;
    	this.nbVies = 3;
    	this.nbPieces = 0;
    	this.posY = y;
    	this.posX = x;
    	this.nbFragmentsCle = 0;
    	this.inventaire = new boolean[5];
    	this.vivre = true;
    	
    	for(int i = 0; i < inventaire.length; i++) {
    		inventaire[i] = false;
    	}
    }
    
    
    public void gagnerPieces(int pieces) {
    	this.nbPieces = this.nbPieces + pieces;
    }
    
    public void perdrePieces(int prix) {
    	if(this.nbPieces < prix) {
    	}
    	else 
    		this.nbPieces = this.nbPieces - prix;
    }
    
    public void gagnerFragmentsCle() {
    	this.nbFragmentsCle = this.nbFragmentsCle + 1;
    }
    
    public void mourir() {
    	this.vivre = false;
    }
    
    public void degat() {
    	if (this.nbVies >= 1)
    		this.nbVies = this.nbVies - 1;
    	else
    		this.mourir();
    }
    
    public void gagnerVie() {
    	this.nbVies = this.nbVies + 1;
    }
    
    public int getPosY() {
    	return posY;
    }
    
    public int getPosX() {
    	return posX;
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbVies() {
		return nbVies;
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
}
