package Class;

import java.util.ArrayList;
import java.util.List;

/**
* Conditions d'arrêt de l'algo
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
*/
public class Stop {
	
	List<StopCondition> stopConditions;
	
	public Stop() {
		this.stopConditions = new ArrayList<>();
	}
	
	public Boolean isFinished() {
		
		for(StopCondition sc : this.stopConditions) {
			if(sc.isValidate()) return true;
		}
		
		return false;
	}
	
	
	
	
}
