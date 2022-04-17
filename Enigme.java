package Classes;

import java.util.Scanner;

public class Enigme {
	
	public float duree;
	public String essai;
	public String reponse;
	public String ennonce [];
	public int nbEssai;
	
	

	public Enigme(float duree, String typeEnigme, String essai, String reponse, String[] ennonce, int nbEssai) {
		super();
		this.duree = 60;
		this.essai = 2;
		this.reponse = reponse;
		this.ennonce = ennonce;
		this.nbEssai = nbEssai;
	}



	public float getDuree() {
		return duree;
	}


	public void setDuree(float duree) {
		this.duree = duree;
	}


	public String getTypeEnigme() {
		return typeEnigme;
	}



	public void setTypeEnigme(String typeEnigme) {
		this.typeEnigme = typeEnigme;
	}


	public String getEssai() {
		return essai;
	}


	public void setEssai(String essai) {
		this.essai = essai;
	}



	public String getReponse() {
		return reponse;
	}



	public void setReponse(String reponse) {
		this.reponse = reponse;
	}



	public String[] getEnnonce() {
		return ennonce;
	}



	public void setEnnonce(String[] ennonce) {
		this.ennonce = ennonce;
	}



	public int getNbEssai() {
		return nbEssai;
	}



	public void setNbEssai(int nbEssai) {
		this.nbEssai = nbEssai;
	}



	public static void repondre(String essai) {
		
		Scanner rep = new Scanner(System.in);
		System.out.println("Quel est votre réponse ? ");
		essai = rep.next();
		if( essai == reponse) {
			System.out.println("Bravo vous avez reussi l'énigme, vous gagnez donc un fragment de clé. /n Vous pouvez vous déplacer dans une nouvelle salle." );
			
		}
		return;
	}
	
	
	
	
	

}

//  