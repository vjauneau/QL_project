package Class;

import java.util.ArrayList;
import java.util.List;

/**
* Class Evaluation : Créer les threads pour évaluer une population.
* @author Léo Courson
* @version 1.0
* @since 1.0
*/
public class Evaluation {
	
	private List<Individu> individus;
	private List<Thread> threads;
	
	/**
	* Constructeur de Evaluation : créer les threads.
	* @param1 pop : Population de la simulation à évaluer.
	* @param2 nb_thread : Nombre de thread à créer.
	* @author Léo Courson
	* @version 1.0
	* @since 1.0
	*/
	public Evaluation(Population pop, int nb_thread) {
		
		this.individus = new ArrayList<>(pop.getPopulation());
		this.threads = new ArrayList<>();
		
		for(int i=0; i<nb_thread; i++) {
			this.threads.add(new EvaluationThread(individus));
		}
	}
	
	/**
	* Lance les threads pour évaluer la population pop.
	* @author Léo Courson
	* @version 1.0
	* @since 1.0
	*/
	public void evaluer() {
		try {
			for(Thread thread : threads) {
				thread.start();
			}
			for(Thread thread : threads) {
				thread.join();
			}
		} 
		
		catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
}
