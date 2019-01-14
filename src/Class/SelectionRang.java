package Class;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

/**
* Sélection par Rang
* Choisit toujours les individus possédants les meilleurs scores d'adaptation
* @author Léo Courson
* @version 1.0
* @since 1.0
* @see Selection
*/
public class SelectionRang extends Selection{

	/**
	 * Sélectionne les parents avec la strategie rang
	 * @param pop : population de la simulation
	 * @param nbEnfants : nombre de nouveaux individus dans la population
	 * @return listToPaires(individus) : liste de paire des parents
	 * @see Evaluation.listToPaires()
	 */
	@Override
	public List<Vector<Individu>> selectionPaires(Population pop, Integer nbEnfants) {
				
		int nb_enfants = nbEnfants;
		List<Individu> individus = new ArrayList<>(pop.getPopulation());
		
		if(nb_enfants%2!=0)nb_enfants++;
		
		individus.sort(Comparator.comparing(Individu::getScore, Comparator.reverseOrder()));
		individus = individus.subList(0, nb_enfants);
		
		return listToPaires(individus);
	}

}
