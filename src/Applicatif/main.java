package Applicatif;

import java.util.List;
import java.util.Vector;

import Class.Croisement;
import Class.Evaluation;
import Class.Individu;
import Class.Population;
import Class.Remplacement;
import Class.RemplacementAleatoire;
import Class.RemplacementRang;
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
		
		Evaluation eval = new Evaluation();
		eval.evaluer(pop);
		
		for(Individu ind : pop.getPopulation()) {
			System.out.println(ind.toString());
		}
		
		System.out.println("Selection");
		
		SelectionRang selec = new SelectionRang();
		
		List<Vector<Individu>> list_parents = selec.selectionPaires(pop);
		
		for(Vector v : list_parents) {
			System.out.println("Vector : (" + v.get(0) + ", " + v.get(1) + ")");
		}
		
		for(Individu ind : pop.getPopulation()) {
			System.out.println(ind.toString());
		}
		
		System.out.println("Croisement : ");
		Croisement croisement = new Croisement();
		croisement.croisementIndividus(list_parents);
		
		
		Population ajout = new Population(2, myInd);
		eval.evaluer(ajout);
		
		Remplacement remplacement = new RemplacementAleatoire();
		
		pop = remplacement.remplacer(pop, ajout );
		System.out.println("Remplacement");
		for(Individu ind : pop.getPopulation()) {
			System.out.println(ind.toString());
		}
		
	}

}
