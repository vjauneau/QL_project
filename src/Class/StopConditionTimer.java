package Class;


/**
* Class StopConditionTimer
* Condition d'arr�t atteinte si le temps d'�xecution de l'algorithme a d�pass� la valeur d�finie
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
* @see Algo
* @see StopCondition
*/
public class StopConditionTimer extends StopCondition {

	/**
	* Constructeur de StopConditionTimer, associe un Algo � la condition d'arr�t
	* @param algo : Algorithme associ� � la condition d'arr�t
	*/
	public StopConditionTimer(Algo algo) {

		super(algo);
	}

	/**
	* Retourne vrai si la condition d'arr�t est atteinte
	* @return Boolean : condition d'arr�t atteinte
	*/
	@Override
	public Boolean isValidate() {
		
		return algo.getTimerValidate();
	}

}
