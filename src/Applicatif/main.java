package Applicatif;

import Class.Algo;
import Class.Individu;
import Class.Remplacement;
import Class.RemplacementRang;
import Class.Selection;
import Class.SelectionRang;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Individu myInd = new MyInd();
		Selection selection = new SelectionRang();
		Remplacement remplacement = new RemplacementRang();
		
		Algo algo = new Algo();
		
		algo.run(myInd, selection, remplacement);

		
	}

}
