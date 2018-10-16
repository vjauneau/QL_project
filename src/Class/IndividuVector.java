package Class;
import java.util.ArrayList;
import java.util.Vector;

public class IndividuVector extends Individu {
	
	private Vector<Integer> vector;

	public IndividuVector() {
		
	}
	
	public IndividuVector(Vector<Integer> vector) {
		this.vector = vector;
	}
	
	public Vector<Integer> getVector() {
		return vector;
	}

	public void setVector(Vector<Integer> vector) {
		this.vector = vector;
	}

	@Override
	public int evaluer() {
		
		return this.vector.get(0)^2 - this.vector.get(1)^2;
	}
	
	

}
