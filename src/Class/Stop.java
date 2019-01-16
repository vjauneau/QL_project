package Class;

import java.util.ArrayList;
import java.util.List;

/**
* Class Stop, regroupe les conditions d'arr�ts
* Fonction isFinished retourne vrai si au moins une condition est valid�e 
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
* @see StopCondition
*/
public class Stop {
	
	private List<StopCondition> stopConditions;
	
	/**
	* Constructeur de la liste des conditions d'arr�t
	*/
	public Stop() {

		this.stopConditions = new ArrayList<>();
	}

	/**
	* Fonction d'ajout de condition d'arr�t � la liste
	* @param sc : condition d'arr�t
	*/
	public void addStopCondition(StopCondition sc) {

		this.stopConditions.add(sc);
	}
	
	public List<StopCondition> getStopConditions() {
		return stopConditions;
	}
	
	/**
	* Fonction isFinished retourne vrai si au moins une condition est valid�e
	* @return Boolean : une condition d'arr�t est atteinte
	*/
	public Boolean isFinished() {
		
		for(StopCondition sc : this.stopConditions) {
			if(sc.isValidate()) return true;
		}
		return false;
	}

}
