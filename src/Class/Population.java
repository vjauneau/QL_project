package Class;

import java.util.ArrayList;
import java.util.List;

import Applicatif.MyInd;
/**
* Class population contient la liste d'individu, le nombre et g�n�re la population
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
*/
public class Population {

	private MyInd myInd ;
	private List<Individu> population;
	private int nbIndividu = 0;
	
	/**
	* Constructeur de population g�n�re la population
	* @param1 nbIndividu : nombre d'individus dans la population
	* @param2 myInd: Individu de r�f�nrece myIndividu
	* @author Vincent Jauneau
	* @version 1.0
	* @since 1.0
	*/
	public Population(int nbIndividu, Individu myInd) {
		
		this.population = new ArrayList<Individu>();
		this.nbIndividu = nbIndividu;
		this.myInd = (MyInd) myInd;
		this.generatePopulation();
		
	}
	
	
	/**
	* G�n�re la population en fonction du nombre d'individus
	* @author Vincent Jauneau
	* @version 1.0
	* @since 1.0
	*/
	private void generatePopulation() {
		for(int i = 0 ; i < this.nbIndividu; i++) {
			this.population.add(new MyInd(myInd.createIndividu()));
		}
	}
	
	
	/**
	* Fonction getIndividu, retourne l'individu � l'idx sp�cifi� de la liste
	* @param1 idx: index de la liste � retourner 
	* @return un Individu ou null si idx inexistant
	* @author Vincent Jauneau
	* @version 1.0
	* @since 1.0
	*/
	public Individu getIndividu(int idx) {
		return this.population.get(idx);
	}
	
	/**
	* Fonction setPopulation, set la population 
	* @param List<Individu> d�finissant la population
	* @author Vincent Jauneau
	* @version 1.0
	* @since 1.0
	*/
	public void setPopulation(List<Individu> inds) {
		this.population = inds;
	}
	
	/**
	* Fonction getPopulation, retourne la population
	* @return List<Individu> d�finissant la population
	* @author Vincent Jauneau
	* @version 1.0
	* @since 1.0
	*/
	public List<Individu> getPopulation(){
		return this.population;
	}
	
	
}
