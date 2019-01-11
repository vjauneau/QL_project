package Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

/**
* Sélection aléatoire, uniforme et sans intervention de la valeur d'adaptation.
* @author Léo Courson
* @version 1.0
* @since 1.0
*/
public class SelectionUniforme extends Selection{
	/**
	 * Sélectionne les parents de façon aléatoire.
	 * @param1 pop : Population de la simulation.
	 * @param2 nbEnfants : nombre de nouveaux individus dans la population.
	 * @return listToPaires(individus) : liste de paire des parents.
	 */
	@Override
	public List<Vector<Individu>> selectionPaires(Population pop, Integer nbEnfants) {
				
		int nb_enfants = nbEnfants;
		List<Individu> individus = new ArrayList<>(pop.getPopulation());
		
		if(nb_enfants%2!=0)nb_enfants++;
		
		Collections.shuffle(individus);
		individus = individus.subList(0, nb_enfants);
		
		return listToPaires(individus);
	}
}
