package jeu;

import java.security.SecureRandom;
import java.util.Random;

public class De {
	private int resultat;
	private int nbFace;
	private Random random;
	
	public De ( int nbface) {
		this.nbFace=nbface;
		try {
			 random = SecureRandom.getInstanceStrong();
		}catch (Exception e) {
			 e.printStackTrace();
		}
	}
	
	public int getResultat() {
		return resultat;
	}
	
	public void lancer() {
		resultat = random.nextInt(nbFace)+1;
	}
}	
