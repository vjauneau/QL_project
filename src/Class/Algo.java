package Class;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import Applicatif.MyInd;

/**
* Algorithme génétique
* @version 1.0
* @since 1.0
* @see AlgoBuilder
*/
public class Algo {
	
	private Population pop;
	private Integer nEnfants;
	private Integer pourcentageMutation;
	private Integer nThread;

	private Integer nIteration;
	private Integer nIterationSamePop;
	private Integer nIterationSameWinner;
	private Integer timerSecond;
	private Boolean timerValidate = false;

	private Individu individuReference;
	private Selection typeSelection;
	private Remplacement typeRemplacement;
	private Stop stop;

	/**
	* Constructeur de l'algorithme
	* Instancie les variables de l'algorithme
	*/
	public Algo(Integer nEnfants,
				Integer pourcentageMutation,
				Integer nThread,
				Integer populationSize,
				Integer nIteration,
				Integer nIterationSamePop,
				Integer nIterationSameWinner,
				Integer timerSecond,
				Individu individuReference,
				Selection typeSelection,
				Remplacement typeRemplacement) {
	
		this.nEnfants = nEnfants;
		this.pourcentageMutation = pourcentageMutation;
		this.nThread = nThread;
		
		this.typeSelection = typeSelection;
		this.typeRemplacement = typeRemplacement;
		
		// Creation de la population.
		if(individuReference!=null) {
			individuReference = new MyInd();
		}
		this.individuReference = individuReference;
		this.pop = new Population(populationSize, individuReference);
		
		// Creation des Stop conditions.
		this.stop = new Stop();
		
		if(nIteration!=null) {
			this.nIteration = nIteration;
			this.stop.addStopCondition(new StopConditionNIterations(this));
		}
		
		if(nIterationSamePop!=null) {
			this.nIterationSamePop = nIterationSamePop;
			this.stop.addStopCondition(new StopConditionSamePopulation(this));
		}
		
		if(nIterationSameWinner!=null) {
			this.nIterationSameWinner = nIterationSameWinner;
			this.stop.addStopCondition(new StopConditionSameWinner(this));
		}
		
		if(timerSecond!=null) {
			this.timerSecond = timerSecond;
			this.stop.addStopCondition(new StopConditionTimer(this));
		}
	}
	
	/**
	* Exécute l'algorithme
	* @return Population : population obtenue à la fin de l'éxécution de l'algorithme
	*/
	public Population run() {
		
		if(this.timerSecond!=null) {
			TimerTask timerTask = new MyTimeTask(this);
			Timer timer = new Timer(true);
			
			System.out.println(this.timerSecond);
		}
		
		do {
			// Evalue la population actuelle.
			Evaluation eval = new Evaluation(this.pop, this.nThread);
			eval.evaluer();
			
			// Selectionne les parents parmis la population actuelle.
			Selection selec = typeSelection;
			List<Vector<Individu>> listParents = selec.selectionPaires(this.pop, this.nEnfants);
	
			// Croise les parents pour obtenir de nouveaux individus (enfants).
			Evolution evolution = new Evolution();
			List<Individu> enfants  = evolution.croisementMutationIndividus(listParents, this.nEnfants, this.pourcentageMutation);
			
			// Evalue les nouveaux individus.
			Population ajout = new Population(enfants);
			eval = new Evaluation(ajout, this.nThread);
			eval.evaluer();
			
			// Remplace une parmis de l'ancienne population par la nouvelle (enfants).
			Remplacement remplacement = typeRemplacement;
			this.pop = remplacement.remplacer(this.pop, ajout);
		}
		while(!this.stop.isFinished());
		
		return this.pop;
	}
	
	/**
	* Retourne l'individu avec le meilleur score d'adaptation de la population
	* @return Individu : individu avec le meilleur score d'adaptation de la population
	*/
	public Individu getWinner() {
		return this.pop.getMoreCompetent();
	}
	
	// Getters / Setters
	
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
		return timerValidate;
	}

	public void setTimerValidate(Boolean timerValidate) {
		this.timerValidate = timerValidate;
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
	
	public void setTypeRemplacement(Remplacement remplacement) {
		this.typeRemplacement = remplacement;
	}

	public Stop getStop() {
		return stop;
	}

}
