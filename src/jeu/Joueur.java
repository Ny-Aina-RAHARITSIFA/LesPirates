package jeu;

public class Joueur {
	private String nom;
	private Pion pion;
	
	public Joueur (String nom, Pion pion) {
		this.nom=nom;
		this.pion=pion;
	}
	
	public String getNom() {
		return nom;
	}
	
	public Pion getPion() {
		return pion;
	}
	
	public void deplacerPion(int deplacement) {
		int caseActuelle = pion.getCase();
		int caseFin = caseActuelle + deplacement;
		if(caseFin>30) {
			caseFin = 30 - (caseFin - 30);
		}
		pion.setCase(caseFin);
	}
	
	public int lancerDes(IAffichage affichage,De de1,De de2) {
		de1.lancer();
		de2.lancer();
		affichage.afficherResultatDes(de1.getResultat(),de2.getResultat());
		return de1.getResultat()+ de2.getResultat();
	}
}
