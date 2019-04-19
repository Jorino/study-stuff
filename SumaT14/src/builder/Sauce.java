package builder;

public class Sauce {

	private String type;
	
	public Sauce(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return type;
	}

}
