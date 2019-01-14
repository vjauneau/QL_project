package Class;

import java.util.List;

/**
* Class EvaluationThread : Thread d'évaluation
* @author Léo Courson
* @version 1.0
* @since 1.0
* @see Evaluation
*/
public class EvaluationThread extends Thread {

	private List<Individu> unevaluated_individus;
	
	/**
	* Constructeur de EvaluationThread : créer un thread d'évaluation
	* @param individus : Liste des individus à évaluer
	*/
	public EvaluationThread(List<Individu> individus) {
		
		this.unevaluated_individus = individus;
	}
	
	/**
	* Fonctionnement d'un thread d'évaluation
	* @see Individu.evaluer(), Individu.setScore()
	*/
	public void run() {
		
		Individu ind = null;
		Boolean list_empty = false;
		
		while(!list_empty) {
			synchronized(unevaluated_individus) {
				if(!unevaluated_individus.isEmpty()) {
					ind = unevaluated_individus.get(0);
					unevaluated_individus.remove(ind);
				}
				else list_empty = true;				
			}
			if(ind != null)ind.setScore(ind.evaluer());
		}
	}
}
