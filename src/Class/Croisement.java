package Class;

import Applicatif.MyInd;

/**
 * 
 * @author qchouteau
 * https://www.slauncha.com/index.php?article63/creation-d-un-algorithme-genetique
 *
 */
public class Croisement extends Evolution {

	/**
	 * 
	 * @param indiv1
	 * @param indiv2
	 * @return
	 */
	private static final double uniformRate = 0.5;
    private static final double mutationRate = 0.00015;
    
	static MyInd Croisement(MyInd indiv1, MyInd indiv2) {
		MyInd newInd = new MyInd() {
		};
		// pour chaque gène
		for (int i = 0; i < 10 ; i++) {
			// Crossover
			if (Math.random() <= uniformRate) {
				//newInd.setGene(i, indiv1.getGene(i));
			} else {
				//newInd.setGene(i, indiv2.getGene(i));
			}
		}
		return newInd;
	}

}
