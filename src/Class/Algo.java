package Class;

import java.util.List;
import java.util.Vector;

public class Algo {
	
	public void run(Individu IndividuReference, Selection typeSelection, Remplacement typeRemplacement) {
		
		Population pop = new Population(5, IndividuReference );
		
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
		
		Selection selec = typeSelection;
		
		List<Vector<Individu>> list_parents = selec.selectionPaires(pop);
		
		for(Vector v : list_parents) {
			System.out.println("Vector : (" + v.get(0) + ", " + v.get(1) + ")");
		}
		
		for(Individu ind : pop.getPopulation()) {
			System.out.println(ind.toString());
		}
		
		System.out.println("Croisement : ");
		Croisement croisement = new Croisement();
		List<Individu> enfants  = croisement.croisementIndividus(list_parents);
		
		
		Population ajout = new Population(enfants);
		eval.evaluer(ajout);
		
		Remplacement remplacement = typeRemplacement;
		
		pop = remplacement.remplacer(pop, ajout );
		System.out.println("Remplacement");
		for(Individu ind : pop.getPopulation()) {
			System.out.println(ind.toString());
		}
		
	}

}
