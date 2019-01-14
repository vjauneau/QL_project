package Class;


/**
* Class StopConditionNIterations
* Condition d'arr�t atteinte si l'algorithme a atteint sa limite d'it�rations
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
* @see Algo, StopCondition
*/
public class StopConditionNIterations extends StopCondition {
	
	private Integer iterations = 0;
	
	/**
	* Constructeur de StopConditionNIterations, associe un Algo � la condition d'arr�t
	* @param algo : Algorithme associ� � la condition d'arr�t
	*/
	public StopConditionNIterations(Algo algo) {

		super(algo);
	}
	
	/**
	* Retourne vrai si la condition d'arr�t est atteinte
	* @return Boolean : condition d'arr�t atteinte
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
