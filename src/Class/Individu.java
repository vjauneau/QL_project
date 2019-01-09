package Class;

import java.util.Vector;

/**
* Classe abstraite ( interface ) Individu
* Stocke le score personnel de l'individu 
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
*/
public abstract class Individu {
	
	private double score;
		
	public abstract double evaluer();

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}
	
	// public abstract Vector<Integer> createIndividu();
	

}
