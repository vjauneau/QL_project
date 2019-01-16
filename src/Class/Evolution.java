package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import Applicatif.MyInd;

/**
 * R�alise le croisement de paire d'individu pour en cr�er de nouveau
 * @author Quentin Chouteau
 * @version 1.0
 * @since 1.0
 */
public class Evolution {

    /**
     * Classe qui g�re l'�volution de la population (croisement & mutation)
     * @param pairesParents : paires de parents, nbEnfants; pourcentage de mutation
     * @return List<Individu>  : liste des enfants cr�er par le croisement
     */
	public List<Individu> croisementMutationIndividus(List<Vector<Individu>> pairesParents, int nbEnfants, double pourcentage) {
		
		List<Individu> enfants = new ArrayList<>();
		
		Random rand = new Random();
		
		/**
		 * Croisement entre 2 individus
		 * On parcourt la liste de paires d'individu et on les fait croiser
		 */
		for(Vector<Individu> v : pairesParents)
		{
			enfants.add(new MyInd(v.get(0).getGene(0), v.get(1).getGene(1)));
			if(enfants.size() < nbEnfants)
			{
				enfants.add(new MyInd(v.get(1).getGene(0), v.get(0).getGene(1)));
			}	
		}
		
		/**
		 * Mutation �ventuelle des enfants
		 * Le pourcentage de mutation est d�finie par l'utilisateur
		 */
		for(Individu i : enfants)
		{	
			//Le pourcentage de mutation est d�fini par l'utilisateur
			if (rand.nextInt(100) <= pourcentage)
			{
				//On choisi le g�ne mutant de mani�re al�atoire
				i.setGene(rand.nextInt(2), rand.nextInt(31));
			}
		}
		return enfants;
	}

}
