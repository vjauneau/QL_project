package Class;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

/**
* S�lection par Rang
* Choisit toujours les individus poss�dants les meilleurs scores d'adaptation
* @author L�o Courson
* @version 1.0
* @since 1.0
* @see Selection
*/
public class SelectionRang extends Selection{

	/**
	 * S�lectionne les parents avec la strategie rang
	 * @param pop : population de la simulation
	 * @param nbEnfants : nombre de nouveaux individus dans la population
	 * @return listToPaires(individus) : liste de paire des parents
	 * @see Selection#listToPaires(List)
	 */
	@Override
	public List<Vector<Individu>> selectionPaires(Population pop, Integer nbEnfants) {
				
		int nbEnfant = nbEnfants;
		List<Individu> individus = new ArrayList<>(pop.getPopulation());
		
		if(nbEnfant%2!=0)nbEnfant++;
		
		individus.sort(Comparator.comparing(Individu::getScore, Comparator.reverseOrder()));
		individus = individus.subList(0, nbEnfant);
		
		return listToPaires(individus);
	}

}
