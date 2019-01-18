package Class;

import java.util.ArrayList;
import java.util.List;

/**
* Class Stop, regroupe les conditions d'arrêts
* Fonction isFinished retourne vrai si au moins une condition est validée 
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
* @see StopCondition
*/
public class Stop {
	
	private List<StopCondition> stopConditions;
	
	/**
	* Constructeur de la liste des conditions d'arrêt
	*/
	public Stop() {

		this.stopConditions = new ArrayList<>();
	}

	/**
	* Fonction d'ajout de condition d'arrêt à la liste
	* @param sc : condition d'arrêt
	*/
	public void addStopCondition(StopCondition sc) {

		this.stopConditions.add(sc);
	}
	
	public List<StopCondition> getStopConditions() {
		return stopConditions;
	}
	
	/**
	* Fonction isFinished retourne vrai si au moins une condition est validée
	* @return Boolean : une condition d'arrêt est atteinte
	*/
	public Boolean isFinished() {
		
		for(StopCondition sc : this.stopConditions) {
			if(sc.isValidate()) return true;
		}
		return false;
	}

}
