package chainofresponsibility;

public class ChiefExecutiveOfficer extends RaiseHandler{

	@Override
	public void processRequest(Request req) {
		// TODO Auto-generated method stub
		System.out.println("CEO gives a substantial raise of " + req.getPercentage() + "% to the employee!!\n");
		
	}

}
