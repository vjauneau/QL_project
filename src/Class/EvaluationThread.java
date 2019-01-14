package Class;

import java.util.List;

/**
* Class EvaluationThread : Thread d'�valuation.
* @author L�o Courson
* @version 1.0
* @since 1.0
*/
public class EvaluationThread extends Thread {

	private List<Individu> unevaluated_individus;
	
	/**
	* Constructeur de EvaluationThread : cr�er un thread d'�valuation.
	* @param1 individus : Liste des individus � �valuer.
	* @author L�o Courson
	* @version 1.0
	* @since 1.0
	*/
	public EvaluationThread(List<Individu> individus) {
		
		this.unevaluated_individus = individus;
	}
	
	/**
	* Fonctionnement d'un thread d'�valuation.
	* @author L�o Courson
	* @version 1.0
	* @since 1.0
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
