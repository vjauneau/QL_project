package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

/**
* Classe abstraite : Strategie de s�lection
* @author L�o Courson
* @version 1.0
* @since 1.0
* @see SelectionRang
* @see SelectionTournoi
* @see SelectionUniforme
*/
public abstract class Selection {
	
	/**
	 * M�thode abstraite selectionPaires
	 * S�lectionne les parents � partir d'une population et d'une loi de s�lection
	 * @param pop : population de la simulation
	 * @param nbEnfants : nombre de nouveaux individus dans la population
	 * @return liste de paires d'individus
	 */
	public abstract List<Vector<Individu>> selectionPaires(Population pop, Integer nbEnfants);
	
	/**
	 * Cr�er une liste de paires d'individu � partir d'une liste d'individu
	 * @param individus : liste des individus � transformer en liste de paire
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
