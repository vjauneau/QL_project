package Class;



/**
* Class abstraite StopCondition
* D�finie les m�thodes � implementer les Classes de condition d'arr�t
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
* @see Algo, StopConditionNIterations, StopConditionSamePopulation, StopConditionSameWinner, StopConditionTimer
*/
public abstract class StopCondition {
	
	Algo algo;
	
	/**
	* Constructeur de StopCondition, associe un Algo � la condition d'arr�t
	* @param algo : Algorithme associ� � la condition d'arr�t
	*/
	public StopCondition(Algo algo) {
		
		this.algo = algo;
	}
	
	/**
	* M�thode abstraite isValidate
	* Retourne vrai si la condition d'arr�t est atteinte
	* @return Boolean : condition d'arr�t atteinte
	*/
	public abstract Boolean isValidate();
	
	/**
	* Retourne l'algorithme associ� � la condition d'arr�t
	* @return Algo : Algorithme associ� � la condition d'arr�t
	*/
	public Algo getAlgo() {

		return algo;
	}

	/**
	* Set l'algorithme associ� � la condition d'arr�t
	* @param algo : Algorithme associ� � la condition d'arr�t
	*/
	public void setAlgo(Algo algo) {

		this.algo = algo;
	}


}
