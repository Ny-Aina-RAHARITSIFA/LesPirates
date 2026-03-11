package jeu;

import java.util.Scanner;
import cases.*;

public class Jeu {
	private int nbJoueurs;
	private Pion[] pions = new Pion[5];
	private Joueur[] joueurs = new Joueur[2];
	private PlateauJeu plateau;
	private IAffichage affichage;
	
	public Jeu (IAffichage affichage,PlateauJeu plateau) {
		this.plateau = plateau;
		this.affichage = affichage;
		nbJoueurs = 2;
		pions[0] = new Pion(Pirate.CAPITAINE_CROCHET);
		pions[1] = new Pion(Pirate.FLAMEHEART);
		pions[2] = new Pion(Pirate.JACK_SPARROW);
		pions[3] = new Pion(Pirate.LUFFY);
		pions[4] = new Pion(Pirate.VICTOR_MACBERNIK);
	}
	
	public void demarrerJeu() {
		boolean choixOK = true;
		Scanner clavier = new Scanner(System.in);
		affichage.ecrireNom("joueur 1");
		String nom = clavier.nextLine();
		affichage.choisirPirate();
		int choix = clavier.nextInt();
		creerJoueur(nom,pions[choix-1]);
		affichage.ecrireNom("joueur 2");
		String nom2 = clavier.nextLine();
		affichage.choisirPirate();
		int choix2 = clavier.nextInt();
		if (choix == choix2){
			System.out.println("Zut, ce pirate est déjà pris !! Le joueur ne peut pas être créé");
			choixOK = false;
		}
		else {
			creerJoueur(nom2,pions[choix2-1]);
		}
		
		if (choixOK) {
			int joueurActuel = 0;
			boolean joueurKO = false;
			boolean jeuFini = false;
			while (!joueurKO && !jeuFini) {
				Joueur joueur = joueurs[joueurActuel];
				int caseActuelle = donnerCaseActuelle(joueur);
				affichage.afficherCase(caseActuelle,joueur.getNom(),joueur.getPion().getVie());
				clavier.next();
				int sommeDes = joueur.lancerDes(affichage,plateau.getDe1(),plateau.getDe2());
				joueur.deplacerPion(sommeDes);
				caseActuelle = donnerCaseActuelle(joueur);
				String pirate = joueur.getPion().getPirate().getNom();
				affichage.decrireContexteCase(pirate,caseActuelle, plateau.getCase(caseActuelle).toString());
				plateau.getCase(caseActuelle).appliquerEffet(affichage,joueurs[0],joueurs[1],plateau.getDe1(), plateau.getDe2());
				joueurActuel = (joueurActuel + 1)%2;
				jeuFini = estFini();
				joueurKO = sontATerre();
			}
			
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
					affichage.afficherPirateArrive(joueurs[0].getPion().getPirate().getNom());
					affichage.afficherFinJeu(joueurs[0].getNom());
				}
				else {
					affichage.afficherPirateArrive(joueurs[1].getPion().getPirate().getNom());
					affichage.afficherFinJeu(joueurs[1].getNom());
				}
			}
			clavier.close();
					
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
