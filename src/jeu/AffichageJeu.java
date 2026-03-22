package jeu;

import java.util.Scanner;

public class AffichageJeu implements IAffichage {
	private Scanner scanner = new Scanner(System.in);
	
	public String ecrireNom(String joueur) {
		System.out.print("---"+joueur+"---\n"+joueur+", Entre ton nom :");
		return scanner.nextLine();
	}
	
	public int choisirPirate() {
		System.out.print("\nChoisis ton pirate : ");
		return scanner.nextInt();
	}
	
	public void decrireContexte() {
		System.out.print("La mer a rejeté deux pirates sur une île sauvage. \n"
				+ "Prisonniers de ces terres hostiles, ils n'ont qu'un destin possible : un seul quittera l'île. "
				+ "L'autre deviendra une légende perdue dans le sable.");
	}
	
	public void afficherJoueur(String joueur) {
		System.out.println("Au tour du joueur "+joueur);
	}
	
	public void afficherResultatDuel(String pirate) {
		System.out.println("Argh , le pirate "+pirate+" a reçu un coup violent.\n"
				+ "Il perd une vie !");
	}
	
	public void afficherErreur() {
		System.out.println("Zut, ce pirate est déjà pris !! Le joueur ne peut pas être créé");
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
	
	public void decrireContexteCase(String pirate,int caseActuelle) {
		System.out.println("\nLe pirate "+pirate +" arrive à la case numero :"+caseActuelle);
		System.out.println("Description de la case : ");
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
	
	public void afficherNextLine() {
		scanner.nextLine();
	}
	
	public void decrireCase(int numero) {
		if (numero == 30) {
			System.out.println("Dernière case du plateau : vous avez gagné !"); 
		}else {
			System.out.println ("Sur cette case rien ne se passe...");
		}
	}
	
	public void decrireCaseDuel() {
		System.out.println("Case Duel ⚔ : Les deux pirates vont devoir s'affronter ! \n"
				+"Gare au perdant : Celui-i perdra une vie");
	}
	
	public void decrireCaseTornade() {
		System.out.println("Case Tornade 🌪️ : Une tornade apparait soudainement sur l'île.\n"
				+"Elle emporte les deux pirates et les échanges de place.");
	}
	
	public void decrireCaseSoin() {
		System.out.println("Case Soin 💊 : Hohoho !Il est béni des dieux.\n"
				+ "Le pirate a trouvé un kit de soin et regagne une vie.");
	}
}
