package jeu;

public class AffichageJeu implements IAffichage {
	public void ecrireNom(String joueur) {
		System.out.print("---"+joueur+"---\n"+joueur+", Entre ton nom :");
	}
	
	public void choisirPirate() {
		System.out.print("\nChoisis ton pirate : ");
	}
	
	public void decrireContexte() {
		System.out.print("La mer a rejeté deux pirates sur une île sauvage. \n"
				+ "Prisonniers de ces terres hostiles, ils n'ont qu'un destin possible : un seul quittera l'île. "
				+ "L'autre deviendra une légende perdue dans le sable.");
	}
	
	public void afficherJoueur(String joueur) {
		System.out.println("Au tour du joueur "+joueur);
	}
	
	
	public void afficherCase(int caseActuelle, String joueur,int nbrVie) {
		System.out.println("\n---DEBUT DE L'ACTION---");
		afficherJoueur(joueur);
		afficherCoeur(nbrVie);
		System.out.println("\nCase Actuelle du joueur : "+caseActuelle+"\n"
				+joueur+" lance les dés !");
	}
		
	public void afficherPirate(int indice,String nom) {
		System.out.print("\n"+indice+") "+ nom);
	}
	
	public void decrireContexteCase(String pirate,int caseActuelle,String description) {
		System.out.println("\nLe pirate "+pirate +" arrive à la case numero :"+caseActuelle);
		System.out.println("Description de la case : "+description);
	}
	
	public void afficherResultatDes(int de1,int de2) {
		System.out.println("Resultat du premier de : "+de1+
				"\nResultat du deuxieme de : "+de2+
				"\nPour un total de "+(de1+de2));
	}
	
	public void afficherResultatDe(int de) {
		System.out.println("Resultat du dé : "+de);
	}
	
	public void afficherCoeur(int nbrVie) {
		for(int i = 0;i<nbrVie;i++) {
			System.out.print("❤");
		}
		System.out.print(" "+nbrVie+"\n");
	}
	
	public void afficherFinJeu(String joueur) {
		System.out.println("Bravo ! le joueur "+joueur+" a gagné !\n-------FIN DU JEU------");
	}
	
	
	public void afficherMort(String pirate) {
		System.out.println("Les dieux de la mer réclame une âme... " + pirate + " rejoint malheureusement leur royaume.");
	}
	
	
	public void afficherPirateArrive(String pirate1, String pirate2) {
		System.out.println("Le pirate "+pirate1+" a finalement réussi à quitter cette île maudite au détriment de "+pirate2
				+" qui ne retrouvera malheureusement jamais ses terres.");
	}
}
