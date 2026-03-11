package cases;

import jeu.De;
import jeu.IAffichage;
import jeu.Joueur;

public abstract class CaseSpeciale {
	protected int numero;
	
	protected CaseSpeciale(int numero) {
		this.numero = numero;
	}
	
	public abstract void appliquerEffet(IAffichage affichage,Joueur joueur1,Joueur joueur2,De de1, De de2);
}
