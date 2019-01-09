package Class;

import java.util.ArrayList;
import java.util.List;

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
	public List<Individu> selectionPaires(Population pop) {
		
		int nb_enfants = 10;
		List<Individu> individus = pop.getPopulation();
		List<Individu> selected_individus = new ArrayList<>();
		List<Double> individus_score = new ArrayList<>();
	
		for(Individu ind : individus) {
			individus_score.add(ind.evaluer());
		}
		
		
		
		return selected_individus;
	}
}
