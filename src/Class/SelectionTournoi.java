package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

/**
* Sélection tournoi
* Sélectionne l'individu ayant le meilleur score d'adaptation parmis une paire d'individu
* créée aléatoirement
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
* @see Selection
*/
public class SelectionTournoi extends Selection{

	/**
	 * Sélectionne les parents avec la strategie tournoi
	 * @param pop : population de la simulation
	 * @param nbEnfants : nombre de nouveaux individus dans la population
	 * @return listToPaires(individus) : liste de paire des parents
	 * @see Evaluation.listToPaires()
	 */
	@Override
	public List<Vector<Individu>> selectionPaires(Population pop, Integer nbEnfants) {
		
		Random rand = new Random();
		int nb_enfants = nbEnfants;
		if(nb_enfants%2!=0)nb_enfants++;
		List<Individu> individus = new ArrayList<>(pop.getPopulation());
		List<Individu> selected = new ArrayList<>();

		for(int i = 0; i < nb_enfants; i++) {
			List<Individu> tournoiInd = new ArrayList<>();
			tournoiInd.add(individus.get(rand.nextInt(individus.size())));
			tournoiInd.add(individus.get(rand.nextInt(individus.size())));
			
			Population tournoi = new Population(tournoiInd);
			Individu winner = tournoi.getMoreCompetent();		
			selected.add(winner);
			individus.remove(winner);
			
		}		
		return listToPaires(selected);
	}

}
