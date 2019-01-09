package Class;

import java.util.List;
import java.util.Random;

/**
* Individu de l'algo génétique, contient la méthode d'évaluation
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
*/
public class RemplacementAleatoire extends Remplacement {

	@Override
	public Population remplacer(Population oldpop, Population ajout) {
		
		Individu bestIndividu = oldpop.getMoreCompetent();
		Random rand = new Random();
		List<Individu> newPop = oldpop.getPopulation();
		int nbRemplacement = 0;
		int idx= 0;
		do {
			idx = rand.nextInt(newPop.size()-1);
			if(newPop.get(idx) != bestIndividu) {
				newPop.remove(idx);
				newPop.add(ajout.getIndividu(nbRemplacement));
				nbRemplacement++;
			}
			
		}while(nbRemplacement < ajout.getNbIndividu());
		
		
		Population newPopu = new Population(newPop);
		return newPopu;
	}

}
