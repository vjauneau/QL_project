package Class;

import Applicatif.MyInd;

/**
* Classe AlgoBuilder, permet de construire un Algo de mani�re flexible
* @author L�o Courson
* @version 1.0
* @since 1.0
* @see Algo
*/
public class AlgoBuilder {

	// Param�tres de l'Algo.
	private Integer populationSize;
	private Integer nEnfants;
	private Integer pourcentageMutation = 3;
	private Integer nThread = 4;
	private Individu individu = new MyInd();
	private Selection selection;
	private Remplacement remplacement;

	// Stop conditions.
	private Integer nIteration = null;
	private Integer nIterationSamePop = null;
	private Integer nIterationSameWinner = null;
	private Integer timerSecond = null;

    public AlgoBuilder() { }

    /**
	* Cr�er un Algo avec les param�tres de la classe
	* @return Algo : algorithme cr��
	*/
    public Algo buildAlgo()
    {
    	if(nIteration==null || nIterationSamePop==null || nIterationSameWinner==null || timerSecond==null) {
    		throw new IllegalStateException("/!\\ Aucune condition d'arr�t renseign�e.");
    	}
    	
    	return new Algo(this.nEnfants,
    					this.pourcentageMutation,
    					this.nThread,
    					this.populationSize,
    					this.nIteration,
    					this.nIterationSamePop,
    					this.nIterationSameWinner,
    					this.timerSecond,
    					this.individu,
    					this.selection,
    					this.remplacement);
    }
    
    /**
	* D�finit la taille de la population
	* @param _populationSize : taille de la population
	* @return AlgoBuilder : Builder of the Algo
	*/
    public AlgoBuilder populationSize(Integer _populationSize)
    {
        this.populationSize = _populationSize;
        return this;
    }

    /**
	* D�finit le nombre d'individu qui �volue (les enfants)
	* @param _nEnfants : nombre d'individu qui �volue
	* @return AlgoBuilder : Builder of the Algo
	*/
    public AlgoBuilder nEnfants(Integer _nEnfants)
    {
        this.nEnfants = _nEnfants;
        return this;
    }
    
    /**
	* D�finit le pourcentage de mutation au sein de la population
	* @param _pourcentageMutation : pourcentage de mutation
	* @return AlgoBuilder : Builder of the Algo
	*/
    public AlgoBuilder pourcentageMutation(Integer _pourcentageMutation)
    {
    	if(_pourcentageMutation > 100 || _pourcentageMutation < 0) {
    	    throw new IllegalStateException("/!\\ pourcentageMutation doit �tre un pourcentage.");
    	 }
        this.pourcentageMutation = _pourcentageMutation;
        return this;
    }
    
    /**
	* D�finit le nombre de Thread utilis� lors de la s�lection
	* @param _nThread : nombre de Thread
	* @return AlgoBuilder : Builder of the Algo
	*/
    public AlgoBuilder nThread(Integer _nThread)
    {
        this.nThread = _nThread;
        return this;
    }
	
    /**
	* D�finit l'individu de r�f�rence de l'Algo
	* @param _individu : individu de r�f�rence
	* @return AlgoBuilder : Builder of the Algo
	* @see Individu
	*/
	public AlgoBuilder individu(Individu _individu)
    {
        this.individu = _individu;
        return this;
    }
	
	/**
	* D�finit le mode de s�lection
	* @param _selection : mode de s�lection
	* @return AlgoBuilder : Builder of the Algo
	* @see Selection
	*/
	public AlgoBuilder selection(Selection _selection)
    {
        this.selection = _selection;
        return this;
    }
	
	/**
	* D�finit le mode de remplacement
	* @param _remplacement : mode de remplacement
	* @return AlgoBuilder : Builder of the Algo
	* @see Remplacement
	*/
	public AlgoBuilder remplacement(Remplacement _remplacement)
    {
        this.remplacement = _remplacement;
        return this;
    }
    
	/**
	* D�finit le nombre d'iteration de la condition d'arr�t StopConditionNIteration
	* @param _nIterationSamePop : nombre d'iteration
	* @return AlgoBuilder : Builder of the Algo
	* @see StopConditionNIteration
	*/
    public AlgoBuilder nIteration(Integer _nIteration)
    {
        this.nIteration = _nIteration;
        return this;
    }
    
    /**
	* D�finit le nombre d'iteration de la condition d'arr�t StopConditionSamePopulation
	* @param _nIterationSamePop : nombre d'iteration
	* @return AlgoBuilder : Builder of the Algo
	* @see StopConditionSamePopulation
	*/
    public AlgoBuilder nIterationSamePop(Integer _nIterationSamePop)
    {
        this.nIterationSamePop = _nIterationSamePop;
        return this;
    }
    
    /**
	* D�finit le nombre d'iteration de la condition d'arr�t StopConditionSameWinner
	* @param _nIterationSameWinner : nombre d'iteration
	* @return AlgoBuilder : Builder of the Algo
	* @see StopConditionSameWinner
	*/
    public AlgoBuilder nIterationSameWinner(Integer _nIterationSameWinner)
    {
        this.nIterationSameWinner = _nIterationSameWinner;
        return this;
    }
    
    /**
	* D�finit le temps de la condition d'arr�t StopConditionTimer
	* @param _timerSecond : temps (secondes) de la condition d'arr�t
	* @return AlgoBuilder : Builder of the Algo
	* @see StopConditionTimer
	*/
    public AlgoBuilder timerSecond(Integer _timerSecond)
    {
        this.timerSecond = _timerSecond;
        return this;
    }

}
