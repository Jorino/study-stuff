package chainofresponsibility;

abstract class RaiseHandler {
	
	protected RaiseHandler successor;
	
	public void setSuccessor(RaiseHandler successor) {
		this.successor = successor;
	}
	
	abstract public void processRequest(Request req);

}
