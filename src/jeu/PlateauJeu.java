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
