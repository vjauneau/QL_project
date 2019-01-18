package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

/**
* Classe abstraite : Strategie de sélection
* @author Léo Courson
* @version 1.0
* @since 1.0
* @see SelectionRang
* @see SelectionTournoi
* @see SelectionUniforme
*/
public abstract class Selection {
	
	/**
	 * Méthode abstraite selectionPaires
	 * Sélectionne les parents à partir d'une population et d'une loi de sélection
	 * @param pop : population de la simulation
	 * @param nbEnfants : nombre de nouveaux individus dans la population
	 * @return liste de paires d'individus
	 */
	public abstract List<Vector<Individu>> selectionPaires(Population pop, Integer nbEnfants);
	
	/**
	 * Créer une liste de paires d'individu à partir d'une liste d'individu
	 * @param individus : liste des individus à transformer en liste de paire
	 * @return paires_parents : liste de paires d'individus
	 */
	public List<Vector<Individu>> listToPaires(List<Individu> individus){
		
		Random rand = new Random();
		Individu selectedIndividu;
		List<Vector<Individu>> pairesParents = new ArrayList<>();
		
		while(!individus.isEmpty()) {
			
			Vector<Individu> paire = new Vector<>();
			
			for(int j=0; j<2; j++) {
				int randomIndex = rand.nextInt(individus.size());
		        selectedIndividu = individus.get(randomIndex);
		        individus.remove(selectedIndividu);
		        paire.add(selectedIndividu);
			}
			
			pairesParents.add(paire);		
		}
		
		return pairesParents;
	}

}
