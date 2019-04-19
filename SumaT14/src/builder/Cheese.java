package builder;

public class Cheese {

	private String type;
	
	public Cheese(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return type;
	}

}
