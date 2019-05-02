package command;

public class FlipOffCommand implements Command {

	private Screen screen;
	
	public FlipOffCommand(Screen screen) {
		this.screen = screen;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		screen.screenDown();
		
	}

}
