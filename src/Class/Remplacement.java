package Class;

/**
* Classe abstraite : Strategie de remplacement
* @author Vincent Jauneau
* @version 1.0
* @since 1.0
* @see RemplacementAleatoire
* @see RemplacementRang
*/
public abstract interface Remplacement {
	
	/**
	 * M�thode abstraite remplacer
	 * Remplace des individus de l'ancienne population par des individus d'une nouvelle
	 * @param oldpop : ancienne population
	 * @param ajout : nouvelle population
	 * @return Population : nouvelle population
	 */
	public abstract Population remplacer(Population oldpop, Population ajout);
}
