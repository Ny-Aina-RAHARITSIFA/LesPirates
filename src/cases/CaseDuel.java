package cases;

import jeu.*;

public class CaseDuel extends CaseSpeciale {
	public CaseDuel(int numero) {
		super(numero);
	}
	@Override
	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de1, De de2) {
		affichage.decrireCaseDuel();
		affichage.afficherJoueur(joueur1.getNom());
		affichage.afficherNextLine();
		int lance1 = joueur1.lancerDes(affichage,de1,de2);
		affichage.afficherJoueur(joueur2.getNom());
		affichage.afficherNextLine();
		int lance2 = joueur2.lancerDes(affichage, de1, de2);
		if(lance1 > lance2) {
			joueur2.getPion().changerVie(-1);
			affichage.afficherResultatDuel(joueur2.getPion().getPirate().getNom());
		}
		else if(lance1 < lance2) {
			joueur1.getPion().changerVie(-1);
			affichage.afficherResultatDuel(joueur1.getPion().getPirate().getNom());
		}
	}
}
