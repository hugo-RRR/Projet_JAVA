public class Joueur {

    private String nom;					//Classe Joueur et ses attributs
	private int nbVies;
	private int posY;
	private int posX;
	private int nbPieces;
	private int nbFragmentsCle;
	boolean[] inventaire;            //possède un inventaire de boolean pour les objets qu'il possède
	private boolean vivre;				//si true ==> joueur vivant

	
	
	// Constructeur Joueur
    public Joueur(String nom){
    	this.nom = nom;
    	this.nbVies = 3;
    	this.nbPieces = 0;								//Constructeur de la classe Joueur
    	this.nbFragmentsCle = 0;
    	this.inventaire = new boolean[4];			
    	this.vivre = true;
    	
    	
    	
    	for(int i = 0; i < inventaire.length; i++) {
    												// 0 = torche, 1 = armure, 2 = potion, 3 = baton
    		inventaire[i] = false;  			//Au début ne possède aucuns objets donc false dans l'inventaire
    	}
    	
    }
    
    
    public void gagnerPieces(int pieces) {        //fonction pour gagner des pièces
    	this.nbPieces = this.nbPieces + pieces;
    }
    
    public void perdrePieces(int prix) {          //fonction qui fait perdre des pièces
    	if(this.nbPieces < prix) {
    		System.out.println("Vous n'avez pas assez de pièce sur vous");
    	}
    	else 
    		this.nbPieces = this.nbPieces - prix;
    }
    
    public void gagnerFragmentsCle() {						//fragments de clés ++
    	this.nbFragmentsCle = this.nbFragmentsCle + 1;
    }
    
    public void mourir() {
    	this.vivre = false;				//Si vivre passe false ==> joueur mort : fin partie
    }
    
    public void degat() {
    	if (this.nbVies >= 2)
    		this.nbVies = this.nbVies - 1;			//Perdre une vie, si il tombe à une vie, ne peux plus perdre de vie sinon mort
    	else
    		this.mourir();
    }
    
    public void gagnerVie() {
    	this.nbVies = this.nbVies + 1;
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;																	//setters et getters nécéssaires
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


	public boolean isVivre() {
		return vivre;
	}

	public void setVivre(boolean vivre) {
		this.vivre = vivre;
	}
	
	
}
