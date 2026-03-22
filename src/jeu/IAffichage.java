package jeu;

public interface IAffichage {
	String ecrireNom(String joueur);
	int choisirPirate();
	void decrireContexte();
	void afficherCase(int caseA,String joueur,int nbrVie);
	void afficherPirate(int indice,String nom);
	void afficherErreur();
	void afficherJoueur(String joueur) ;
	void afficherResultatDuel(String pirate);
	void decrireContexteCase(String pirate,int caseA);
	void afficherResultatDes(int de1,int de2);
	void afficherResultatDe(int de);
	void afficherCoeur(int nbrVie);
	void afficherFinJeu(String joueur);
	void afficherMort(String pirate);
	void afficherPirateArrive(String pirate1, String pirate2);
	void afficherNextLine();
	void decrireCase(int numero);
	void decrireCaseDuel();
	void decrireCaseTornade();
	void decrireCaseSoin();
}
