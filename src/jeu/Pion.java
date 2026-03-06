package jeu;

public class Pion {
	private Joueur joueur;
	private int caseActuelle = 0;
	private int nbVie = 5;
	private Pirate pirate;
	
	public Pion(Pirate pirate) {
		this.pirate = pirate;
	}
	
	public int getCase() {
		return caseActuelle;
	}
	
	public void setCase(int nouvelleCase) {
		caseActuelle = nouvelleCase;
	}
	
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
	
	public int getVie() {
		return nbVie;
	}
	
	public Pirate getPirate() {
		return pirate;
	}
	
	public Joueur getJoueur() {
		return joueur;
	}
	
	public boolean estATerre() {
		return nbVie == 0;
	}
	
	public void changerVie(int vie) {
		int nouvelleVie = nbVie + vie;
		if (nouvelleVie < 0) {
			nouvelleVie = 0;
		}
		else if(nouvelleVie > 5) {
			nouvelleVie = 5;
		}
		nbVie = nouvelleVie;
	}
}
