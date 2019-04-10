package chainofresponsibility;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager mg = new Manager();
		DepartmentSuperior dp = new DepartmentSuperior();
		ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();
		
		mg.setSuccessor(dp);
		dp.setSuccessor(ceo);
		
		Request req = new Request(2.0);
		
		mg.processRequest(req);
		
		req.setPercentage(3.5);
		mg.processRequest(req);
		
		req.setPercentage(5.0);
		mg.processRequest(req);

	}

}
