package Class;

public class StopConditionSameWinner extends StopCondition{

	
	private Individu winner;
	private Integer iterations = 0;
	
	
	public StopConditionSameWinner(Algo algo) {
		super(algo);
	}

	@Override
	public Boolean isValidate() {
		
		if(this.winner != null) {
			if(this.winner == this.algo.getWinner()) {
				this.iterations ++;
				if(this.iterations >= this.algo.getnIterationSameWinner()) return true;
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
