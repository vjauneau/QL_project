package Class;

import java.util.ArrayList;
import java.util.List;

import Applicatif.MyInd;

public class Population {

	private MyInd myInd ;
	private List<Individu> population;
	private int nbIndividu = 0;
	
	public Population(int nbIndividu, Individu myInd) {
		
		this.population = new ArrayList<Individu>();
		this.nbIndividu = nbIndividu;
		this.myInd = (MyInd) myInd;
		this.generatePopulation();
		
	}
	
	private void generatePopulation() {
		for(int i = 0 ; i < this.nbIndividu; i++) {
			this.population.add(new MyInd(myInd.createIndividu()));
		}
	}
	
	public Individu getIndividu(int idx) {
		return this.population.get(idx);
	}
	
	public void setPopulation(List<Individu> inds) {
		this.population = inds;
	}
	
	public List<Individu> getPopulation(){
		return this.population;
	}
	
	
}
