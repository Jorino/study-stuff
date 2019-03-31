package observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer{
	
	private ClockTimer timer;
	
	public DigitalClock(ClockTimer ct) {
		timer = ct;
		timer.attach(this);
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o == timer) {
			draw();
		}
	}
	
	private void draw() {
		int hours = timer.getHours();
		int minutes = timer.getMinutes();
		int seconds = timer.getSeconds();
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}

}
