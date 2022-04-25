import java.util.*;
import java.io.*;

public class Enigme {
	
	public float duree = 60;
	public static String essai;
	
	public static void charade() {
		
		
		String[] ennonce = {"Mon premier est la capitale de l'italie. /n Mon second est une voyelle. /n Mon troisième est un fleuve d’Europe. /n Mon tout est une plante qui sent bon.",
				"Dans mon premier, on peut parfois trouver des vaches. /n Mon deuxième est le contraire de « oui ». /n Tout le monde possède mon tout.",
				"Mon premier se trouve au milieu du visage. /n Mon deuxième est un métal. /n Mon troisième est un célèbre canari que Gros Minet aimerait bien manger. /n Mon tout a été une reine d’Égypte.",
				"Les trains finissent leur voyage dans mon premier. /n Mon deuxième augmente chaque année. /n Mon tout est un espace réservé généralement aux voitures.", 
				"Mon premier ouvre les portes. /n Mon deuxième est vital. /n Mon troisième garde les troupeaux. /n Mon tout est un grand personnage historique.",
				"Mon premier apparaît si l’on mélange rapidement de l’eau et du savon. /n Mon deuxième est une raison de mettre son linge à laver. /n Mon tout est parfois à la mode.",
				"Mon premier est un arbre de la forêt qui possède des feuilles en aiguilles persistantes. /n Mon deuxième est un récipient servant à transporter des matières. /n Mon tout est utilisé par les peintres.",
				"Mon premier est un métal précieux. /n Mon deuxième est là où vit le ou la concierge. /n Mon tout sert à connaître l’heure.",
				"Mon premier recouvre le corps. /n Dans la gare, on marche sur mon second. /n On a besoin de mon troisième pour faire des phrases. /n On fait mon quatrième pour attacher deux cordes. /n Mon tout est un jeu vidéo.",
				"Mon premier est au milieu de la figure. /n Mon deuxième est le contraire d'habillé. /n Mon troisième dirige les bateaux en mer la nuit. /n Mon tout est une fleur sur l’eau."};
		String[] reponse = {"romarin", "prénom", "Néfertiti", "garage", "Cléopâtre", "moustache", "pinceau", "horloge", "Pokémon", "nénuphar"};
		
		Random random = new Random();

		int value = random.nextInt((ennonce.length-1)- 0 + 1) + 0;
		System.out.println(value);
		System.out.println("L'énnoncé de la charade est : \n" + ennonce[value]);
		
		Scanner rep = new Scanner(System.in);
		System.out.println("Quel est votre réponse ? Attention à bien écrire les mots et mettre les accents nécessaires! ");
		essai = rep.next();
		rep.close();
		if( essai == reponse[value]) {
			System.out.println("Bravo vous avez reussi l'énigme, vous gagnez donc un fragment de clé. /n Vous pouvez vous déplacer dans une nouvelle salle." );	
			
		}
		else {
			System.out.println("Mauvaise réponse! Il vous reste 1 essai!");
			Scanner rep2 = new Scanner(System.in);
			System.out.println("Quel est votre réponse ? Attention à bien écrire les mots et mettre les accents nécessaires! ");
			essai = rep2.next();
			rep2.close();
			if( essai == reponse[value]) {
				System.out.println("Bravo vous avez reussi l'énigme, vous gagnez donc un fragment de clé. /n Vous pouvez vous déplacer dans une nouvelle salle." );	

			}
			else {
				System.out.println("Vous avez échoué vous perdez une vie.");
			}
		}
	}
	
	
	
	
	
	
	

}