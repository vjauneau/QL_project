package Class;


/**
* Class StopConditionSameWinner
* Condition d'arrêt atteinte si le maillon fort de la population est inchangée depuis n itérations
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
* @see Algo
* @see StopCondition
*/
public class StopConditionSameWinner extends StopCondition{

	private Individu winner;
	private Integer iterations = 0;
	
	/**
	* Constructeur de StopConditionSameWinner, associe un Algo à la condition d'arrêt
	* @param algo : Algorithme associé à la condition d'arrêt
	*/
	public StopConditionSameWinner(Algo algo) {

		super(algo);
	}

	/**
	* Retourne vrai si la condition d'arrêt est atteinte
	* @return Boolean : condition d'arrêt atteinte
	*/
	@Override
	public Boolean isValidate() {
		
		if(this.winner != null) {
	
			if(this.winner.isEqual(this.algo.getWinner())){
				this.iterations ++;

				if(this.iterations >= this.algo.getnIterationSameWinner()) {
					System.out.println("SameWinner validate nIterations : " + this.iterations);
					return true;
				}
			}
			else {
				this.winner = this.algo.getWinner();
				this.iterations = 0;
			}
		}
		else this.winner = this.algo.getWinner();

		return false;
	}

}
