package Class;

import java.util.ArrayList;
import java.util.List;

/**
* Class Stop, regroupe les conditions d'arrets
* Fonction isFinished retourne vrai si au moins une condition est validée 
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
*/
public class Stop {
	
	private List<StopCondition> stopConditions;
	
	public Stop() {
		this.stopConditions = new ArrayList<>();
	}
	
	/**
	* Fonction d'ajout de condition d'arret à la liste
	* @author Vincent Jauneau
	* @version 1.0
	* @since 1.0
	*/
	public void addStopCondtion(StopCondition sc) {
		this.stopConditions.add(sc);
	}
	
	/**
	* Fonction isFinished retourne vrai si au moins une condition est validée 
	* @author Vincent Jauneau
	* @version 1.0
	* @since 1.0
	*/
	public Boolean isFinished() {
		
		for(StopCondition sc : this.stopConditions) {
			if(sc.isValidate()) return true;
		}
		
		return false;
	}
	
	
	
	
}
