package Class;

import java.util.Vector;

/**
* Classe abstraite (interface) Individu
* Stocke le score personnel de l'individu 
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
* @see Applicatif.MyInd
*/
public abstract class Individu {
	
	private double score;

	/**
	 * M�thode abstraite evaluer
	 * Calcul le score de l'individu courant
	 * @return Double : Score de l'individu
	 */
	public abstract double evaluer();
	
	/**
	 * M�thode abstraite getGene
	 * Retourne un g�ne de l'individu
	 * @param idx : index du g�ne � retourner
	 * @return Integer : g�ne de l'individu
	 */
	public abstract Integer getGene(int idx);

	/**
	 * Retourne le score d'adaptation de l'individu
	 * @return Double : score d'adaptation de l'individu
	 */
	public double getScore() {

		return score;
	}

	/**
	 * Set le score d'adaptation de l'individu
	 * @param score : nouveau score d'adaptation de l'individu
	 */
	public void setScore(double score) {

		this.score = score;
	}
	
	/**
	 * V�rifie si ind est identique � l'individu courant
	 * @param ind : individu � comparer
	 * @return Boolean : true si les deux individus sont identiques false sinon
	 */
	public Boolean isEqual(Individu ind) {

		return this.getGene(0) == ind.getGene(0) && this.getGene(1) == ind.getGene(1) && this.getScore() == ind.getScore();
	}
	
	public abstract void setGene(int idx, int value);

}
