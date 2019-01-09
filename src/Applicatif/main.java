package Applicatif;

import Class.Individu;
import Class.Population;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Individu myInd = new MyInd();
		Population pop = new Population(5, myInd );
		
		for(Individu ind : pop.getPopulation()) {
			ind.setScore(ind.evaluer());
			System.out.println(ind.toString());
		}

		
		
	}

}
