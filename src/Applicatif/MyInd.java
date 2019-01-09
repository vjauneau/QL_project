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

	private Vector<Integer> ind;
	
	public MyInd(Integer gene1, Integer gene2)
	{
		this.ind.add(gene1);
		this.ind.add(gene2);
	}
	
	public MyInd(Vector<Integer> ind) {
		this.ind = ind;
	}
	
	public MyInd() {
		
	}
	
	public Vector<Integer> getGenes()
	{
		return ind;
	}
		
	
	@Override
	public double evaluer() {

		return (this.ind.get(0)*this.ind.get(0) - this.ind.get(1)*this.ind.get(1));
	}
	// @Override
	public Vector<Integer> createIndividu() {
		Random rand = new Random();
		Vector<Integer> ind = new Vector<>();
		ind.add(rand.nextInt(32));
		ind.add(rand.nextInt(32));
		return ind;
	}
	
	
	public String toString() {
		return "Individu : " + this.ind.get(0) + " / " + this.ind.get(1) +" / " + this.getScore();
	}

}
