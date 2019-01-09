package Class;

public class Evaluation extends Thread {
	
	protected int pop_index;
	private Thread thread;
	private Population pop;
	
	public Evaluation(Population pop) {
		this.pop = pop;
		
		for(Individu ind : pop.getPopulation()) {
			ind.setScore(ind.evaluer());
		}
		
		//this.pop_index = 

		//this.thread.start();
	}
	
	public void run() {
		
	}

}
