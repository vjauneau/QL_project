package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

/**
* Sélection tournoi
* Selection de deux individus au hasard puis selection d'un gagnant sur ces paires d'individus.
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
*/
public class SelectionTournoi extends Selection{

	@Override
	public List<Vector<Individu>> selectionPaires(Population pop, Integer nbEnfants) {
		
		Random rand = new Random();
		int nb_enfants = nbEnfants;
		if(nb_enfants%2!=0)nb_enfants++;
		List<Individu> individus = new ArrayList<>(pop.getPopulation());
		List<Individu> selected = new ArrayList<>();
		for(int i = 0; i < nbEnfants; i++) {
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
