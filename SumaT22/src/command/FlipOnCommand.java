package command;

public class FlipOnCommand implements Command {
	
	private Screen screen;
	
	public FlipOnCommand(Screen screen) {
		this.screen = screen;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		screen.screenUp();
		
	}

}
