package Class;

import java.util.Comparator;
import java.util.List;

/**
* Remplacement par range, implémente Remplacement.
* Remplace les plus faibles de la population par les ajouts si ils sont eux mêmes plus fort
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
*/
public class RemplacementRang implements Remplacement {

	/**
	* Remplace n individu dans la population de base par la population d'ajout en fonction de leur rang
	* @param oldpop : population de base 
	* @param ajout : nouveaux individus à ajouter / remplacer
	* @return Population : nouvelle population
	*/
	@Override
	public Population remplacer(Population oldpop, Population ajout) {
		
		List<Individu> newPop = oldpop.getPopulation();

		newPop.addAll(ajout.getPopulation());
		newPop.sort(Comparator.comparing(Individu::getScore));

		List<Individu> toRemove = newPop.subList(0, ajout.getNbIndividu());
		newPop.removeAll(toRemove);

		
		return new Population(newPop);
	}
}
