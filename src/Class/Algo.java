package Class;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

public class Algo {
	
	private Population pop;
	private Integer nIteration;	
	private Integer nIterationSamePop;	
	private Integer nIterationSameWinner;	
	private int nbEnfants;
	private int pourcentageMutation;
	private Boolean TimerValidate = false;


	public void run(Individu individuReference, Selection typeSelection, Remplacement typeRemplacement) {
		
		this.nIteration = 200;
		this.nIterationSamePop = 2;
		this.nIterationSameWinner = 2;
		this.nbEnfants = 2000;
		this.pourcentageMutation=3;
		TimerTask timerTask = new MyTimeTask(this);
		Timer timer = new Timer(true);
		
		Stop stop = new Stop();
		stop.addStopCondition(new StopConditionNIterations(this));
		stop.addStopCondition(new StopConditionSamePopulation(this));
		stop.addStopCondition(new StopConditionSameWinner(this));
		stop.addStopCondition(new StopConditionTimer(this));
		this.pop = new Population(10000, individuReference);
		
		// 2 Secondes
		timer.schedule(timerTask, 2000);
		
		do {
			
			
			System.out.println("EVALUATION");		
	
			Evaluation eval = new Evaluation(pop, 2);
			eval.evaluer();
			
			System.out.println("SELECTION");
			
			Selection selec = typeSelection;
			List<Vector<Individu>> listParents = selec.selectionPaires(pop, nbEnfants);
			
			System.out.println("Evolution");
	
			Evolution evolution = new Evolution();
			List<Individu> enfants  = evolution.croisementMutationIndividus(listParents, nbEnfants, pourcentageMutation);
			
			Population ajout = new Population(enfants);
			eval = new Evaluation(ajout, 2);
			eval.evaluer();
			
			System.out.println("REMPLACEMENT");
			
			Remplacement remplacement = typeRemplacement;
			pop = remplacement.remplacer(pop, ajout);
		}
		while(!stop.isFinished());
	
		
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
