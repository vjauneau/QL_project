package Class;


/**
* Class StopConditionNIterations, retourne vrai si l'algorithme a atteint sa limite d'itérations
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
*/
public class StopCondtionNIterations extends StopCondition {
		
	public StopCondtionNIterations(Algo algo) {
		super(algo);
	}

	private Integer iterations = 0;

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
