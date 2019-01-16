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
		 * - Modifiez les paramètres de l'algorithme avec les méthode de AlgoBuilder.
		 * - Les méthodes optionnelle peuvent être mises en commentaire.
		 * - Il doit y avoir au moins une stop condition de renseignée.
		 */
		Algo algo = new AlgoBuilder()
				// Population paramètres
				.populationSize(10000)
				.individu(new MyInd())
				
				// Evaluation paramètre
				.nThread(4)  				// Optionnel
				
				// Selection paramètre
				.selection(new SelectionRang())
				
				// Evolution paramètres
                .nEnfants(1000)
                .pourcentageMutation(4)  	// Optionnel
                
                // Remplacement paramètre
                .remplacement(new RemplacementRang())
                
                // Conditions d'arrêt paramètres
                // /!\ UNE CONDITION D'ARRET MINIMUM
                .nIteration(100)  			// Optionnel
                .nIterationSamePop(100)  	// Optionnel
                .nIterationSameWinner(100)  // Optionnel
                .timerSecond(3000)  		// Optionnel (temps en seconde)
                
                // Creation de l'Algo
                .buildAlgo();

		// Population finale après éxécution de l'Algo
		Population populationFinale = algo.run();
		
	}
}
