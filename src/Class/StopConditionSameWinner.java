package Class;


/**
* Class StopConditionSameWinner, retourne vrai si le maillon fort de la population est inchangée depuis n itérations
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
*/
public class StopConditionSameWinner extends StopCondition{

	
	private Individu winner;
	private Integer iterations = 0;
	
	
	public StopConditionSameWinner(Algo algo) {
		super(algo);
	}

	@Override
	public Boolean isValidate() {
		
		if(this.winner != null) {
			System.out.println(this.winner);
			System.out.println(this.algo.getWinner());
			if(this.winner.equal(this.algo.getWinner())){
				this.iterations ++;
				System.out.println("plop");
				if(this.iterations >= this.algo.getnIterationSameWinner()) {
					System.out.println("SameWinner validate nIterations : " + this.iterations);
					return true;
				}
			}
			else {
				this.winner = this.algo.getWinner();
				this.iterations = 0;
			}
		} else {
			this.winner = this.algo.getWinner();
		}
		
		return false;
	}

}
