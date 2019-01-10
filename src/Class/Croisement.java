package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import Applicatif.MyInd;

/**
 * Classe qui permet de réaliser le croisement entre une paire d'invidu
 * @author Quentin Chouteau
 * @version 1.0
 * @since 1.0
 */
public class Croisement extends Evolution {
    /**
     * 
     * @param En entrée on récupère les apires de parents
     * @return enfants. On retourne la liste des enfants créer par ce croisement
     */
	public  List<Individu> croisementIndividus(List<Vector<Individu>> pairesParents) {
		
		List<Individu> enfants = new ArrayList<>();
		for(Vector<Individu> v : pairesParents)
		{
			enfants.add(new MyInd(v.get(0).getGene(0), v.get(1).getGene(1)));
			enfants.add(new MyInd(v.get(1).getGene(0), v.get(0).getGene(1)));	
		}
		
		/** Tests **/
		int j=1;
		for(Individu i : enfants) {	
			System.out.println("Enfant " + j+ ": [" +i.getGene(0) +"," + i.getGene(1) + "]");
			j++;
		}
		
		return enfants;
	}

}
