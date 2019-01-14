package Class;

import Applicatif.MyInd;
/**
 * 
 * @author qchouteau
 * https://www.slauncha.com/index.php?article63/creation-d-un-algorithme-genetique
 *
 */
public class Mutation extends Evolution {

	public static void mutation(MyInd indiv) {
		
		for (int i = 0; i < 10; i++) {
			if (Math.random() <= 0.03) {
				byte gene = (byte) Math.round(Math.random());
				//indiv.setGene(i, gene);
			}
		}
	}

}
