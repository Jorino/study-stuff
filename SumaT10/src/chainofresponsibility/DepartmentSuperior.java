package chainofresponsibility;

public class DepartmentSuperior extends RaiseHandler{
	
	private double limit = 5.0;

	@Override
	public void processRequest(Request req) {
		// TODO Auto-generated method stub
		if(req.getPercentage() < limit) {
			System.out.println("Department superior gives a "+req.getPercentage() + "% raise to the employee!\n");
		} else if(successor != null) {
			successor.processRequest(req);
		}
		
	}

}
