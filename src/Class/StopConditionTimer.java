package Class;


/**
* Class StopConditionTimer, retourne vrai si le temps d'éxecution de l'algorithme a dépassé la valeur définie
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
*/
public class StopConditionTimer extends StopCondition {

	
	public StopConditionTimer(Algo algo) {
		super(algo);
	}

	@Override
	public Boolean isValidate() {
		
		return algo.getTimerValidate();
	}



}
