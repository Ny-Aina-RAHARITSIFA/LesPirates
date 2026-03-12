package cases;

import jeu.*;

public class CaseTornade extends CaseSpeciale {
	public CaseTornade(int numero) {
		super(numero);
	}
	
	@Override
	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de1, De de2) {
		int case1 = joueur1.getPion().getCase();
		int case2 = joueur2.getPion().getCase();
		if ((0<=case1)&&(case1<=30)) {
			joueur1.getPion().setCase(case2);
		}
		if ((0<=case2)&&(case2<=30)) {
			joueur2.getPion().setCase(case1);
		}
	}
	
	@Override
	public String toString() {
		return "Case Tornade 🌪️ : Une tornade apparait soudainement sur l'île.\n"
				+ "Elle emporte les deux pirates et les échanges de place";
	}
}
