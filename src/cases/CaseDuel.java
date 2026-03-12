package cases;

import jeu.*;

public class CaseDuel extends CaseSpeciale {
	public CaseDuel(int numero) {
		super(numero);
	}
	@Override
	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de1, De de2) {
		affichage.afficherJoueur(joueur1.getNom());
		int lance1 = joueur1.lancerDes(affichage,de1,de2);
		affichage.afficherJoueur(joueur2.getNom());
		int lance2 = joueur2.lancerDes(affichage, de1, de2);
		if(lance1 > lance2) {
			joueur2.getPion().changerVie(-1);
			System.out.println("OUUUUF , le pirate "+joueur2.getPion().getPirate().getNom()+" a reçu un coup violent.\n"
					+ "Il perd une vie !");
		}
		else if(lance1 < lance2) {
			joueur1.getPion().changerVie(-1);
			System.out.println("OUUUUF , le pirate "+joueur1.getPion().getPirate().getNom()+" a reçu un coup violent.\n"
					+ "Il perd une vie !");
		}
	}
	
	@Override
	public String toString() {
		return "Case Duel ⚔ : Les deux pirates vont devoir s'affronter ! \n"
				+ "Gare au perdant, car celui-ci perdra une vie !";
	}
}
