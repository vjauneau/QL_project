package Applicatif;

import java.util.Vector;

import Class.Individu;

public class MyInd extends Individu {

	private Vector<Integer> ind;
	
	public MyInd(Integer gene1, Integer gene2)
	{
		this.ind.add(gene1);
		this.ind.add(gene2);
	}
	
	public Vector<Integer> getGenes()
	{
		return ind;
	}
		
	
	@Override
	public double evaluer() {

		return (this.ind.get(0)^2 - this.ind.get(1)^2);
	}

}
