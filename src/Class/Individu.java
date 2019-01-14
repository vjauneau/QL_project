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
	
	public abstract Integer getGene(int idx);
	
	public Boolean equal(Individu i) {
		if(this.getGene(0) == i.getGene(0) && this.getGene(1) == i.getGene(1) && this.getScore() == i.getScore()) {
			return true;
		}
		else return false;
	}
	
	
	
	// public abstract Vector<Integer> createIndividu();
	

}
