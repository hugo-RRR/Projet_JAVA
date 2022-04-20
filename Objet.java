public class Objet {
	
	private String nom;
	private int prix;
	
	public Objet(String name, int prix) {
		this.nom = name;
		this.prix = prix;
	}

	public String getNom() {
		return this.nom;
	}
	
	public int getPrix() {
		return this.prix;
	}
}
