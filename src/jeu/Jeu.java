package jeu;

public class Jeu {
	private int nbJoueurs;
	private Pion[] pions = new Pion[5];
	private Joueur[] joueurs = new Joueur[2];
	private PlateauJeu plateau;
	
	public Jeu (PlateauJeu plateau) {
		this.plateau = plateau;
		nbJoueurs = 2;
		pions[0] = new Pion(Pirate.CAPITAINE_CROCHET);
		pions[1] = new Pion(Pirate.FLAMEHEART);
		pions[2] = new Pion(Pirate.JACK_SPARROW);
		pions[3] = new Pion(Pirate.LUFFY);
		pions[4] = new Pion(Pirate.VICTOR_MACBERNIK);
	}
	
	public void demarrerJeu() {
		
	}
	
	public void creerJoueur(String nom,Pion pion) {
		joueurs[nbJoueurs] = new Joueur(nom,pion);
		nbJoueurs ++;
	}
	
	public int donnerCaseActuelle(Joueur joueur) {
		return joueur.getPion().getCase();
	}
	
	public boolean estFini() {
		boolean fin = false;
		if((donnerCaseActuelle(joueurs[0])==30)||(donnerCaseActuelle(joueurs[1])==30)) {
			fin = true;
		}
		return fin;
	}
}
