package Class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

/**
* S�lection Uniforme
* S�lection des parents al�atoire, uniforme et sans intervention de la valeur d'adaptation
* @author L�o Courson
* @version 1.0
* @since 1.0
* @see Selection
*/
public class SelectionUniforme extends Selection{
	/**
	 * S�lectionne les parents avec la strat�gie uniforme
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
