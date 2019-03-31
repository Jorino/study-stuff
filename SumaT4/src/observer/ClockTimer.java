package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ClockTimer extends Observable{
	
	private int seconds;
	private int minutes;
	private int hours;
	
	private List<Observer> observers= new ArrayList<>();
	
	
	public ClockTimer() {
		runClock();
	}
	
	public void attach(Observer o) {
		this.observers.add(o);
	}
	
	public void detach(Observer o) {
		this.observers.remove(o);
	}

	public int getSeconds() {
		return seconds;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getHours() {
		return hours;
	}

	private void clockTime() {
		seconds +=1;
		
		if(seconds > 59) {
			minutes +=1;
			seconds = 0;
		}
		
		if(minutes > 59) {
			hours += 1;
			minutes = 0;
		}
	}
	
	void tick() {
		clockTime();
		
		for(Observer o : observers) {
			o.update(this, null);
		}
	}
	
	private void runClock() {
		
		new Thread(() -> {
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				tick();
			}
		}).start();
	}
	
	
	

}
