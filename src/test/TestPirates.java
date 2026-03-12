package test;

import jeu.*;
import cases.*;

public class TestPirates {
	public static void main(String[] args) {
		PlateauJeu plateau = new PlateauJeu();
		IAffichage affichage = new AffichageJeu();
		Jeu jeuPirate = new Jeu(affichage,plateau);
		
		CaseDuel caseD1 = new CaseDuel(5);
		CaseDuel caseD2 = new CaseDuel(7);
		CaseDuel caseD3 = new CaseDuel(10);
		CaseDuel caseD4 = new CaseDuel(13);
		CaseDuel caseD5 = new CaseDuel(20);
		CaseDuel caseD6 = new CaseDuel(25);
		CaseDuel caseD7 = new CaseDuel(29);
		CaseDuel caseD8 = new CaseDuel(28);
		CaseDuel caseD9 = new CaseDuel(11);
		CaseDuel caseD10 = new CaseDuel(8);
		CaseDuel caseD11 = new CaseDuel(12);
		CaseDuel caseD12 = new CaseDuel(23);
		CaseTornade caseTo1 = new CaseTornade(15);
		CaseTornade caseTo2 = new CaseTornade(27);
		
		plateau.ajouterCaseSpeciale(caseD1, 5);
		plateau.ajouterCaseSpeciale(caseD2, 7);
		plateau.ajouterCaseSpeciale(caseD10, 8);
		plateau.ajouterCaseSpeciale(caseD3, 10);
		plateau.ajouterCaseSpeciale(caseD9, 11);
		plateau.ajouterCaseSpeciale(caseD11, 12);
		plateau.ajouterCaseSpeciale(caseD4, 13);
		plateau.ajouterCaseSpeciale(caseTo1, 15);
		plateau.ajouterCaseSpeciale(caseD5, 20);
		plateau.ajouterCaseSpeciale(caseD12, 23);
		plateau.ajouterCaseSpeciale(caseD6, 25);
		plateau.ajouterCaseSpeciale(caseTo2, 27);
		plateau.ajouterCaseSpeciale(caseD7, 28);
		plateau.ajouterCaseSpeciale(caseD8, 29);
		
		jeuPirate.demarrerJeu();
	}
}
