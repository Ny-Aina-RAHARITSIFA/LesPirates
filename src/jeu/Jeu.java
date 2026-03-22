package jeu;


public class Jeu {
	private int nbJoueurs=0;
	private Pion[] pions = new Pion[5];
	private Joueur[] joueurs = new Joueur[2];
	private PlateauJeu plateau;
	private IAffichage affichage;
	
	public Jeu (IAffichage affichage) {
		this.affichage=affichage;
		plateau = new PlateauJeu();
		pions[0] = new Pion(Pirate.CAPITAINE_CROCHET);
		pions[1] = new Pion(Pirate.FLAMEHEART);
		pions[2] = new Pion(Pirate.JACK_SPARROW);
		pions[3] = new Pion(Pirate.LUFFY);
		pions[4] = new Pion(Pirate.VICTOR_MACBERNIK);
	}
	
	public void demarrerJeu() {
		boolean choixOK = true;
		String nom =affichage.ecrireNom("joueur 1");;
		for(int i = 0;i<pions.length;i++) {
				affichage.afficherPirate(i+1,pions[i].getPirate().toString());
			}
		int choix = affichage.choisirPirate();
		affichage.afficherNextLine();
		creerJoueur(nom,pions[choix-1]);
		String nom2 = affichage.ecrireNom("joueur 2");
		for(int i = 0;i<pions.length;i++) {
			affichage.afficherPirate(i+1,pions[i].getPirate().toString());
		}
		int choix2 = affichage.choisirPirate();
		if (choix == choix2){
			affichage.afficherErreur();
			choixOK = false;
		}
		else {
			affichage.afficherNextLine();
			creerJoueur(nom2,pions[choix2-1]);
		}
		
		if (choixOK) {
			int joueurActuel = 0;
			boolean joueurKO = false;
			boolean jeuFini = false;
			affichage.decrireContexte();
			while (!joueurKO && !jeuFini) {
				Joueur joueur = joueurs[joueurActuel];
				int caseActuelle = donnerCaseActuelle(joueur);
				affichage.afficherCase(caseActuelle,joueur.getNom(),joueur.getPion().getVie());
				affichage.afficherNextLine();
				int sommeDes = joueur.lancerDes(affichage,plateau.getDe1(),plateau.getDe2());
				joueur.deplacerPion(sommeDes);
				caseActuelle = donnerCaseActuelle(joueur);
				String pirate = joueur.getPion().getPirate().getNom();
				affichage.decrireContexteCase(pirate,caseActuelle);
				plateau.getCase(caseActuelle).appliquerEffet(affichage,joueurs[0],joueurs[1],plateau.getDe1(), plateau.getDe2());
				joueurActuel = (joueurActuel + 1)%2;
				jeuFini = estFini();
				joueurKO = sontATerre();
				}
			trouverGagnant(joueurKO);
			}
		}
			
		public void trouverGagnant(boolean joueurKO) {	
			if(joueurKO) {
				if(joueurs[0].getPion().estATerre()) {
					affichage.afficherMort(joueurs[0].getPion().getPirate().getNom());
					affichage.afficherFinJeu(joueurs[1].getNom());
				}
				else {
					affichage.afficherMort(joueurs[1].getPion().getPirate().getNom());
					affichage.afficherFinJeu(joueurs[0].getNom());
				}
			}
			else{
				if(donnerCaseActuelle(joueurs[0])==30) {
					affichage.afficherPirateArrive(joueurs[0].getPion().getPirate().getNom(),joueurs[1].getPion().getPirate().getNom());
					affichage.afficherFinJeu(joueurs[0].getNom());
				}
				else {
					affichage.afficherPirateArrive(joueurs[1].getPion().getPirate().getNom(),joueurs[0].getPion().getPirate().getNom());
					affichage.afficherFinJeu(joueurs[1].getNom());
				}
			}		
		}
	
	public void creerJoueur(String nom,Pion pion) {
		joueurs[nbJoueurs] = new Joueur(nom,pion);
		nbJoueurs ++;
	}
	public int donnerCaseActuelle(Joueur joueur) {
		return joueur.getPion().getCase();
	}
	
	public boolean estFini() {
		return (donnerCaseActuelle(joueurs[0])==30)||(donnerCaseActuelle(joueurs[1])==30);
	}
	public boolean sontATerre() {
		return joueurs[0].getPion().estATerre() || joueurs[1].getPion().estATerre();
	}
}
