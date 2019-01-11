package Class;

public class StopCondtionNIterations extends StopCondition {
	
	
	
	public StopCondtionNIterations(Algo algo) {
		super(algo);
	}

	private Integer iterations = 0;

	@Override
	public Boolean isValidate() {
		this.iterations ++;
		
		if(this.iterations >= this.algo.getnIteration()) return true;
		else return false;
	}

}
