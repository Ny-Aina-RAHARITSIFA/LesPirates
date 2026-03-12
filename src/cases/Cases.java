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
	}
	@Override
	public String toString() {
		if (numero == 30) {
			return "Dernière case du plateau : vous avez gagné !"; 
		}
		return "Sur cette case rien ne se passe...";
	}
}
