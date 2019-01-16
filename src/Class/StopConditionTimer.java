package Class;


/**
* Class StopConditionTimer
* Condition d'arrêt atteinte si le temps d'éxecution de l'algorithme a dépassé la valeur définie
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
* @see Algo
* @see StopCondition
*/
public class StopConditionTimer extends StopCondition {

	/**
	* Constructeur de StopConditionTimer, associe un Algo à la condition d'arrêt
	* @param algo : Algorithme associé à la condition d'arrêt
	*/
	public StopConditionTimer(Algo algo) {

		super(algo);
	}

	/**
	* Retourne vrai si la condition d'arrêt est atteinte
	* @return Boolean : condition d'arrêt atteinte
	*/
	@Override
	public Boolean isValidate() {
		
		return algo.getTimerValidate();
	}

}
