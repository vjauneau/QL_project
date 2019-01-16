package Applicatif;

import java.util.Random;
import java.util.Vector;

import Class.Individu;

/**
* Individu de l'algo g�n�tique, contient la m�thode d'�valuation
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
* @see Individu
*/
public class MyInd extends Individu {

	private Vector<Integer> ind = new Vector<Integer>();
	
	/**
	 * Constructeur d'individu
	 * Ce constructeur prend en param�tre les valeurs des g�nes
	 * sous forme d'integer lors de la cr�ation d'un individus
	 * @param gene1 : g�ne n�1 de l'individu
	 * @param gene2 : g�ne n�2 de l'individu
	 */
	public MyInd(Integer gene1, Integer gene2) {

		this.ind.add(gene1);
		this.ind.add(gene2);
	}
	
	/**
	 * Constructeur d'individu
	 * Constructeur qui prend en param�tres le vecteur de g�ne ind
	 * @param Vector<Integer> ind : g�nes de l'individu � cr�er
	 */
	public MyInd(Vector<Integer> ind) {

		this.ind = ind;
	}
	
	/**
	 * Constructeur d'individu
	 * Constructeur ne prend pas de param�tre
	 */
	public MyInd() {}
	
	/**
	 * Permet de retourner le vecteur de g�nes d'un individu
	 * @return Vector<Integer> : g�nes de l'individu
	 */
	public Vector<Integer> getGenes() {

		return ind;
	}
	
	/**
	 * Permet de retourner un g�ne d'un individu
	 * @return Integer : retourne un g�ne de l'individu
	 */
	public Integer getGene(int idx) {

		return ind.get(idx);
	}
	
	public void setGene(int idx, int value)
	{
		this.ind.set(idx, value);
	}
		
	/**
	 * m�thode d'�valuation d'un individu
	 * @return Double : score d'adaptation d'un individu
	 */
	@Override
	public double evaluer() {

		return (this.ind.get(0)*this.ind.get(0) - this.ind.get(1)*this.ind.get(1));
	}
	
	/**
	 * M�thode de cr�ation d'un individu
	 * @return Vector<Integer> : g�nes de l'individu
	 */
	public Vector<Integer> createIndividu() {

		Random rand = new Random();
		Vector<Integer> ind = new Vector<>();
		
		ind.add(rand.nextInt(32));
		ind.add(rand.nextInt(32));

		return ind;
	}
	
	/**
	 * Fonction qui permet d'afficher un individu sous la forme String
	 * @return String : description de l'individu
	 * @see Individu.getScore()
	 */
	public String toString() {

		return "Individu : " + this.ind.get(0) + " / " + this.ind.get(1) +" / " + this.getScore();
	}

}
