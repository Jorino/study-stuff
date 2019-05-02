package command;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Screen screen = new Screen();
		Command switchUp = new FlipOnCommand(screen);
		Command switchDown = new FlipOffCommand(screen);
		
		WallSwitch w1Switch = new WallSwitch(switchUp);
		WallSwitch w2Switch = new WallSwitch(switchDown);
		
		w1Switch.flipSwitch();
		w2Switch.flipSwitch();

	}

}
