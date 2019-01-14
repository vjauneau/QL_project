package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import Applicatif.MyInd;

/**
 * Réalise le croisement de paire d'individu pour en créer de nouveau
 * @author Quentin Chouteau
 * @version 1.0
 * @since 1.0
 * @see Evolution
 */
public class Croisement extends Evolution {

    /**
     * Croise des idnividus (les parents) pour créer de nouveau individus (les enfants)
     * @param pairesParents : paires de parents
     * @return List<Individu>  : liste des enfants créer par le croisement
     */
	public List<Individu> croisementIndividus(List<Vector<Individu>> pairesParents) {
		
		List<Individu> enfants = new ArrayList<>();
		for(Vector<Individu> v : pairesParents)
		{
			enfants.add(new MyInd(v.get(0).getGene(0), v.get(1).getGene(1)));
			enfants.add(new MyInd(v.get(1).getGene(0), v.get(0).getGene(1)));	
		}
		
		/** Tests **/
		int j=1;
		/*for(Individu i : enfants) {	
			System.out.println("Enfant " + j+ ": [" +i.getGene(0) +"," + i.getGene(1) + "]");
			j++;
		}*/
		
		return enfants;
	}

}
