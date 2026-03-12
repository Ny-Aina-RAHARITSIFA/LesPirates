package jeu;

public interface IAffichage {
	void ecrireNom(String joueur);
	void choisirPirate();
	void decrireContexte();
	void afficherCase(int caseA,String joueur,int nbrVie);
	void afficherPirate(int indice,String nom);
	void afficherJoueur(String joueur) ;
	void decrireContexteCase(String pirate,int caseA,String description);
	void afficherResultatDes(int de1,int de2);
	void afficherResultatDe(int de);
	void afficherCoeur(int nbrVie);
	void afficherFinJeu(String joueur);
	void afficherMort(String pirate);
	void afficherPirateArrive(String pirate1, String pirate2);
}
