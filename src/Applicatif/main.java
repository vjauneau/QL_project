package Applicatif;

import Class.Algo;
import Class.Individu;
import Class.Remplacement;
import Class.RemplacementAleatoire;
import Class.RemplacementRang;
import Class.Selection;
import Class.SelectionRang;
import Class.SelectionTournoi;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Individu myInd = new MyInd();
		Selection selection = new SelectionTournoi();
		Remplacement remplacement = new RemplacementRang();
		
		Algo algo = new Algo();
		
		algo.run(myInd, selection, remplacement);

		
	}

}
