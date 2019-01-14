package Class;


/**
* Class StopConditionSamePopulation
* Condition d'arrêt atteinte si la population est inchangée depuis n itérations
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
* @see Algo, StopCondition
*/
public class StopConditionSamePopulation extends StopCondition{

	private Population pop;
	private Integer iterations = 0;

	/**
	* Constructeur de StopConditionSamePopulation, associe un Algo à la condition d'arrêt
	* @param algo : Algorithme associé à la condition d'arrêt
	*/
	public StopConditionSamePopulation(Algo algo) {
		super(algo);
		
	}
	
	/**
	* Retourne vrai si la condition d'arrêt est atteinte
	* @return Boolean : condition d'arrêt atteinte
	*/
	@Override
	public Boolean isValidate() {
		
		if(this.pop != null) {

			if(this.pop.getPopulation().size() == this.algo.getPop().getPopulation().size() && this.pop.getPopulation().containsAll(this.algo.getPop().getPopulation())) {
				
				this.iterations ++;
				if(this.iterations >= this.algo.getnIterationSamePop()) {
					System.out.println("SamePop validate nIterations : " + this.iterations);
					return true;
				}
			}
			else {
				this.pop = this.algo.getPop();
				this.iterations = 0;
			}
		}
		else this.pop = this.algo.getPop();
		
		return false;
	}
	
	


}
