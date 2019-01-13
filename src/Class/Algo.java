package Class;

import java.util.List;
import java.util.Vector;

public class Algo {
	
	private Population pop;
	private Integer nIteration;	
	private Integer nIterationSamePop;	
	private Integer nIterationSameWinner;	
	private Boolean TimerValidate = false;


	public void run(Individu IndividuReference, Selection typeSelection, Remplacement typeRemplacement) {
		
		this.pop = new Population(5, IndividuReference);
		
		for(Individu ind : pop.getPopulation()) {
			System.out.println(ind.toString());
		}
		
		System.out.println("EVALUATION");		

		Evaluation eval = new Evaluation(pop, 2);
		eval.evaluer();
		
		for(Individu ind : pop.getPopulation()) {
			System.out.println(ind.toString());
		}
		
		System.out.println("SELECTION");
		
		Selection selec = typeSelection;
		List<Vector<Individu>> list_parents = selec.selectionPaires(pop, 4);
		
		for(Vector<Individu> v : list_parents) {
			System.out.println("Vector : (" + v.get(0) + ", " + v.get(1) + ")");
		}
		
		for(Individu ind : pop.getPopulation()) {
			System.out.println(ind.toString());
		}
		
		System.out.println("CROISEMENT");

		Croisement croisement = new Croisement();
		List<Individu> enfants  = croisement.croisementIndividus(list_parents);
		
		Population ajout = new Population(enfants);
		eval = new Evaluation(ajout, 2);
		eval.evaluer();
		
		System.out.println("REMPLACEMENT");
		
		Remplacement remplacement = typeRemplacement;
		pop = remplacement.remplacer(pop, ajout);
		
		for(Individu ind : pop.getPopulation()) {
			System.out.println(ind.toString());
		}
		
	}

	public Integer getnIterationSamePop() {
		return nIterationSamePop;
	}

	public void setnIterationSamePop(Integer nIterationSamePop) {
		this.nIterationSamePop = nIterationSamePop;
	}

	public Integer getnIterationSameWinner() {
		return nIterationSameWinner;
	}

	public void setnIterationSameWinner(Integer nIterationSameWinner) {
		this.nIterationSameWinner = nIterationSameWinner;
	}

	public Integer getnIteration() {
		return nIteration;
	}

	public void setnIteration(Integer nIteration) {
		this.nIteration = nIteration;
	}
	
	public Population getPop() {
		return pop;
	}

	public void setPop(Population pop) {
		this.pop = pop;
	}
	
	public Boolean getTimerValidate() {
		return TimerValidate;
	}

	public void setTimerValidate(Boolean timerValidate) {
		TimerValidate = timerValidate;
	}
	
	public Individu getWinner() {
		return this.pop.getMoreCompetent();
	}
}
