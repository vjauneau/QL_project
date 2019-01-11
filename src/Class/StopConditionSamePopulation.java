package Class;

public class StopConditionSamePopulation extends StopCondition{

	private Population pop;
	private Integer iterations = 0;

	
	public StopConditionSamePopulation(Algo algo) {
		super(algo);
		
	}
	
	
	@Override
	public Boolean isValidate() {
		
		if(this.pop != null) {
			if(this.pop == this.algo.getPop()) {
				this.iterations ++;
				if(this.iterations >= this.algo.getnIterationSamePop()) return true;
			}
			else {
				this.pop = this.algo.getPop();
				this.iterations = 0;
			}
		} else {
			this.pop = this.algo.getPop();
		}
		
		return false;
	}
	
	


}
