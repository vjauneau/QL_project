package Applicatif;

import Class.Algo;
import Class.Individu;
import Class.Remplacement;
import Class.RemplacementAleatoire;
import Class.RemplacementRang;
import Class.Selection;
import Class.SelectionRang;
import Class.SelectionTournoi;
import UI.UI;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Algo algo = new Algo();
		
		UI ui = new UI();
		
		ui.test(algo);
		
		Individu myInd = new MyInd();
		Selection selection = new SelectionTournoi();
		Remplacement remplacement = new RemplacementRang();		
		
		Algo algo = new Algo();
		
		algo.run(myInd, selection, remplacement);
	}

}
