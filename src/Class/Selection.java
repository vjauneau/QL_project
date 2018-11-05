package Class;

import java.util.List;
import factory.Piece;

/**
* Classe abstraite : Strategy de sélection
* @author Léo Courson
* @version 1.0
* @since 1.0
*/

public abstract class Selection {
	/*    
    selection : que pour croisement (renvoie les paires d'individu à croiser)
	 */
	
	public abstract List<Individu> selectionPaires(Population pop);
}
