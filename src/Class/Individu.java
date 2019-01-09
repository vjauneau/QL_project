package Class;

import java.util.Vector;

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
