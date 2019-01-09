package Class;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

/**
* Choisit toujours les individus possédant les meilleurs scores d'adaptation.
* @author Léo Courson
* @version 1.0
* @since 1.0
*/
public class SelectionRang extends Selection{
	/**
	 * Récupère les Nb_enfants individus avec les meilleurs scores d'adaptation.
	 * @param pop Population de la simulation.
	 * @return Retourne les Nb_enfants individus avec les meilleurs scores d'adaptation.
	 */
	@Override
	public List<Vector<Individu>> selectionPaires(Population pop) {
				
		int nb_enfants = 4;
		List<Individu> individus = pop.getPopulation();
		
		if(nb_enfants%2!=0)nb_enfants++;
		
		individus.sort(Comparator.comparing(Individu::getScore, Comparator.reverseOrder()));
		individus = individus.subList(0, nb_enfants);
				
		return listToPaires(individus);
	}
}
