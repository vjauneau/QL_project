package Applicatif;

import java.util.List;
import java.util.Vector;

import Class.Evaluation;
import Class.Individu;
import Class.Population;
import Class.Selection;
import Class.SelectionRang;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Individu myInd = new MyInd();
		Population pop = new Population(5, myInd );
		
		for(Individu ind : pop.getPopulation()) {
			ind.setScore(ind.evaluer());
			System.out.println(ind.toString());
		}
		
		System.out.println("Evaluation");
		
		Evaluation eval = new Evaluation(pop);
		
		for(Individu ind : pop.getPopulation()) {
			System.out.println(ind.toString());
		}
		
		System.out.println("Selection");
		
		SelectionRang selec = new SelectionRang();
		
		List<Vector<Individu>> list_parents = selec.selectionPaires(pop);
		
		for(Vector v : list_parents) {
			System.out.println("Vector : (" + v.get(0) + ", " + v.get(1) + ")");
		}
	}

}
