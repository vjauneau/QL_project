package Applicatif;

import java.util.Random;
import java.util.Vector;

import Class.Individu;
/**
* Individu de l'algo génétique, contient la méthode d'évaluation
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
*/
public class MyInd extends Individu {

	private Vector<Integer> ind = new Vector<Integer>();
	
	/**
	 * Constructeur d'individu. Ce constructeur prend en paramètre les valeurs des gènes
	 * sous forme d'integer lors de la création d'un individus
	 * @param gene1
	 * @param gene2
	 */
	public MyInd(Integer gene1, Integer gene2)
	{
		this.ind.add(gene1);
		this.ind.add(gene2);
	}
	
	/**
	 * Constructeur qui prend en paramètres le vecteur de gène ind
	 * @param ind
	 */
	public MyInd(Vector<Integer> ind) {
		this.ind = ind;
	}
	
	public MyInd() {
		
	}
	
	/**
	 * Permet de retourner le vecteur de gènes d'un individu
	 * @return Vector<Integer>
	 */
	public Vector<Integer> getGenes()
	{
		return ind;
	}
	
	/**
	 * Permet de retourner un gène d'un individu
	 * @return Integer -> retourne un gène sous fome d'entier
	 */
	public Integer getGene(int idx) {
		return ind.get(idx);
	}
		
	/**
	 * méthode d'évaluation d'un individu
	 * @return Score. Retourne le score d'adaptation d'un individu sous forme de Double
	 */
	@Override
	public double evaluer() {

		return (this.ind.get(0)*this.ind.get(0) - this.ind.get(1)*this.ind.get(1));
	}
	
	/**
	 * Méthode de création d'un individu
	 * @return un Vector<Integer> correspondant au 2 gène de l'individu en question
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
	 */
	public String toString() {
		return "Individu : " + this.ind.get(0) + " / " + this.ind.get(1) +" / " + this.getScore();
	}

}
