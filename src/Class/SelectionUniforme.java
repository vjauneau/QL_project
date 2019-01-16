package Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

/**
* Sélection Uniforme
* Sélection des parents aléatoire, uniforme et sans intervention de la valeur d'adaptation
* @author Léo Courson
* @version 1.0
* @since 1.0
* @see Selection
*/
public class SelectionUniforme extends Selection{
	/**
	 * Sélectionne les parents avec la stratégie uniforme
	 * @param pop : population de la simulation
	 * @param nbEnfants : nombre de nouveaux individus dans la population
	 * @return listToPaires(individus) : liste de paire des parents
	 * @see Evaluation.listToPaires()
	 */
	@Override
	public List<Vector<Individu>> selectionPaires(Population pop, Integer nbEnfants) {
				
		int nbEnfant = nbEnfants;
		List<Individu> individus = new ArrayList<>(pop.getPopulation());
		
		if(nbEnfant%2!=0)nbEnfant++;
		
		Collections.shuffle(individus);
		individus = individus.subList(0, nbEnfant);
		
		return listToPaires(individus);
	}
}
