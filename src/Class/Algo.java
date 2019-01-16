package Class;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

public class Algo {
	
	private Population pop;
	private Integer nEnfants;
	private Integer nThread;
	private Integer nIteration;
	private Integer nIterationSamePop;
	private Integer nIterationSameWinner;
	private Boolean TimerValidate = false;

	private Individu individuReference;
	private Selection typeSelection;
	private Remplacement typeRemplacement;
	private Stop stop;

	public Algo() {
	}
	
	public Algo(Individu individuReference, Selection typeSelection, Remplacement typeRemplacement) {
		this.individuReference = individuReference;
		this.typeSelection = typeSelection;
		this.typeRemplacement = typeRemplacement;
	}
	
	public void run() {
		TimerTask timerTask = new MyTimeTask(this);
		Timer timer = new Timer(true);
		
		// 2 Secondes
		timer.schedule(timerTask, 2000);
		
		do {
			// Evalue la population actuelle.
			Evaluation eval = new Evaluation(pop, nThread);
			eval.evaluer();
			
			// Selectionne les parents parmis la population actuelle.
			Selection selec = typeSelection;
			List<Vector<Individu>> list_parents = selec.selectionPaires(pop, nEnfants);
	
			// Croise les parents pour obtenir de nouveaux individus (enfants).
			Croisement croisement = new Croisement();
			List<Individu> enfants  = croisement.croisementIndividus(list_parents);
			
			// Evalue les nouveaux individus.
			Population ajout = new Population(enfants);
			eval = new Evaluation(ajout, nThread);
			eval.evaluer();
			
			// Remplace une parmis de l'ancienne population par la nouvelle (enfants).
			Remplacement remplacement = typeRemplacement;
			pop = remplacement.remplacer(pop, ajout);
		}
		while(!stop.isFinished());
		
	}

	public void run(Individu IndividuReference, Selection typeSelection, Remplacement typeRemplacement) {
		
		this.nIteration = 200;
		this.nIterationSamePop = 2;
		this.nIterationSameWinner = 2;

		TimerTask timerTask = new MyTimeTask(this);
		Timer timer = new Timer(true);
		
		Stop stop = new Stop();
		stop.addStopCondition(new StopConditionNIterations(this));
		stop.addStopCondition(new StopConditionSamePopulation(this));
		stop.addStopCondition(new StopConditionSameWinner(this));
		stop.addStopCondition(new StopConditionTimer(this));
		this.pop = new Population(10000, IndividuReference);
		
		// 2 Secondes
		timer.schedule(timerTask, 2000);
		
		do {
			/*for(Individu ind : pop.getPopulation()) {
				System.out.println(ind.toString());
			}*/
			
			System.out.println("EVALUATION");		
	
			Evaluation eval = new Evaluation(pop, 2);
			eval.evaluer();
			
			/*for(Individu ind : pop.getPopulation()) {
				System.out.println(ind.toString());
			}*/
			
			System.out.println("SELECTION");
			
			Selection selec = typeSelection;
			List<Vector<Individu>> list_parents = selec.selectionPaires(pop, 2000);
			
			/*for(Vector<Individu> v : list_parents) {
				System.out.println("Vector : (" + v.get(0) + ", " + v.get(1) + ")");
			}*/
			
			/*for(Individu ind : pop.getPopulation()) {
				System.out.println(ind.toString());
			}*/
			
			System.out.println("CROISEMENT");
	
			Croisement croisement = new Croisement();
			List<Individu> enfants  = croisement.croisementIndividus(list_parents);
			
			Population ajout = new Population(enfants);
			eval = new Evaluation(ajout, 2);
			eval.evaluer();
			
			System.out.println("REMPLACEMENT");
			
			Remplacement remplacement = typeRemplacement;
			pop = remplacement.remplacer(pop, ajout);
		}
		while(!stop.isFinished());
		
		/*for(Individu ind : pop.getPopulation()) {
			System.out.println(ind.toString());
		}*/
		
	}
	
	public Population getPop() {
		return pop;
	}

	public void setPop(Population pop) {
		this.pop = pop;
	}
	
	public Integer getnEnfants() {
		return nEnfants;
	}
	
	public void setnEnfants(Integer nEnfants) {
		this.nEnfants = nEnfants;
	}

	public Integer getnThread() {
		return nThread;
	}

	public void setnThread(Integer nThread) {
		this.nThread = nThread;
	}
	
	public Integer getnIteration() {
		return nIteration;
	}

	public void setnIteration(Integer nIteration) {
		this.nIteration = nIteration;
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
	
	public Boolean getTimerValidate() {
		return TimerValidate;
	}

	public void setTimerValidate(Boolean timerValidate) {
		TimerValidate = timerValidate;
	}
	
	public Individu getIndividuReference() {
		return individuReference;
	}

	public void setIndividuReference(Individu individuReference) {
		this.individuReference = individuReference;
	}

	public Selection getTypeSelection() {
		return typeSelection;
	}

	public void setTypeSelection(Selection typeSelection) {
		this.typeSelection = typeSelection;
	}

	public Remplacement getTypeRemplacement() {
		return typeRemplacement;
	}

	public Stop getStop() {
		return stop;
	}

	public Individu getWinner() {
		return this.pop.getMoreCompetent();
	}
}
