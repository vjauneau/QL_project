package Class;

import Applicatif.MyInd;

/**
* Réalise la mutation des individus
* https://www.slauncha.com/index.php?article63/creation-d-un-algorithme-genetique
* @author Quentin Chouteau
* @version 1.0
* @since 1.0
* @see Evolution
*/
public class Mutation extends Evolution {

	/**
	* 
	* @param ind : 
	*/
	public static void mutation(MyInd ind) {
		
		for (int i = 0; i < 10; i++) {
			if (Math.random() <= 0.03) {
				byte gene = (byte) Math.round(Math.random());
				//ind.setGene(i, gene);
			}
		}
	}

}
