package cases;

import jeu.*;

public class CaseSoin extends CaseSpeciale {
	public CaseSoin(int numero) {
		super(numero);
	}
	@Override
	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de1, De de2) {
		affichage.decrireCaseSoin();
		if(joueur1.getPion().getCase() == numero) {
			joueur1.getPion().changerVie(1);
		}
		else {
			joueur2.getPion().changerVie(1);
		}
	}
}
