package jeu;

import cases.*;

public class PlateauJeu {
	private int nbCases = 30;
	private int nbCasesSpeciales;
	private De[] des = new De[2];
	private CaseSpeciale[] cases = new CaseSpeciale[30];
	
	public PlateauJeu() {
		nbCasesSpeciales = 0;
		for(int i = 0;i<nbCases;i++) {
			cases[i] = new Cases(i+1);
		}
		des[0] = new De(6);
		des[1] = new De(6);
		
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
		CaseDuel caseD11 = new CaseDuel(23);
		CaseTornade caseTo1 = new CaseTornade(15);
		CaseTornade caseTo2 = new CaseTornade(27);
		CaseSoin caseS1 = new CaseSoin(17);
		CaseSoin caseS2 = new CaseSoin(22);
		
		ajouterCaseSpeciale(caseD1, 5);
		ajouterCaseSpeciale(caseD2, 7);
		ajouterCaseSpeciale(caseD10, 8);
		ajouterCaseSpeciale(caseD3, 10);
		ajouterCaseSpeciale(caseD9, 11);
		ajouterCaseSpeciale(caseD4, 13);
		ajouterCaseSpeciale(caseTo1, 15);
		ajouterCaseSpeciale(caseS1, 17);
		ajouterCaseSpeciale(caseD5, 20);
		ajouterCaseSpeciale(caseS2, 22);
		ajouterCaseSpeciale(caseD11, 23);
		ajouterCaseSpeciale(caseD6, 25);
		ajouterCaseSpeciale(caseTo2, 27);
		ajouterCaseSpeciale(caseD7, 28);
		ajouterCaseSpeciale(caseD8, 29);
	}
	
	public CaseSpeciale getCase(int numero) {
		return cases[numero-1];
	}
	
	public int getNbCasesSpeciales() {
		return nbCasesSpeciales;
	}
	
	public De getDe1() {
		return des[0];
	}
	
	public De getDe2() {
		return des[1];
	}
	
	public void ajouterCaseSpeciale(CaseSpeciale caseS,int numero) {
		nbCasesSpeciales ++;
		cases[numero-1] = caseS;
	}
}
