package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

import Applicatif.MyInd;

/**
 * Réalise le croisement de paire d'individu pour en créer de nouveau
 * @author Quentin Chouteau
 * @version 1.0
 * @since 1.0
 */
public class Evolution {

    /**
     * Classe qui gère l'évolution de la population (croisement & mutation)
     * @param pairesParents : paires de parents, nbEnfants; pourcentage de mutation
     * @return List<Individu>  : liste des enfants créer par le croisement
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
		 * Mutation éventuelle des enfants
		 * Le pourcentage de mutation est définie par l'utilisateur
		 */
		for(Individu i : enfants)
		{	
			//Le pourcentage de mutation est défini par l'utilisateur
			if (rand.nextInt(100) <= pourcentage)
			{
				//On choisi le gène mutant de manière aléatoire
				i.setGene(rand.nextInt(2), rand.nextInt(31));
			}
		}
		return enfants;
	}

}
