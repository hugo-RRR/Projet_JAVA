package Classes;

public class Joueur {

    private String nom;
	private int nbVies;
	private int nbPieces;
	private int posY;
	private int posX;
	private int nbFragmentsCles;
	private int[] inventaire;

	// Constructeur Joueur
    public Joueur(String nom, int y, int x){
    	this.nom = nom;
    	this.nbVies = 3;
    	this.nbPieces = 0;
    	this.posY = y;
    	this.posX = x;
    	this.nbFragmentsCles = 0;
    	this.inventaire = new int[10];
    }
    
    public void mourir() {
    	
    }
    
    // Getters Position du joueur
    public int getPosY() {
    	return posY;
    }
    
    public int getPosX() {
    	return posX;
    }
    
    
    public void perteVie(int p) {
    	if (this.nbVies > 0)
    		this.nbVies = this.nbVies - p;
    	else
    		this.mourir();
    }
}
