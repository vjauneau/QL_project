package Applicatif;

import Class.Algo;
import Class.AlgoBuilder;
import Class.Individu;
import Class.Population;
import Class.Remplacement;
import Class.RemplacementAleatoire;
import Class.RemplacementRang;
import Class.Selection;
import Class.SelectionRang;
import Class.SelectionTournoi;

public class main {

	public static void main(String[] args) {	
		
		/**
		 * Creation de l'algorithme avec la classe AlgoBuilder.
		 * - Modifiez les param�tres de l'algorithme avec les m�thode de AlgoBuilder.
		 * - Les m�thodes optionnelle peuvent �tre mises en commentaire.
		 * - Il doit y avoir au moins une stop condition de renseign�e.
		 */
		Algo algo = new AlgoBuilder()
				// Population param�tres
				.populationSize(10000)
				.individu(new MyInd())
				
				// Evaluation param�tre
				.nThread(4)  				// Optionnel
				
				// Selection param�tre
				.selection(new SelectionRang())
				
				// Evolution param�tres
                .nEnfants(1000)
                .pourcentageMutation(4)  	// Optionnel
                
                // Remplacement param�tre
                .remplacement(new RemplacementRang())
                
                // Conditions d'arr�t param�tres
                // /!\ UNE CONDITION D'ARRET MINIMUM
                .nIteration(100)  			// Optionnel
                .nIterationSamePop(100)  	// Optionnel
                .nIterationSameWinner(100)  // Optionnel
                .timerSecond(3000)  		// Optionnel (temps en seconde)
                
                // Creation de l'Algo
                .buildAlgo();

		// Population finale apr�s �x�cution de l'Algo
		Population populationFinale = algo.run();
		
	}
}
