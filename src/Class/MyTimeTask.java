package Class;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimeTask extends TimerTask {
	
	Algo algo;
	
	public MyTimeTask(Algo algo) {
		 this.algo = algo;
	 }
	 
	@Override
	public void run() {
		
		this.algo.setTimerValidate(true);
		
	}
	
	

}
