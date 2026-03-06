package jeu;

public enum Pirate {
	CAPITAINE_CROCHET("Capitaine Crochet","Rouge"),
	LUFFY("Luffy","Blanc"),
	JACK_SPARROW("Jack Sparrow","Marron"),
	FLAMEHEART("Flameheart","Noir"),
	VICTOR_MACBERNIK("Victor MacBernik","Bleu");
	

	private String chaine;
	private String couleur;
	
	private Pirate (String chaine,String couleur) {
		this.chaine=chaine;
		this.couleur=couleur;
	}

	public String getNom() {
		return chaine;
	}
	
	@Override
	public String toString() {
		return chaine + ",le pion de couleur "+ couleur +".\n";
	}
}