package cases;

import jeu.De;
import jeu.IAffichage;
import jeu.Joueur;

public class Cases extends CaseSpeciale {
	
	public Cases(int numero) {
		super(numero);
	}
	
	@Override
	public void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de1, De de2) {
		affichage.decrireCase(numero);
	}
}
