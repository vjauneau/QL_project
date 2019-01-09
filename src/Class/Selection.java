package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

/**
* Classe abstraite : Strategy de sélection.
* @author Léo Courson
* @version 1.0
* @since 1.0
*/

public abstract class Selection {
	
	public abstract List<Vector<Individu>> selectionPaires(Population pop);
	
	public List<Vector<Individu>> listToPaires(List<Individu> individus){
		
		Random rand = new Random();
		Individu selected_individu;
		List<Individu> unselected_individus = individus;
		List<Vector<Individu>> paires_parents = new ArrayList<>();
		
		while(!unselected_individus.isEmpty()) {
			
			Vector<Individu> paire = new Vector<>();
			
			for(int j=0; j<2; j++) {
				int randomIndex = rand.nextInt(unselected_individus.size());
		        selected_individu = unselected_individus.get(randomIndex);
		        unselected_individus.remove(selected_individu);
		        paire.add(selected_individu);
			}
			
			paires_parents.add(paire);		
		}
		
		return paires_parents;
	}
}
