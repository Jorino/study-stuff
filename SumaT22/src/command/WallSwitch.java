package command;

public class WallSwitch {
	
	Command cmd;
	
	public WallSwitch(Command cmd) {
		this.cmd = cmd;
	}
	
	public void flipSwitch() {
		cmd.execute();
	}

}
