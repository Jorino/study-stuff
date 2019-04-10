package chainofresponsibility;

public class Manager extends RaiseHandler {
	
	private double limit = 2.0;

	@Override
	public void processRequest(Request req) {
		// TODO Auto-generated method stub
		if(req.getPercentage() <= limit) {
			System.out.println("Manager gives a " + req.getPercentage() +"% raise to the employee!\n");
		} else if(successor != null) {
			successor.processRequest(req);
		}
		
	}

}
