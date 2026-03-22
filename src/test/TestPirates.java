package test;

import jeu.*;
import cases.*;

public class TestPirates {
	public static void main(String[] args) {
		IAffichage affichage = new AffichageJeu();
		Jeu jeuPirate = new Jeu(affichage);	
		jeuPirate.demarrerJeu();
	}
}
