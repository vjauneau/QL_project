package Class;

import java.util.Comparator;
import java.util.List;

/**
* Individu de l'algo g�n�tique, contient la m�thode d'�valuation
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
*/
public class RemplacementRang extends Remplacement {

	@Override
	public Population remplacer(Population oldpop, Population ajout) {
		
		List<Individu> newPop = oldpop.getPopulation();
		newPop.addAll(ajout.getPopulation());
		newPop.sort(Comparator.comparing(Individu::getScore));
		List<Individu> toRemove = newPop.subList(0, ajout.getNbIndividu()-1);
		newPop.removeAll(toRemove);
		Population newPopu = new Population(newPop);
		return newPopu;
	}
	
	
	

}
