package Class;

public class StopConditionTimer extends StopCondition {

	
	public StopConditionTimer(Algo algo) {
		super(algo);
	}

	@Override
	public Boolean isValidate() {
		
		return algo.getTimerValidate();
	}



}
