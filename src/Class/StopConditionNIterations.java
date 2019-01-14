package Class;


/**
* Class StopConditionNIterations
* Condition d'arrêt atteinte si l'algorithme a atteint sa limite d'itérations
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
* @see Algo, StopCondition
*/
public class StopConditionNIterations extends StopCondition {
	
	private Integer iterations = 0;
	
	/**
	* Constructeur de StopConditionNIterations, associe un Algo à la condition d'arrêt
	* @param algo : Algorithme associé à la condition d'arrêt
	*/
	public StopConditionNIterations(Algo algo) {

		super(algo);
	}
	
	/**
	* Retourne vrai si la condition d'arrêt est atteinte
	* @return Boolean : condition d'arrêt atteinte
	*/
	@Override
	public Boolean isValidate() {

		this.iterations ++;
		
		if(this.iterations >= this.algo.getnIteration())
			 {
				System.out.println("NIterations validate : " +this.iterations);
				return true;
			 }
		else return false;
	}

}
