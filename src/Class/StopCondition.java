package Class;



/**
* Class abstraite StopCondition, définie les méthodes à implementer pour être une StopCondition
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
*/
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
