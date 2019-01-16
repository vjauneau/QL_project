package Class;

import java.util.List;

/**
* Class EvaluationThread : Thread d'�valuation
* @author L�o Courson
* @version 1.0
* @since 1.0
* @see Evaluation
*/
public class EvaluationThread extends Thread {

	private List<Individu> unevaluatedIndividus;
	
	/**
	* Constructeur de EvaluationThread : cr�er un thread d'�valuation
	* @param individus : Liste des individus � �valuer
	*/
	public EvaluationThread(List<Individu> individus) {
		
		this.unevaluatedIndividus = individus;
	}
	
	/**
	* Fonctionnement d'un thread d'�valuation
	* @see Individu.evaluer(), Individu.setScore()
	*/
	@Override
	public void run() {
		
		Individu ind = null;
		Boolean listEmpty = false;
		
		while(!listEmpty) {
			synchronized(this.unevaluatedIndividus) {
				if(!this.unevaluatedIndividus.isEmpty()) {
					ind = this.unevaluatedIndividus.get(0);
					this.unevaluatedIndividus.remove(ind);
				}
				else listEmpty = true;				
			}
			if(ind != null)ind.setScore(ind.evaluer());
		}
	}
}
