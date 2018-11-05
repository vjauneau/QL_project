package Class;

import java.util.List;
import factory.Piece;

/**
* Classe abstraite : Strategy de s�lection
* @author L�o Courson
* @version 1.0
* @since 1.0
*/

public abstract class Selection {
	/*    
    selection : que pour croisement (renvoie les paires d'individu � croiser)
	 */
	
	public abstract List<Individu> selectionPaires(Population pop);
}
