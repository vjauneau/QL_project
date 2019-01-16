package Class;

import java.util.ArrayList;
import java.util.List;

import Applicatif.MyInd;
/**
* Class population contient la liste d'individu, le nombre et génère la population
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
*/
public class Population {

	private MyInd myInd ;
	private List<Individu> population;
	private int nbIndividu = 0;
	
	/**
	* Constructeur de population génère la population
	* @param nbIndividu : nombre d'individus dans la population
	* @param myInd: Individu de réfénrece myIndividu
	*/
	public Population(int nbIndividu, Individu myInd) {
		
		this.population = new ArrayList<Individu>();
		this.nbIndividu = nbIndividu;
		this.myInd = (MyInd) myInd;
		this.generatePopulation();
	}
	
	/**
	* Constructeur de population génère la population
	* @param pop : individus constituant la population
	*/
	public Population(List<Individu> pop) {

		this.population = pop;
		this.nbIndividu = pop.size();
	}
	
	/**
	* Génère la population en fonction du nombre d'individus
	* @see MyInd#createIndividu()
	*/
	private void generatePopulation() {

		for(int i = 0 ; i < this.nbIndividu; i++) {
			this.population.add(new MyInd(myInd.createIndividu()));
		}
	}
	
	/**
	* Fonction getIndividu, retourne l'individu à l'idx spécifié de la liste
	* @param idx: index de la liste à retourner 
	* @return un Individu ou null si idx inexistant
	*/
	public Individu getIndividu(int idx) {

		return this.population.get(idx);
	}
	
	/**
	* Fonction getMoreCompetent, retourne l'individu avec le plus haut score
	* @return Individu : individu avec le plus haut score parmis la population
	*/
	public Individu getMoreCompetent() {

        Individu moreCompetent = this.getIndividu(0);
        // Loop through individuals to find more competent
        for (int i = 0; i < this.nbIndividu; i++) {
            if (moreCompetent.getScore() <= this.getIndividu(i).getScore()) {
                moreCompetent = this.getIndividu(i);
            }
        }
        return moreCompetent;
	}
	
	/**
	* Fonction getPopulation, retourne la population
	* @return List : individus constituant la population
	*/
	public List<Individu> getPopulation(){

		return this.population;
	}
	
	/**
	* Fonction setPopulation, set la population 
	* @param inds : individus composant la population
	*/
	public void setPopulation(List<Individu> inds) {

		this.population = inds;
	}

	/**
	* Fonction getNbIndividu, retourne la taille de la population
	* @return int : taille de la population
	*/
	public int getNbIndividu() {

		return nbIndividu;
	}
	
	/**
	* Fonction setNbIndividu, set la taille de la population
	* @param nbIndividu : taille de la population
	*/
	public void setNbIndividu(int nbIndividu) {

		this.nbIndividu = nbIndividu;
	}

}
