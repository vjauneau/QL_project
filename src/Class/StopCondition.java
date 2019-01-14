package Class;



/**
* Class abstraite StopCondition
* Définie les méthodes à implementer les Classes de condition d'arrêt
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
* @see Algo, StopConditionNIterations, StopConditionSamePopulation, StopConditionSameWinner, StopConditionTimer
*/
public abstract class StopCondition {
	
	Algo algo;
	
	/**
	* Constructeur de StopCondition, associe un Algo à la condition d'arrêt
	* @param algo : Algorithme associé à la condition d'arrêt
	*/
	public StopCondition(Algo algo) {
		
		this.algo = algo;
	}
	
	/**
	* Méthode abstraite isValidate
	* Retourne vrai si la condition d'arrêt est atteinte
	* @return Boolean : condition d'arrêt atteinte
	*/
	public abstract Boolean isValidate();
	
	/**
	* Retourne l'algorithme associé à la condition d'arrêt
	* @return Algo : Algorithme associé à la condition d'arrêt
	*/
	public Algo getAlgo() {

		return algo;
	}

	/**
	* Set l'algorithme associé à la condition d'arrêt
	* @param algo : Algorithme associé à la condition d'arrêt
	*/
	public void setAlgo(Algo algo) {

		this.algo = algo;
	}


}
