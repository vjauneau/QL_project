package Class;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

/**
* Choisit toujours les individus poss�dants les meilleurs scores d'adaptation.
* @author L�o Courson
* @version 1.0
* @since 1.0
*/
public class SelectionRang extends Selection{
	/**
	 * S�lectionne les parents ayant les meilleurs scores d'adaptation de la population.
	 * @param1 pop : Population de la simulation.
	 * @param2 nbEnfants : nombre de nouveaux individus dans la population.
	 * @return listToPaires(individus) : liste de paire des parents avec les meilleurs scores d'adaptation.
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
