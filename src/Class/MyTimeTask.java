package Class;

import java.util.Timer;
import java.util.TimerTask;

/**
* MyTimeTask est une classe qui sera passé au paramètre du timer afin 
* d'éxecuter sa fonction run() à la fin de celui ci.
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
* @see Algo
*/
public class MyTimeTask extends TimerTask {
	
	private Algo algo;
	
	/**
	* Constructeur de MyTimeTask
	* @param algo : Référence sur l'algorithme
	*/
	public MyTimeTask(Algo algo) {

		this.algo = algo;
	}
	
	/**
	* Tache asynchrone afin de valider que le timer est fini
	*/
	@Override
	public void run() {
		System.out.println("validate Timer");
		this.algo.setTimerValidate(true);
	}
}
