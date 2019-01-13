package Class;

import java.util.List;

/**
* Class EvaluationThread : Thread d'évaluation.
* @author Léo Courson
* @version 1.0
* @since 1.0
*/
public class EvaluationThread extends Thread {

	private List<Individu> unevaluated_individus;
	
	/**
	* Constructeur de EvaluationThread : créer un thread d'évaluation.
	* @param1 individus : Liste d'individu à évaluer.
	* @author Léo Courson
	* @version 1.0
	* @since 1.0
	*/
	public EvaluationThread(List<Individu> individus) {
		
		this.unevaluated_individus = individus;
	}
	
	/**
	* Fonctionnement d'un thread d'évaluation.
	* @author Léo Courson
	* @version 1.0
	* @since 1.0
	*/
	public void run() {
		
		Individu ind;
		while(!unevaluated_individus.isEmpty()) {
			synchronized(unevaluated_individus) {
				ind = unevaluated_individus.get(0);
				unevaluated_individus.remove(ind);
			}
			ind.setScore(ind.evaluer());
		}
	}
}
