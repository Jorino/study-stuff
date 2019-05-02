package facade;

public class CPU {
	
	public void freeze() {
		System.out.println("Processor is frozen...\n");
	}
	
    public void jump(long position) {
    	System.out.println("\nMoved to: " + position + " position.");
    }
    
    public void execute() {
    	System.out.println("\nTASK COMPLETED");
    }

}
