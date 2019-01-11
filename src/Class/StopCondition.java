package Class;

public abstract class StopCondition {
	
	Algo algo;
	

	public StopCondition(Algo algo) {
		
		this.algo = algo;
		
	}
	
	public abstract Boolean isValidate();
	
	
	public Algo getAlgo() {
		return algo;
	}

	public void setAlgo(Algo algo) {
		this.algo = algo;
	}


}
