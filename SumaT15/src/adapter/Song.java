package adapter;

public class Song implements Music{
	
	private double length;
	private String key;
	private String name; 
	private int notepages;
	
	public Song(String name, String key, int notepages, double length) {
		this.name = name;
		this.key=key;
		this.notepages = notepages;
		this.length = length;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public double getLength() {
		return length;
	}

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public int getNotepages() {
		return notepages;
	}

}
